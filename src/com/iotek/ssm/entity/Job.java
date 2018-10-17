package com.iotek.ssm.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/13.
 */
public class Job {
    private Integer id;
    private String name;
    private Date time;
    private Branch branch;

    public Job() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", branch=" + branch +
                '}';
    }
}
