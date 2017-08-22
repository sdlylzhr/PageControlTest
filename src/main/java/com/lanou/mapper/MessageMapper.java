package com.lanou.mapper;

import com.lanou.bean.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

// 配置dao层注解, 用于对controller的依赖注入
@Repository
public interface MessageMapper {
	
	// 添加一个新方法, 用来查询所有的消息
	List<Message> findAllMessages();

}