package com.xiong.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiong.dao.IPersonMapper;
import com.xiong.entity.Person;
import com.xiong.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends ServiceImpl<IPersonMapper,Person> implements IPersonService {
}
