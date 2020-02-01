package com.lirt.service.user.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {

  @TableId("id")
  private String id;

  @TableField("userName")
  private String userName;

  @TableField("passWord")
  private String passWord;

  @TableField("nickName")
  private String nickName;

  @TableField("sex")
  private String sex;

  @TableField("address")
  private String address;

  @TableField("imgUrl")
  private String imgUrl;

  @TableField("age")
  private long age;

  @TableField("phone")
  private long phone;

}
