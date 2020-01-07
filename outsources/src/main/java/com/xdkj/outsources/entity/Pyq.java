package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
@author wc
@create 2020-01-07-9:52
*/
public class Pyq implements Serializable {
    private Integer pyqId;

    private String pydText;

    private Integer pyqPerson;

    private static final long serialVersionUID = 1L;

    public Integer getPyqId() {
        return pyqId;
    }

    public void setPyqId(Integer pyqId) {
        this.pyqId = pyqId;
    }

    public String getPydText() {
        return pydText;
    }

    public void setPydText(String pydText) {
        this.pydText = pydText;
    }

    public Integer getPyqPerson() {
        return pyqPerson;
    }

    public void setPyqPerson(Integer pyqPerson) {
        this.pyqPerson = pyqPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pyqId=").append(pyqId);
        sb.append(", pydText=").append(pydText);
        sb.append(", pyqPerson=").append(pyqPerson);
        sb.append("]");
        return sb.toString();
    }
}