package com.twndo.cms.entity;

/**
 * 用户登陆实体
 * 
 * @author hrvy
 *
 */
public class UserLoginPwd {

	/** ID */
	private Long id;

	/** 登陆ID */
	private String loginId;

	/** 登陆密码 */
	private String loginPwd;

	/** 用户ID */
	private Long userId;

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
	 * 登陆ID取得
	 * 
	 * @return
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * 登陆ID设定
	 * 
	 * @param loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * 登陆密码取得
	 * 
	 * @return
	 */
	public String getLoginPwd() {
		return loginPwd;
	}

	/**
	 * 登陆密码设定
	 * 
	 * @param loginPwd
	 */
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	/**
	 * 用户ID取得
	 * 
	 * @return
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 用户ID设定
	 * 
	 * @param userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
