package com.xdkj.outsources.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author JCX
 * @create 2020-01-09 14:58
 */
public class Huihua implements Serializable {
    private Integer huihuaId;

    private Integer huihuaFasong;

    private Integer huihuaJieshou;

    private String huihuaText;

    private Date huihuaDate;

    private static final long serialVersionUID = 1L;

    public Integer getHuihuaId() {
        return huihuaId;
    }

    public void setHuihuaId(Integer huihuaId) {
        this.huihuaId = huihuaId;
    }

    public Integer getHuihuaFasong() {
        return huihuaFasong;
    }

    public void setHuihuaFasong(Integer huihuaFasong) {
        this.huihuaFasong = huihuaFasong;
    }

    public Integer getHuihuaJieshou() {
        return huihuaJieshou;
    }

    public void setHuihuaJieshou(Integer huihuaJieshou) {
        this.huihuaJieshou = huihuaJieshou;
    }

    public String getHuihuaText() {
        return huihuaText;
    }

    public void setHuihuaText(String huihuaText) {
        this.huihuaText = huihuaText;
    }

    public Date getHuihuaDate() {
        return huihuaDate;
    }

    public void setHuihuaDate(Date huihuaDate) {
        this.huihuaDate = huihuaDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", huihuaId=").append(huihuaId);
        sb.append(", huihuaFasong=").append(huihuaFasong);
        sb.append(", huihuaJieshou=").append(huihuaJieshou);
        sb.append(", huihuaText=").append(huihuaText);
        sb.append(", huihuaDate=").append(huihuaDate);
        sb.append("]");
        return sb.toString();
    }
}