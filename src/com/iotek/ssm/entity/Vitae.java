package com.iotek.ssm.entity;

/**
 * Created by Administrator on 2018/10/12.
 */
public class Vitae {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String schoolling;//学历
    private String phone;
    private String email;
    private Branch branch;//部门
    private Job job; //职位
    private String appearance;//政治面貌
    private String work;//上份工作
    private String workTime;//工作经验，几年
    private String salary;//期望薪资
    private String bent;// 兴趣爱好
    private Tourist tourist;
    private String state;//显示已投递和未投递
    private String red;//显示阅和已阅
    public Vitae() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolling() {
        return schoolling;
    }

    public void setSchoolling(String schoolling) {
        this.schoolling = schoolling;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBent() {
        return bent;
    }

    public void setBent(String bent) {
        this.bent = bent;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Vitae{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", schoolling='" + schoolling + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", branch=" + branch +
                ", job=" + job +
                ", appearance='" + appearance + '\'' +
                ", work='" + work + '\'' +
                ", workTime='" + workTime + '\'' +
                ", salary='" + salary + '\'' +
                ", bent='" + bent + '\'' +
                ", tourist=" + tourist +
                ", state='" + state + '\'' +
                ", red='" + red + '\'' +
                '}';
    }
}
