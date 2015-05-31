package com.heboot.hotel.response.user;

import com.heboot.hotel.model.User;
import com.heboot.hotel.response.BaseResponse;

public class UserResponse extends BaseResponse {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
	
}
