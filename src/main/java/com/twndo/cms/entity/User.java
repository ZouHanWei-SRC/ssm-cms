package com.twndo.cms.entity;

/**
 * 用户实体
 * 
 * @author hrvy
 *
 */
public class User {

	/** ID */
	private Long id;

	/** 昵称 */
	private String nickname;

	/** 邮箱 */
	private String email;

	/**
	 * ID取得
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * ID设定
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 昵称取得
	 * 
	 * @return
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * 昵称设定
	 * 
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * 邮箱取得
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 邮箱设定
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
