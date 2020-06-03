package com.manyin.vhr.controller;

import com.manyin.vhr.common.result.CodeMsg;
import com.manyin.vhr.common.result.ResultBean;
import com.manyin.vhr.common.result.SuccessMsg;
import com.manyin.vhr.entity.EmployeeInfoEntity;
import com.manyin.vhr.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
@RequestMapping(value = "emp")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 获取所有的用户信息，不分页
     * @return
     */
    @RequestMapping(value="/list")
    public ResultBean queryList(){
        try{
            List<EmployeeInfoEntity> empList = employeeService.queryList();
            return  ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(empList));
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }
    }

    /**
     * 根据员工号获取员工信息
     * @param empNum 员工号
     * @return
     */
    @RequestMapping(value="/queryByNum")
    public ResultBean queryByNum(@Param(value="empNum")int empNum){
        try{
            EmployeeInfoEntity empEntity = employeeService.queryByNum(empNum);
            return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(empEntity));
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }

    }

    /**
     * 根据id获取员工号,
     */
    @RequestMapping(value="/queryById/{id}",method= RequestMethod.GET)
    public ResultBean queryById(@PathVariable("id") int id){
        try {
            EmployeeInfoEntity empEntity = employeeService.queryById(id);
            return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(empEntity));
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }

    }

    /**
     * 根据姓名查找员工
     * @return
     */
    @RequestMapping(value="/queryByName")
    public ResultBean queryByName(@Param(value="empName")String empName){
        try{
            List<EmployeeInfoEntity> empList = employeeService.queryByName(empName);
            return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(empList));

        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }
    }

    /**
     *根据员工信息修改员工信息
     */
    @RequestMapping(value="/updateEmp",method = RequestMethod.POST)
    public ResultBean updateEmp(@Param(value="employee") EmployeeInfoEntity entity){
        try{
            int id =entity.getId();
            if(id == 0){//如果用户不存在
                return  ResultBean.error(CodeMsg.NOUSER_ERROR);
            }else{
                int msg = employeeService.updateEmp(entity);
                return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(msg));
            }
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }
    }

    /**
     * 根据id删除员工信息
     * @param id
     * @return
     */
    @RequestMapping(value="/deleteById")
    public ResultBean deleteById (@RequestParam int id){
        try{
            int msg = employeeService.deleteById(id);
            return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(msg));
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }
    }

    /**
     *
     */
    @RequestMapping(value="/save")
    public ResultBean save (@Param(value="employee") EmployeeInfoEntity entity){
        try{
            int msg = employeeService.save(entity);
            return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(msg));
        }catch (Exception e){
            return ResultBean.error(CodeMsg.SERVER_ERROR);
        }
    }
}
