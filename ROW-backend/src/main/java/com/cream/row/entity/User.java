package com.cream.row.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@TableName("t_user")
public class User {
    /**
     * ※ 雪花算法生成id，这里因为的自动赋值要使用包装类，可能会是因为mybatis不把0作为null考虑，而不自动赋值
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
    /**
     * 逻辑删除
     */
    @Setter
    @TableLogic
    @TableField("deleted")
    private boolean deleted;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Timestamp createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateTime;
}
