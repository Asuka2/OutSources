package com.xdkj.outsources.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public class JobInformation implements Serializable {
    private Integer jobId;

    private Date jobTime;

    private Date jobUntime;

    private String jobAddress;

    private Integer jobHours;

    private Double jobDaysal;

    private String jobPattern;

    private Integer jobPerson;

    private static final long serialVersionUID = 1L;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public Date getJobUntime() {
        return jobUntime;
    }

    public void setJobUntime(Date jobUntime) {
        this.jobUntime = jobUntime;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public Integer getJobHours() {
        return jobHours;
    }

    public void setJobHours(Integer jobHours) {
        this.jobHours = jobHours;
    }

    public Double getJobDaysal() {
        return jobDaysal;
    }

    public void setJobDaysal(Double jobDaysal) {
        this.jobDaysal = jobDaysal;
    }

    public String getJobPattern() {
        return jobPattern;
    }

    public void setJobPattern(String jobPattern) {
        this.jobPattern = jobPattern;
    }

    public Integer getJobPerson() {
        return jobPerson;
    }

    public void setJobPerson(Integer jobPerson) {
        this.jobPerson = jobPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobId=").append(jobId);
        sb.append(", jobTime=").append(jobTime);
        sb.append(", jobUntime=").append(jobUntime);
        sb.append(", jobAddress=").append(jobAddress);
        sb.append(", jobHours=").append(jobHours);
        sb.append(", jobDaysal=").append(jobDaysal);
        sb.append(", jobPattern=").append(jobPattern);
        sb.append(", jobPerson=").append(jobPerson);
        sb.append("]");
        return sb.toString();
    }
}