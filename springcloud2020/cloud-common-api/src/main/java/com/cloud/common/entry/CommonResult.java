package com.cloud.common.entry;

public class CommonResult<T> {

    private Integer id;

    private String statudCode;

    private T data;

    public CommonResult(Integer id, String statudCode) {
        this(id,statudCode,null);
    }

    public CommonResult(Integer id, String statudCode, T data) {
        this.id = id;
        this.statudCode = statudCode;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatudCode() {
        return statudCode;
    }

    public void setStatudCode(String statudCode) {
        this.statudCode = statudCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
