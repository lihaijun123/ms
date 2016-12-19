package com.focustech.focus3d.agent.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.focustech.focus3d.agent.model.AgentLogin;
/**
 *
 * *
 * @author lihaijun
 *
 */
public class AuthFilter implements Filter {
	public static final String SESSION_KEY = "loginInfo";

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpSession session = request.getSession();
		Object sessinObj = session.getAttribute(SESSION_KEY);
		String servletPath = request.getServletPath();
		boolean isPass = true;
		if(sessinObj != null) {
			//登录用户验证功能菜单权限
			if(sessinObj instanceof AgentLogin){
				AgentLogin agentLogin = (AgentLogin)sessinObj;
				Long userId = agentLogin.getUserId();
				if(userId != null){
					
					/*List<AgentUserRole> roles = agentUserRoleService.getListByUserId(userId);
					if(ListUtils.isNotEmpty(roles)){
						List<AgentRoleResource> resources = agentRoleResourceService.getListByRoleId(roles.get(0).getRoleSn());
						for (AgentRoleResource agentRoleResource : resources) {
							AgentResource resource = agentResourceService.selectBySn(agentRoleResource.getResourceSn(), AgentResource.class);
							if(resource.getResourceInterface().startsWith(servletPath)){
								break;
							}
						}
						isPass = false;
					} else {
						//没有分配任何权限，无权访问菜单
						isPass = false;
					}*/
					
				}
			}

		}
		if(isPass){
			fc.doFilter(req, resp);
		}
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {

	}

	@Override
	public void destroy() {

	}

}
