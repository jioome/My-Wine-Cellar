package com.example.mwcbackend.oauth.filter;

import com.example.mwcbackend.oauth.AuthToken;
import com.example.mwcbackend.oauth.AuthTokenProvider;
import com.example.mwcbackend.oauth.util.HeaderUtil;

import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final AuthTokenProvider tokenProvider;

	@Override
	protected void doFilterInternal(
		HttpServletRequest request,
		HttpServletResponse response,
		FilterChain filterChain) throws ServletException, IOException {

		String tokenInHeader = HeaderUtil.getAccessToken(request);
		if (StringUtils.hasText(tokenInHeader)) {
			AuthToken token = tokenProvider.convertAuthToken(tokenInHeader);

			if (token.validate()) {
				Authentication authentication = tokenProvider.getAuthentication(token);
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}
		filterChain.doFilter(request, response);
	}
}