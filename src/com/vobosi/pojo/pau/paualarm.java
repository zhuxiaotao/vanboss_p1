package com.vobosi.pojo.pau;

import java.io.Serializable;

public class paualarm implements Serializable {
    private Integer stime;

    private String screen1;

    private String screen2;

    private String themostat;

    private String motor;

    private String other;

    private static final long serialVersionUID = 1L;

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public String getScreen1() {
        return screen1;
    }

    public void setScreen1(String screen1) {
        this.screen1 = screen1 == null ? null : screen1.trim();
    }

    public String getScreen2() {
        return screen2;
    }

    public void setScreen2(String screen2) {
        this.screen2 = screen2 == null ? null : screen2.trim();
    }

    public String getThemostat() {
        return themostat;
    }

    public void setThemostat(String themostat) {
        this.themostat = themostat == null ? null : themostat.trim();
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor == null ? null : motor.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stime=").append(stime);
        sb.append(", screen1=").append(screen1);
        sb.append(", screen2=").append(screen2);
        sb.append(", themostat=").append(themostat);
        sb.append(", motor=").append(motor);
        sb.append(", other=").append(other);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}