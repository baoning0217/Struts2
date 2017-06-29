package com.siqian.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = -523178274770002889L;
	
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if("baoning".equals(username) && "123456".equals(password)){
			request.getSession().setAttribute("username", username);
			
			return SUCCESS;
		}else{
			request.setAttribute("login.message","用户名或密码错误");
			return "failer";
		}
		

	}

}
