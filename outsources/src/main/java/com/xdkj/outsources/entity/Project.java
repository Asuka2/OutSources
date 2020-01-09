package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-08 17:51
 */
public class Project implements Serializable {
    private Integer projectId;

    private String projectName;

    private String projectClass;

    private Double projectBudget;

    private String projectIntroduce;

    private String projectFile;

    private Integer projectPublisher;

    private Integer projectCoder;

    private Integer projectStatus;

    private String projectSkill;

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

    public String getProjectClass() {
        return projectClass;
    }

    public void setProjectClass(String projectClass) {
        this.projectClass = projectClass;
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

    public Integer getProjectCoder() {
        return projectCoder;
    }

    public void setProjectCoder(Integer projectCoder) {
        this.projectCoder = projectCoder;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectSkill() {
        return projectSkill;
    }

    public void setProjectSkill(String projectSkill) {
        this.projectSkill = projectSkill;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectClass=").append(projectClass);
        sb.append(", projectBudget=").append(projectBudget);
        sb.append(", projectIntroduce=").append(projectIntroduce);
        sb.append(", projectFile=").append(projectFile);
        sb.append(", projectPublisher=").append(projectPublisher);
        sb.append(", projectCoder=").append(projectCoder);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", projectSkill=").append(projectSkill);
        sb.append("]");
        return sb.toString();
    }
}