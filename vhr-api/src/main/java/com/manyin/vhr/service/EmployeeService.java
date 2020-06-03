package com.manyin.vhr.service;

import com.manyin.vhr.entity.EmployeeInfoEntity;
import com.manyin.vhr.mapper.IEmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeMapper iEmployeeMapper;

    /**
     * 获取所有的员工信息
     */
    public List<EmployeeInfoEntity> queryList(){
        return iEmployeeMapper.queryList();
    }

    /**
     * 根据员工号查找到员工信息
     */
    public EmployeeInfoEntity queryByNum(int empNum){
        return iEmployeeMapper.queryByNum(empNum);
    }

    /**
     * 根据id查找员工信息
     */
    public  EmployeeInfoEntity queryById(int id){
        return iEmployeeMapper.queryById(id);
    }

    /**
     * 根据姓名查找员工（模糊查找）
     */
    public List<EmployeeInfoEntity> queryByName(String empName){
        return iEmployeeMapper.queryByName(empName);
    }

    /**
     * 修改员工信息
     * @param empEntity
     * @return
     */
    public int updateEmp(EmployeeInfoEntity empEntity){
         return iEmployeeMapper.updateEmp(empEntity);
    }

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    public int deleteById(int id){
        return iEmployeeMapper.deleteById(id);
    }

    /**
     * 添加员工信息
     * @param empEntity
     * @return
     */
    public int save(EmployeeInfoEntity empEntity){
        return iEmployeeMapper.save(empEntity);
    }

}
