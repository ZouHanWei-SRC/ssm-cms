package com.twndo.cms.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionManagerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

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
