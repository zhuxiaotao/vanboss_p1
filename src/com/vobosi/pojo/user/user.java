package com.vobosi.pojo.user;

import java.io.Serializable;

public class user implements Serializable {
    private String uid;

    private String username;

    private String password;

    private String eamil;

    private Integer mony;

    private Integer level;

    private String remarks;

    private Integer creattime;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil == null ? null : eamil.trim();
    }

    public Integer getMony() {
        return mony;
    }

    public void setMony(Integer mony) {
        this.mony = mony;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getCreattime() {
        return creattime;
    }

    public void setCreattime(Integer creattime) {
        this.creattime = creattime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", eamil=").append(eamil);
        sb.append(", mony=").append(mony);
        sb.append(", level=").append(level);
        sb.append(", remarks=").append(remarks);
        sb.append(", creattime=").append(creattime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}