package com.dhcnhn.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;


public class FormUtil {
	public static <T> T toModel(Class<T> tClass,HttpServletRequest request)
	{
		T object =null;
		try {
			object=tClass.newInstance();
			BeanUtils.populate(object, request.getParameterMap());
		} catch (InstantiationException |  IllegalAccessException e) {
			System.out.print(e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.print(e.getMessage());
		}
		return object;
	}
}
