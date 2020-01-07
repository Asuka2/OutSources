package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
@author wc
@create 2020-01-07-9:52
*/
public class Liuyan implements Serializable {
    private Integer lyId;

    private String lyText;

    private Integer lyPerson;

    private Integer lyPyq;

    private static final long serialVersionUID = 1L;

    public Integer getLyId() {
        return lyId;
    }

    public void setLyId(Integer lyId) {
        this.lyId = lyId;
    }

    public String getLyText() {
        return lyText;
    }

    public void setLyText(String lyText) {
        this.lyText = lyText;
    }

    public Integer getLyPerson() {
        return lyPerson;
    }

    public void setLyPerson(Integer lyPerson) {
        this.lyPerson = lyPerson;
    }

    public Integer getLyPyq() {
        return lyPyq;
    }

    public void setLyPyq(Integer lyPyq) {
        this.lyPyq = lyPyq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lyId=").append(lyId);
        sb.append(", lyText=").append(lyText);
        sb.append(", lyPerson=").append(lyPerson);
        sb.append(", lyPyq=").append(lyPyq);
        sb.append("]");
        return sb.toString();
    }
}