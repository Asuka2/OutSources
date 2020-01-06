package com.xdkj.outsources.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author JCX
 * @create 2020-01-06 14:47
 */
public class Education implements Serializable {
    private Integer educationId;

    private Date educationStart;

    private Date educationEnd;

    private String schoolName;

    private String profession;

    private String educationLevel;

    private Integer educationPerson;

    private static final long serialVersionUID = 1L;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Date getEducationStart() {
        return educationStart;
    }

    public void setEducationStart(Date educationStart) {
        this.educationStart = educationStart;
    }

    public Date getEducationEnd() {
        return educationEnd;
    }

    public void setEducationEnd(Date educationEnd) {
        this.educationEnd = educationEnd;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Integer getEducationPerson() {
        return educationPerson;
    }

    public void setEducationPerson(Integer educationPerson) {
        this.educationPerson = educationPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", educationId=").append(educationId);
        sb.append(", educationStart=").append(educationStart);
        sb.append(", educationEnd=").append(educationEnd);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", profession=").append(profession);
        sb.append(", educationLevel=").append(educationLevel);
        sb.append(", educationPerson=").append(educationPerson);
        sb.append("]");
        return sb.toString();
    }
}