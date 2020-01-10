package com.xdkj.outsources.dto;

/**
 * @Author JCX
 * @create 2020-01-09 19:01
 */
//所有ajax请求返回类型，封装json结果
public class Result<T> {
    private Integer code;
    private T Data;
    private String stateInfo;

    public Result(Integer code, String stateInfo) {
        this.code = code;
        this.stateInfo = stateInfo;
    }

    public Result(T data, String stateInfo) {
        Data = data;
        this.stateInfo = stateInfo;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", Data=" + Data +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}
