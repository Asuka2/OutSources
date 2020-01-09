package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-08 14:38
 */
public class Resume implements Serializable {
    private Integer resumeId;

    private String resumeWorkstatus;

    private String resumeWorkdirection;

    private String resumeSpecificwork;

    private String resumeWorks;

    private String resumeIntroduce;

    private Integer resumePerson;

    private static final long serialVersionUID = 1L;

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getResumeWorkstatus() {
        return resumeWorkstatus;
    }

    public void setResumeWorkstatus(String resumeWorkstatus) {
        this.resumeWorkstatus = resumeWorkstatus;
    }

    public String getResumeWorkdirection() {
        return resumeWorkdirection;
    }

    public void setResumeWorkdirection(String resumeWorkdirection) {
        this.resumeWorkdirection = resumeWorkdirection;
    }

    public String getResumeSpecificwork() {
        return resumeSpecificwork;
    }

    public void setResumeSpecificwork(String resumeSpecificwork) {
        this.resumeSpecificwork = resumeSpecificwork;
    }

    public String getResumeWorks() {
        return resumeWorks;
    }

    public void setResumeWorks(String resumeWorks) {
        this.resumeWorks = resumeWorks;
    }

    public String getResumeIntroduce() {
        return resumeIntroduce;
    }

    public void setResumeIntroduce(String resumeIntroduce) {
        this.resumeIntroduce = resumeIntroduce;
    }

    public Integer getResumePerson() {
        return resumePerson;
    }

    public void setResumePerson(Integer resumePerson) {
        this.resumePerson = resumePerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeId=").append(resumeId);
        sb.append(", resumeWorkstatus=").append(resumeWorkstatus);
        sb.append(", resumeWorkdirection=").append(resumeWorkdirection);
        sb.append(", resumeSpecificwork=").append(resumeSpecificwork);
        sb.append(", resumeWorks=").append(resumeWorks);
        sb.append(", resumeIntroduce=").append(resumeIntroduce);
        sb.append(", resumePerson=").append(resumePerson);
        sb.append("]");
        return sb.toString();
    }
}