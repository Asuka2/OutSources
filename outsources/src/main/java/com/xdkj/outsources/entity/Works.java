package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-06 14:49
 */
public class Works implements Serializable {
    private Integer worksId;

    private String worksName;

    private String worksTrade;

    private String worksKeyword;

    private Integer worksHref;

    private Integer worksDuty;

    private String worksImage;

    private Integer worksPerson;

    private static final long serialVersionUID = 1L;

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksName() {
        return worksName;
    }

    public void setWorksName(String worksName) {
        this.worksName = worksName;
    }

    public String getWorksTrade() {
        return worksTrade;
    }

    public void setWorksTrade(String worksTrade) {
        this.worksTrade = worksTrade;
    }

    public String getWorksKeyword() {
        return worksKeyword;
    }

    public void setWorksKeyword(String worksKeyword) {
        this.worksKeyword = worksKeyword;
    }

    public Integer getWorksHref() {
        return worksHref;
    }

    public void setWorksHref(Integer worksHref) {
        this.worksHref = worksHref;
    }

    public Integer getWorksDuty() {
        return worksDuty;
    }

    public void setWorksDuty(Integer worksDuty) {
        this.worksDuty = worksDuty;
    }

    public String getWorksImage() {
        return worksImage;
    }

    public void setWorksImage(String worksImage) {
        this.worksImage = worksImage;
    }

    public Integer getWorksPerson() {
        return worksPerson;
    }

    public void setWorksPerson(Integer worksPerson) {
        this.worksPerson = worksPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", worksId=").append(worksId);
        sb.append(", worksName=").append(worksName);
        sb.append(", worksTrade=").append(worksTrade);
        sb.append(", worksKeyword=").append(worksKeyword);
        sb.append(", worksHref=").append(worksHref);
        sb.append(", worksDuty=").append(worksDuty);
        sb.append(", worksImage=").append(worksImage);
        sb.append(", worksPerson=").append(worksPerson);
        sb.append("]");
        return sb.toString();
    }
}