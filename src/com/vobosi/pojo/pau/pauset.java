package com.vobosi.pojo.pau;

import java.io.Serializable;

public class pauset implements Serializable {
    private Integer stime;

    private Integer temset;

    private Integer humset;

    private Integer preset;

    private String controlset;

    private String who;

    private static final long serialVersionUID = 1L;

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Integer getTemset() {
        return temset;
    }

    public void setTemset(Integer temset) {
        this.temset = temset;
    }

    public Integer getHumset() {
        return humset;
    }

    public void setHumset(Integer humset) {
        this.humset = humset;
    }

    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public String getControlset() {
        return controlset;
    }

    public void setControlset(String controlset) {
        this.controlset = controlset == null ? null : controlset.trim();
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who == null ? null : who.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stime=").append(stime);
        sb.append(", temset=").append(temset);
        sb.append(", humset=").append(humset);
        sb.append(", preset=").append(preset);
        sb.append(", controlset=").append(controlset);
        sb.append(", who=").append(who);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}