package com.twndo.cms.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JdbcTemplateTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

		String sql = "";

		// execute() -> 执行SQL语句
		sql = "CREATE TABLE `test_users` (" + "`ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,"
				+ "`user_login` varchar(60) CHARACTER SET utf8 NOT NULL DEFAULT '',"
				+ "`user_pass` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',"
				+ "`user_status` int(11) NOT NULL DEFAULT 0," + "PRIMARY KEY (`ID`) USING BTREE,"
				+ "INDEX `user_login_key`(`user_login`) USING BTREE" + ") ENGINE = InnoDB CHARACTER SET = utf8;";
		// jdbcTemplate.execute(sql);

		// update() -> 更新数据
		sql = "INSERT INTO `test_users` (" + "user_login, user_pass, user_status"
				+ ") VALUES ('aaa', '$P$BmC7CkXJhXmvcgAywuFsbbTwqdmM6d/',  0);";

		// jdbcTemplate.update(sql);

		// query() -> 查询数据
		sql = "SELECT * FROM `test_users`";
		jdbcTemplate.query(sql, new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println("Row：" + rowNum);
				System.out
						.println(rs.getLong(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
				return null;
			}
		});
	}
}
