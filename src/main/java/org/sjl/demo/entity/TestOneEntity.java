package org.sjl.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.sjl.base.entity.BaseEntity;


@TableName("test_one")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TestOneEntity extends BaseEntity {


    private String asd;
    private String adssd;


}
