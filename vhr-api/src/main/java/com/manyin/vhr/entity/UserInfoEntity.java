package com.manyin.vhr.entity;

import java.io.Serializable;

public class UserInfoEntity implements Serializable {
    private Integer id;//用户id

    private String userName;//用户姓名

    private Integer employeeId;//员工id

    private String password;//密码

    private String employeeJurisdiction;//权限

    public UserInfoEntity() {
    }

    public UserInfoEntity(Integer id, String userName, Integer employeeId, String password, String employeeJurisdiction) {
        this.id = id;
        this.userName = userName;
        this.employeeId = employeeId;
        this.password = password;
        this.employeeJurisdiction = employeeJurisdiction;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Integer getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {

        this.employeeId = employeeId;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getEmployeeJurisdiction() {

        return employeeJurisdiction;
    }

    public void setEmployeeJurisdiction(String employeeJurisdiction) {
        this.employeeJurisdiction = employeeJurisdiction;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", employeeId=" + employeeId +
                ", password='" + password + '\'' +
                ", employeeJurisdiction='" + employeeJurisdiction + '\'' +
                '}';
    }
}