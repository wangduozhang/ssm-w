package com.iotek.ssm.entity;

/**
 * Created by Administrator on 2018/10/18.
 */
public class Interview {
    private Integer id;
    private Tourist tourist;
    private Employee employee;
    private String time;
    private String state;

    public Interview() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", tourist=" + tourist +
                ", employee=" + employee +
                ", time='" + time + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
