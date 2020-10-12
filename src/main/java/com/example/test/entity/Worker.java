package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author kk
 * @since 2020-08-13
 */
public class Worker extends Model<Worker> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

        /**
     * 姓名
     */
         private String name;

        /**
     * 年龄
     */
         private Integer age;

        /**
     * 工资
     */
         private String salary;

        /**
     * 性别 男性:1，女性:2
     */
         private String sex;

        /**
     * 身高
     */
         private String height;

        /**
     * 体重
     */
         private String heavy;

        /**
     * 联系电话
     */
         private String telephone;

        /**
     * 公司
     */
         private String company;

        /**
     * 部门
     */
         private String department;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeavy() {
        return heavy;
    }

    public void setHeavy(String heavy) {
        this.heavy = heavy;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Worker{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", salary=" + salary +
        ", sex=" + sex +
        ", height=" + height +
        ", heavy=" + heavy +
        ", telephone=" + telephone +
        ", company=" + company +
        ", department=" + department +
        "}";
    }
}
