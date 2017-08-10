package com.mutoublog.dto;

import java.util.List;
import java.util.Map;

public class Result<T> extends BaseResult {
    private T data;

    public Result() {
    }

    public static <T> Result<T> create() {
        Result<T> result = new Result();
        result.setSuccess(false);
        return result;
    }

    public Result<T> success() {
        this.success((T) null);
        return this;
    }

    public Result<T> success(T data) {
        this.setSuccess(true);
        this.data = data;
        return this;
    }

    public Result<T> fail(String code, String description) {
        this.setSuccess(false);
        this.setCode(code);
        this.setDescription(description);
        return this;
    }

    public Result<T> fail(String code) {
        this.fail(code, (String) null);
        return this;
    }

    public Result<T> code(String code) {
        this.setCode(code);
        return this;
    }

    public Result<T> description(String description) {
        this.setDescription(description);
        return this;
    }

    public Result<T> sid(String sid) {
        this.setSid(sid);
        return this;
    }

    public Result<T> data(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isFailedOrDataEmpty() {
        return this.isFailed() || this.isDataEmpty();
    }

    public boolean isDataEmpty() {
        if (this.data == null) {
            return true;
        } else if (this.data instanceof String) {
            String str = (String) this.data;
            return str.trim().equals("");
        } else if (this.data instanceof List) {
            List list = (List) this.data;
            return list.isEmpty();
        } else if (this.data instanceof Map) {
            Map<Object, Object> map = (Map) this.data;
            return map.isEmpty();
        } else if (this.data instanceof Object[]) {
            Object[] array = (Object[]) ((Object[]) this.data);
            return array.length == 0;
        } else {
            return false;
        }
    }
}