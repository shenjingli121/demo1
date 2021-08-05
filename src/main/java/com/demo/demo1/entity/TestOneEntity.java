package com.demo.demo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@TableName("test_one")
@Data
public class TestOneEntity  {

    @TableId(type = IdType.AUTO)
    public Long id;
    private String asd;
    private String adssd;
    @JsonFormat
    public Date createTime;
    public Date updateTime;
    public long createUserId;
    public long updateUserId;
    @TableLogic
    public boolean deleteStatus;

}
