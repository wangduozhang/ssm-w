package com.iotek.ssm.entity;

/**
 * Created by Administrator on 2018/10/17.
 */
public class Recruit {
    private Integer id;
    private String job;
    private String sex;
    private String age;
    private String appeal;

    public Recruit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", appeal='" + appeal + '\'' +
                '}';
    }
}
