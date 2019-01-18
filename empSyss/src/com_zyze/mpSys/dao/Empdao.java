package com_zyze.mpSys.dao;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com_zyze.mpSys.domain.Emp;
import com_zyze.mpSys.utils.DBUtils;

public class Empdao implements IEmpDao {
	public void Empdao() {
		
	}

	@Override
	public List<Emp> findAll() {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());

		try {
			return runner.query("select * from emp", new BeanListHandler<Emp>(Emp.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Emp findEmpByNameAndPassword(String name, String password) {

		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());

		try {
			return runner.query("select * from emp where name=? and password=?", new BeanHandler<Emp>(Emp.class), name,
					password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void Zhuce(Emp emp) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		try {
			runner.update("insert into emp values(null,?,?,?,?,?,?,?,?)", emp.getName(), emp.getPassword(),
					emp.getGender(), emp.getAge(), emp.getHiredate(), emp.getSalary(), emp.getPhone(), emp.getEmail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public Emp san(int id) {
	
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		try {
			Emp emp = runner.query("select * from emp where id=?", new BeanHandler<Emp>(Emp.class), id);
			runner.update("insert into emp3 values( null,?,?,?,?,?,?,?,?)",  emp.getName(), emp.getPassword(),
					emp.getGender(), emp.getAge(), emp.getHiredate(), emp.getSalary(), emp.getPhone(), emp.getEmail());
			runner.update("delete from emp where id=?", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Emp> findAllemp3() {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());

		try {
			return runner.query("select * from emp3", new BeanListHandler<Emp>(Emp.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override

	public Emp sanemp3(int id) {
		
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		try {
			Emp emp = runner.query("select * from emp3 where id=?", new BeanHandler<Emp>(Emp.class), id);			
			runner.update("insert into emp values( null,?,?,?,?,?,?,?,?)",  emp.getName(), emp.getPassword(),
			emp.getGender(), emp.getAge(), emp.getHiredate(), emp.getSalary(), emp.getPhone(), emp.getEmail());
			runner.update("delete from emp3 where id=?", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	

	@Override
	public Emp findid(int id) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());

		try {
		return runner.query("select * from emp where id=?", new BeanHandler<Emp>(Emp.class),id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void Gai(int id, String name, String password, String gender, Integer age, String hiredate, double salary,
			String phone, String email) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		try {
				 runner.update("update emp set name=?,password=?,gender=?,age=?,hiredate=?,salary=?,phone=?,email=? where id= "+id 
					,name,password,gender,age,hiredate,salary,phone,email);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		}
		
	}
	
	
	
	
	

	



		
	


