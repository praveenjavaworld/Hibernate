package com.nt.test;

import com.nt.dao.ManyToOneDAO;
import com.nt.dao.ManyToOneDAOImpl;

public class ManyToOneTest {

	public static void main(String[] args) {
		
		//get dao
		ManyToOneDAO dao = new ManyToOneDAOImpl();
		//invoke b.methods
		//dao.saveDataUsingChild();
		//dao.loadDataUsingChild();
		//dao.deleteAllChildsAndItsParent();
		dao.deleteOneChildFromParent();

	}

}
