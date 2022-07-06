package com.example.mwcbackend.controller.request;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.mwcbackend.oauth.Role;

public class UserRequest {

	private Long userId;
	private Long socialId;
	private String email;
	private String nickName;
	private String picture;
	private String status;
	private String follower;
	private Role role;

	public UserRequest(){

	}

	public UserRequest(Long userId, Long socialId, String email, String nickName, String picture, String status,
		String follower, Role role) {
		this.userId = userId;
		this.socialId = socialId;
		this.email = email;
		this.nickName = nickName;
		this.picture = picture;
		this.status = status;
		this.follower = follower;
		this.role = role;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSocialId() {
		return socialId;
	}

	public void setSocialId(Long socialId) {
		this.socialId = socialId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFollower() {
		return follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
