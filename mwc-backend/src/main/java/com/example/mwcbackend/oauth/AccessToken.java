package com.example.mwcbackend.oauth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccessToken {
	private String access_token;
	private String token_type;
	private long expires_in;
	private long refresh_token_expires_in;
}
