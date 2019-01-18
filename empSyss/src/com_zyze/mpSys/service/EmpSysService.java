package com_zyze.mpSys.service;

import java.util.List;

import com_zyze.mpSys.dao.Empdao;
import com_zyze.mpSys.dao.IEmpDao;
import com_zyze.mpSys.domain.Emp;



public class EmpSysService implements IEmpSysService{
	IEmpDao dao = new Empdao();

	@Override
	public Emp findEmpByNameAndPassword(String name, String password) {
		return dao.findEmpByNameAndPassword(name, password);
	}

	@Override
	public List<Emp> findAll() {
		return dao.findAll();
	}

	@Override
	public void Zhuce(Emp emp) {
		dao.Zhuce(emp);
		
		
	}

	
	@Override
	public Emp san(int id) {
		dao.san(id);
		
		return null;
	}

	@Override
	public List<Emp> findAllemp3() {
   
		return  dao.findAllemp3();
	}

	@Override
	public Emp sanemp3(int id) {
       
		return   dao.sanemp3(id);	
	}

	@Override
	public Emp findid(int id) {
		
		
		return dao.findid(id);
	}

	@Override
	public void Gai(int id, String name, String password, String gender, Integer age, String hiredate, double salary,
			String phone, String email) {
		   dao.Gai(id, name, password, gender, age, hiredate, salary, phone, email);
	}

	


	

}
	 
	

	
	
	

	