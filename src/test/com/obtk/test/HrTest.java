package com.obtk.test;

import com.obtk.mapper.DeptMapper;
import com.obtk.mapper.EmpMapper;
import com.obtk.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HrTest {

    @Test
     public void testDept(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
        deptMapper.findAll().forEach(dept -> System.out.println(dept.getDname()));
        SqlSessionUtil.close(sqlSession);
     }

    @Test
    public void testEmp(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        empMapper.findCount();
        SqlSessionUtil.close(sqlSession);
    }

    @Test
    public void testFindByPage(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        Map<String,Object> params=new HashMap<>();
        params.put("pageNo",1);
        params.put("pageSize",7);
        empMapper.findByPage(params);
        SqlSessionUtil.close(sqlSession);
    }
    @Test
    public void testTyf(){
        System.out.println("tfy测试成功！！！！");
    }

    @Test
    public void testzhr(){
        System.out.println("zh_SSS测试");
    }

    @Test
    public void testzdf(){
        int i = 9;

    }

}
