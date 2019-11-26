package com.info.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户表")
public class Employee {
    @ApiModelProperty(value = "ID")
    private Integer id;
    @ApiModelProperty(value = "用户编码")
    private String code;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "性别 1:男，0:女")
    private Integer gender;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "电话号码")
    private String phone;
    @ApiModelProperty(value = "备注")
    private String description;
    @ApiModelProperty(value = "用户权限，1:管理员，0:用户")
    private Integer auth;
    @ApiModelProperty(value = "状态，1:存在，0:删除")
    private Integer status;
}
