package com_zyze.mpSys.dao;

import java.util.List;

import com_zyze.mpSys.domain.Emp;

public interface IEmpDao {

/*
 * 登录验证  通过姓名 和密码查找用户
 */
	Emp findEmpByNameAndPassword(String name, String password);
	/**
	 * 查询所有xinx
	 * @return
	 */
	List<Emp> findAllemp3();
	List<Emp> findAll();
	
	Emp findid(int id);
	/**
	 * 添加注册信息
	 * @return 
	 * @return 
	 */
    void Zhuce(Emp emp);

/**
 * 修改信息
 * @return 
*/
    void Gai(int id,String name,String password,String gender,Integer age,String hiredate,
    		double salary,String phone, String email );

/**
 * 删除用户信息
 * 
 */
 Emp san(int id);

 /**
  * 删除emp3中的数据库 并且同时恢复到emp中
  * @param id
  * @return
  */
 Emp sanemp3(int id);

	 
 }



