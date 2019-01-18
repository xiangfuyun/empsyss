package com_zyze.mpSys.service;

import java.util.List;

import com_zyze.mpSys.domain.Emp;

public interface IEmpSysService {
	/**
	 * 登录验证, 通过名称和密码来查找用户
	 * @param name
	 * @param password
	 * @return
	 */
	Emp findEmpByNameAndPassword(String name, String password);
	/**
	 * 获取所有员工信息
	 * @return
	 */
	List<Emp> findAllemp3();
	List<Emp> findAll();
	/**
	 * 添加注册信息
	 * @return 
	 * @return 
	 */
	Emp findid(int id);
	
   void Zhuce(Emp emp);
/**
 * 删除emp用户信息 并且同时恢复到emp3中
 * 
 */
Emp san(int id);
/**
 * 删除emp3中的数据库 并且同时恢复到emp中
 * @param id
 * @return
 */
Emp sanemp3(int id);
/**
 * 删除emp3中的数据
 * @param id
 */
void Gai(int id,String name,String password,String gender,Integer age,String hiredate,
		double salary,String phone, String email );


}
