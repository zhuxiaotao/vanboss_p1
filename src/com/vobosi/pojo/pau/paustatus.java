package com.vobosi.pojo.pau;

import java.io.Serializable;

public class paustatus implements Serializable {
    private Integer stime;

    private Integer temns1;

    private Integer temns2;

    private Integer temns3;

    private Integer humns1;

    private Integer humns2;

    private Integer humns3;

    private Integer temos1;

    private Integer temos2;

    private Integer temos3;

    private Integer humos1;

    private Integer humos2;

    private Integer humos3;

    private Integer preos1;

    private Integer preos2;

    private Integer preos3;

    private String status1;

    private String status2;

    private String status3;

    private Integer fre1;

    private Integer fre2;

    private Integer fre3;

    private static final long serialVersionUID = 1L;

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Integer getTemns1() {
        return temns1;
    }

    public void setTemns1(Integer temns1) {
        this.temns1 = temns1;
    }

    public Integer getTemns2() {
        return temns2;
    }

    public void setTemns2(Integer temns2) {
        this.temns2 = temns2;
    }

    public Integer getTemns3() {
        return temns3;
    }

    public void setTemns3(Integer temns3) {
        this.temns3 = temns3;
    }

    public Integer getHumns1() {
        return humns1;
    }

    public void setHumns1(Integer humns1) {
        this.humns1 = humns1;
    }

    public Integer getHumns2() {
        return humns2;
    }

    public void setHumns2(Integer humns2) {
        this.humns2 = humns2;
    }

    public Integer getHumns3() {
        return humns3;
    }

    public void setHumns3(Integer humns3) {
        this.humns3 = humns3;
    }

    public Integer getTemos1() {
        return temos1;
    }

    public void setTemos1(Integer temos1) {
        this.temos1 = temos1;
    }

    public Integer getTemos2() {
        return temos2;
    }

    public void setTemos2(Integer temos2) {
        this.temos2 = temos2;
    }

    public Integer getTemos3() {
        return temos3;
    }

    public void setTemos3(Integer temos3) {
        this.temos3 = temos3;
    }

    public Integer getHumos1() {
        return humos1;
    }

    public void setHumos1(Integer humos1) {
        this.humos1 = humos1;
    }

    public Integer getHumos2() {
        return humos2;
    }

    public void setHumos2(Integer humos2) {
        this.humos2 = humos2;
    }

    public Integer getHumos3() {
        return humos3;
    }

    public void setHumos3(Integer humos3) {
        this.humos3 = humos3;
    }

    public Integer getPreos1() {
        return preos1;
    }

    public void setPreos1(Integer preos1) {
        this.preos1 = preos1;
    }

    public Integer getPreos2() {
        return preos2;
    }

    public void setPreos2(Integer preos2) {
        this.preos2 = preos2;
    }

    public Integer getPreos3() {
        return preos3;
    }

    public void setPreos3(Integer preos3) {
        this.preos3 = preos3;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1 == null ? null : status1.trim();
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2 == null ? null : status2.trim();
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3 == null ? null : status3.trim();
    }

    public Integer getFre1() {
        return fre1;
    }

    public void setFre1(Integer fre1) {
        this.fre1 = fre1;
    }

    public Integer getFre2() {
        return fre2;
    }

    public void setFre2(Integer fre2) {
        this.fre2 = fre2;
    }

    public Integer getFre3() {
        return fre3;
    }

    public void setFre3(Integer fre3) {
        this.fre3 = fre3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stime=").append(stime);
        sb.append(", temns1=").append(temns1);
        sb.append(", temns2=").append(temns2);
        sb.append(", temns3=").append(temns3);
        sb.append(", humns1=").append(humns1);
        sb.append(", humns2=").append(humns2);
        sb.append(", humns3=").append(humns3);
        sb.append(", temos1=").append(temos1);
        sb.append(", temos2=").append(temos2);
        sb.append(", temos3=").append(temos3);
        sb.append(", humos1=").append(humos1);
        sb.append(", humos2=").append(humos2);
        sb.append(", humos3=").append(humos3);
        sb.append(", preos1=").append(preos1);
        sb.append(", preos2=").append(preos2);
        sb.append(", preos3=").append(preos3);
        sb.append(", status1=").append(status1);
        sb.append(", status2=").append(status2);
        sb.append(", status3=").append(status3);
        sb.append(", fre1=").append(fre1);
        sb.append(", fre2=").append(fre2);
        sb.append(", fre3=").append(fre3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}