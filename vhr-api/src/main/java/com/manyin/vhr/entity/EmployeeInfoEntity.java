package com.manyin.vhr.entity;

public class EmployeeInfoEntity {
    private Integer id;//员工id

    private Integer employeeNumber;//员工号

    private String employeeName;//员工姓名

    private String employeePhoto;//员工照片

    private String employeeSex;//员工性别

    private Integer employeeAge;//年龄

    private String employeeEducation;//学历

    private String employeePhoneNumber;//联系方式

    private String employeeDept;//部门

    private String employeePositong;//职称

    public EmployeeInfoEntity() {
    }

    public EmployeeInfoEntity(Integer id, Integer employeeNumber, String employeeName, String employeePhoto, String employeeSex, Integer employeeAge, String employeeEducation, String employeePhoneNumber, String employeeDept, String employeePositong) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeePhoto = employeePhoto;
        this.employeeSex = employeeSex;
        this.employeeAge = employeeAge;
        this.employeeEducation = employeeEducation;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeDept = employeeDept;
        this.employeePositong = employeePositong;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getEmployeeNumber() {

        return employeeNumber;
    }

    public String getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(String employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    public void setEmployeeNumber(Integer employeeNumber) {

        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {

        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {

        this.employeeSex = employeeSex;
    }

    public Integer getEmployeeAge() {

        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {

        this.employeeAge = employeeAge;
    }

    public String getEmployeeEducation()
    {
        return employeeEducation;
    }

    public void setEmployeeEducation(String employeeEducation) {

        this.employeeEducation = employeeEducation;
    }

    public String getEmployeePhoneNumber() {

        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {

        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeDept() {

        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {

        this.employeeDept = employeeDept;
    }

    public String getEmployeePositong() {

        return employeePositong;
    }

    public void setEmployeePositong(String employeePositong) {
        this.employeePositong = employeePositong;

    }

    @Override
    public String toString() {
        return "EmployeeInfoEntity{" +
                "id=" + id +
                ", employeeNumber=" + employeeNumber +
                ", employeeName='" + employeeName + '\'' +
                ", employeePhoto='" + employeePhoto + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeEducation='" + employeeEducation + '\'' +
                ", employeePhoneNumber='" + employeePhoneNumber + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                ", employeePositong='" + employeePositong + '\'' +
                '}';
    }
}