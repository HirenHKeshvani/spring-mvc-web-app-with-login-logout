package com.deltafixes.spring.util;

import javax.servlet.http.HttpServletRequest;

public class Utils {
	public static boolean isEmpty(String obj) {
		if (obj.length() == 0 || obj.isEmpty())
			return false;
		else
			return true;
	}

	public static boolean isNotEmpty(String obj) {
		return !isEmpty(obj);
	}
	
	public static boolean isSessionAvailable(HttpServletRequest request) {
		if (request.getSession().getAttribute("email") != null)
			return true;
		else
			return false;

	}
}
