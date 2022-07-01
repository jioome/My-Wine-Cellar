package com.example.mwcbackend.controller;


import java.io.IOException;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mwcbackend.oauth.AuthToken;
import com.example.mwcbackend.oauth.AuthTokenProvider;
import com.example.mwcbackend.oauth.service.OAuthService;

@RestController
@RequiredArgsConstructor
public class OAuthController {
	@Autowired
	private OAuthService oAuthService;
	private AuthTokenProvider jwtManager;

	@RequestMapping("/oauth2/users/kakao")
	public AuthToken kakaoLogin(@RequestParam String code) throws IOException {
		String accessToken = oAuthService.getKakaoAccessToken(code);
		System.out.println("accessToken : " +accessToken);
		AuthToken jwtToken = oAuthService.getKakaoUserInfo(accessToken);
		System.out.println("jwtToken : " + jwtToken.getToken());
		return jwtToken;
	}
}
