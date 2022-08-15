package com.jxd.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.emp.dao.IDeptDao;
import com.jxd.emp.model.Dept;
import com.jxd.emp.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/9
 * @Version 1.0
 */
@Service
public class DeptServiceImpl extends ServiceImpl<IDeptDao, Dept> implements IDeptService {
}
