package com.iotek.ssm.entity;

/**
 * Created by Administrator on 2018/10/13.
 */
public class Job {
    private Integer id;
    private String name;
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

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch=" + branch +
                '}';
    }
}
