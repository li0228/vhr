package com.manyin.vhr.mapper;

import com.manyin.vhr.entity.EmployeeInfoEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IEmployeeMapper {

    @Select("select * from employee_info")
    List<EmployeeInfoEntity> queryList ();

    @Select("select * from employee_info where  EMPLOYEE_NUMBER = #{empNum} limit 1")
    EmployeeInfoEntity queryByNum(@Param(value = "empNum")int empNum);

    @Select("select * from employee_info where ID = #{id}")
    EmployeeInfoEntity queryById(@Param(value = "id")int id);

    @Select("select * from employee_info where  EMPLOYEE_NAME like  '%${empName}%'")
    List<EmployeeInfoEntity> queryByName(@Param(value ="empName")String empName);

    @Update("update employee_info set "
            +" EMPLOYEE_NUMBER=#{employeeNumber}, "
            +" EMPLOYEE_NAME=#{employeeName}, "
            +" EMPLOYEE_SEX=#{employeeSex}, "
            +" EMPLOYEE_AGE=#{employeeAge}, "
            +" EMPLOYEE_EDUCATION=#{employeeEducation}, "
            +" EMPLOYEE_PHONE_NUMBER=#{employeePhoneNumber}, "
            +" EMPLOYEE_DEPT=#{employeeDept}, "
            +" EMPLOYEE_POSITONG=#{employeePositong} "
            +" where ID=#{id} ")
    int updateEmp(EmployeeInfoEntity entity);

    @Delete("delete from employee_info where id=#{id}")
    int deleteById(int id);

    @Insert("insert employee_info (EMPLOYEE_NUMBER, EMPLOYEE_PHOTO, EMPLOYEE_NAME, EMPLOYEE_SEX ,EMPLOYEE_AGE ,EMPLOYEE_EDUCATION, EMPLOYEE_PHONE_NUMBER, EMPLOYEE_DEPT, EMPLOYEE_POSITONG )  values( "
            +" #{employeeNumber}, "
            +" #{employeePhoto}, "
            +" #{employeeName}, "
            +" #{employeeSex}, "
            +" #{employeeAge}, "
            +" #{employeeEducation}, "
            +" #{employeePhoneNumber}, "
            +" #{employeeDept}, "
            +" #{employeePositong} "
            +" )")
    @Options(useGeneratedKeys = true)
    int save(EmployeeInfoEntity entity);
}