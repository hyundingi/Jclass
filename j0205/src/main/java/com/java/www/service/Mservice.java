package com.java.www.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Mservice {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
