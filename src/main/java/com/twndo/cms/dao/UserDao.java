package com.twndo.cms.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public void testTran(){
		String sql = "";

		// update() -> 更新数据
		sql = "INSERT INTO `test_users` (" + "user_login, user_pass, user_status"
				+ ") VALUES ('aaa', '$P$BmC7CkXJhXmvcgAywuFsbbTwqdmM6d/',  0);";

		jdbcTemplate.update(sql);

		int a = 1 / 0;

		// update() -> 更新数据
		sql = "INSERT INTO `test_users` (" + "user_login, user_pass, user_status"
				+ ") VALUES ('aaa', '$P$BmC7CkXJhXmvcgAywuFsbbTwqdmM6d/',  0);";

		jdbcTemplate.update(sql);
	}
}
