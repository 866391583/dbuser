package com.dbuser;

import com.dbsql.DB;

public class UserTest {
	public static void test1()
	{
		DB db=new DB();
		db.setName("mysql");
		db.setVersion(5);
		User user=new User();
		user.setName("username");
		user.setDb(db);
		System.out.println(user.getDb().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}

}
