package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public class Project implements Serializable {
    private Integer projectId;

    private String projectName;

    private Double projectBudget;

    private String projectIntroduce;

    private String projectFile;

    private Integer projectPublisher;

    private Integer projiectCoder;

    private static final long serialVersionUID = 1L;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getProjectIntroduce() {
        return projectIntroduce;
    }

    public void setProjectIntroduce(String projectIntroduce) {
        this.projectIntroduce = projectIntroduce;
    }

    public String getProjectFile() {
        return projectFile;
    }

    public void setProjectFile(String projectFile) {
        this.projectFile = projectFile;
    }

    public Integer getProjectPublisher() {
        return projectPublisher;
    }

    public void setProjectPublisher(Integer projectPublisher) {
        this.projectPublisher = projectPublisher;
    }

    public Integer getProjiectCoder() {
        return projiectCoder;
    }

    public void setProjiectCoder(Integer projiectCoder) {
        this.projiectCoder = projiectCoder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectBudget=").append(projectBudget);
        sb.append(", projectIntroduce=").append(projectIntroduce);
        sb.append(", projectFile=").append(projectFile);
        sb.append(", projectPublisher=").append(projectPublisher);
        sb.append(", projiectCoder=").append(projiectCoder);
        sb.append("]");
        return sb.toString();
    }
}