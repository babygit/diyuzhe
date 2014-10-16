package com.qian.diyuzhe.interceptor; 

import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.qian.diyuzhe.constant.SystemConstant;
 

public class CommonInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger("CommonInterceptor");

	public CommonInterceptor() {
		
	}

	private String mappingURL;// 利用正则映射到需要拦截的路径
	
	private Set<String> releaseURL; //放行url
	
	public Set<String> getReleaseURL() {
		return releaseURL;
	}

	public void setReleaseURL(Set<String> releaseURL) {
		this.releaseURL = releaseURL;
	}

	public void setMappingURL(String mappingURL) {
		this.mappingURL = mappingURL;
	}

	/**
	 * 在业务处理器处理请求之前被调用 如果返回false 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
	 * 
	 * 如果返回true 执行下一个拦截器,直到所有的拦截器都执行完毕 再执行被拦截的Controller 然后进入拦截器链,
	 * 从最后一个拦截器往回执行所有的postHandle() 接着再从最后一个拦截器往回执行所有的afterCompletion()
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.info("==============执行顺序: 1、preHandle================");
		String url = request.getRequestURI().toString();
		  response.setContentType("text/html; charset=utf-8"); 
		String path = request.getContextPath(); 
		String urlstr = url.replaceAll(path+"/service","");
		Object user = request.getSession().getAttribute(SystemConstant.USER_IN_SESSION);
		boolean needLogin=false; //是否需要登录
		if(user==null &&needLogin){
			 if (url.contains(".jsonx")){
				 PrintWriter writer = response.getWriter();
//				 writer.print(JSON.toJSON(ResultProxyUtils.getErrorResultProxy(ResultProxyUtils.ERRORCODE_10002)));
				 writer.flush();
				 writer.close();
				 return false;
			 }
		}
//		response.sendRedirect(path+"/login.jsp");
		return true;
	}

	// 在业务处理器处理请求执行完成后,生成视图之前执行的动作
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("==============执行顺序: 2、postHandle================");
	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用
	 * 
	 * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
			if (ex instanceof RuntimeException) {
				logger.error("afterCompletion|Error|" + ex.getLocalizedMessage());
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
	}

}