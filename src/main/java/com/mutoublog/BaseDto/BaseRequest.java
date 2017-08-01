package com.mutoublog.BaseDto;

import java.io.Serializable;

public class BaseRequest implements Serializable {
    private static final long serialVersionUID = -4496867430298036989L;
    private String sid;

    public BaseRequest() {
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}