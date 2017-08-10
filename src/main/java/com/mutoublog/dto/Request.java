package com.mutoublog.dto;

public class Request<T> extends BaseRequest {
    private static final long serialVersionUID = 1L;
    private T data;

    public Request() {
    }

    public Request(T data) {
        this.data = data;
    }

    public static <T> Request<T> create() {
        Request<T> result = new Request();
        return result;
    }

    public Request<T> sid(String sid) {
        this.setSid(sid);
        return this;
    }

    public Request<T> data(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
