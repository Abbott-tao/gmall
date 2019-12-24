package com.gec.gmall.user.mapper;

import com.gec.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Component
public interface UserMapper extends Mapper<UmsMember> {

    //扩展自身的查询方法
    List<UmsMember> selectAllUser();
}
