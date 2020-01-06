package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public class Skills implements Serializable {
    private Integer skillId;

    private String skillName;

    private String skillEvaluate;

    private Integer skillPerson;

    private static final long serialVersionUID = 1L;

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillEvaluate() {
        return skillEvaluate;
    }

    public void setSkillEvaluate(String skillEvaluate) {
        this.skillEvaluate = skillEvaluate;
    }

    public Integer getSkillPerson() {
        return skillPerson;
    }

    public void setSkillPerson(Integer skillPerson) {
        this.skillPerson = skillPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skillId=").append(skillId);
        sb.append(", skillName=").append(skillName);
        sb.append(", skillEvaluate=").append(skillEvaluate);
        sb.append(", skillPerson=").append(skillPerson);
        sb.append("]");
        return sb.toString();
    }
}