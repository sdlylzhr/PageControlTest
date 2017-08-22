package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;

import java.util.List;

/**
 * Created by lizhongren1 on 2017/8/18.
 */
public interface MessageService {

    List<Message> findAllMsg();

    PageInfo<Message> queryPage(Integer pageNum, Integer pageSize);



}
