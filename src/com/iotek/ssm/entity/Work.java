package com.iotek.ssm.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/19.
 */
public class Work {
    private Integer id;
    private String time;
    private Date goTime;
    private Date downTime;
    private String lateness;
    private String before;
    private String absent;
    private Employee employee;

    public Work() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getGoTime() {
        return goTime;
    }

    public void setGoTime(Date goTime) {
        this.goTime = goTime;
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public String getLateness() {
        return lateness;
    }

    public void setLateness(String lateness) {
        this.lateness = lateness;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", time=" + time +
                ", goTime=" + goTime +
                ", downTime=" + downTime +
                ", lateness='" + lateness + '\'' +
                ", before='" + before + '\'' +
                ", absent='" + absent + '\'' +
                ", employee=" + employee +
                '}';
    }
}
