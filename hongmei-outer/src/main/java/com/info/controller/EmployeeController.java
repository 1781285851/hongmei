package com.info.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.entity.Employee;
import com.info.http.MessageCode;
import com.info.http.SoftworksResponse;
import com.info.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"1- 用户注册登录相关接口"})
@Log4j
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "新增用户")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody SoftworksResponse<Boolean> save(@RequestBody @ApiParam("实体定义") Employee employee){
        log.info("保存新增用户");
        Boolean result = employeeService.addEmployeeService(employee);
        if(result)
            return SoftworksResponse.success(result);
        return SoftworksResponse.failure(MessageCode.COMMON_FAILURE);
    }

    @ApiOperation(value = "查看用户信息")
    @GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody SoftworksResponse<Employee> detail(@ApiParam("用户code") @RequestParam(value = "code") String code){
        log.info("获取业务评价详细信息 id = " + code);
        Employee employee = employeeService.findByNameService(code);
        if (null != employee)
        return SoftworksResponse.success(employeeService.findByNameService(code));
        return SoftworksResponse.failure(MessageCode.COMMON_USER_NOT_EXIST);
    }

    @ApiOperation(value = "获取所有用户信息")
    @GetMapping(value = "page_list", produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody SoftworksResponse<PageInfo> page(
            @ApiParam("页码") @RequestParam(value = "pageNum", required = false) Integer pageNum,
            @ApiParam("页大小") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        log.info("根据条件获取业务事项分页列表");
        if (null == pageNum) pageNum = 0;
        if (null == pageSize) pageSize = 10;
        // 1.引入PageHelper分页插件
        // 2.在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNum, pageSize);
        // 3.startPage后面紧跟的这个查询就是一个分页查询
        List<Employee> emps = employeeService.findAllService();
        // 4.使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(emps, 5);
        return SoftworksResponse.success(page);
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    private @ResponseBody SoftworksResponse<Boolean> remove(@ApiParam("用户code") @RequestParam(value = "code") String code){
        log.info("删除用户 = " + code);
        Boolean result = employeeService.removeByNameService(code);
        return SoftworksResponse.success(result);
    }


}
