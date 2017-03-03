<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
String q =request.getParameter("q");
String v = request.getParameter("v");
System.out.println("Q:"+q+"/V:"+v);
	Map map = new HashMap();
		map.put("name","haeri");
		map.put("pw", "123");
		map.put("age","18");
		map.put("alive",true);
		map.put("hobby",new String[]{"십자수","뜨개질"});
	ObjectMapper om = new ObjectMapper(); 
	String str = om.writeValueAsString(map);
	out.println(str);

%>