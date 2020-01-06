package com.xdkj.outsources.entity;

import java.io.Serializable;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public class Identification implements Serializable {
    private Integer identityId;

    private String identityCard;

    private String identityImage;

    private Integer identityStatus;

    private Integer identityPerson;

    private static final long serialVersionUID = 1L;

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getIdentityImage() {
        return identityImage;
    }

    public void setIdentityImage(String identityImage) {
        this.identityImage = identityImage;
    }

    public Integer getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(Integer identityStatus) {
        this.identityStatus = identityStatus;
    }

    public Integer getIdentityPerson() {
        return identityPerson;
    }

    public void setIdentityPerson(Integer identityPerson) {
        this.identityPerson = identityPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", identityId=").append(identityId);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", identityImage=").append(identityImage);
        sb.append(", identityStatus=").append(identityStatus);
        sb.append(", identityPerson=").append(identityPerson);
        sb.append("]");
        return sb.toString();
    }
}