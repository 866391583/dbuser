package com.dbuser;

import com.dbsql.DB;

public class User {
	DB db;
	String name;
	public DB getDb() {
		return db;
	}
	public void setDb(DB db) {
		this.db = db;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
