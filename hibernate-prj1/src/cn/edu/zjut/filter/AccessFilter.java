package cn.edu.zjut.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AccessFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = (HttpSession) request.getSession();

        String user = (String) session.getAttribute("user");

        if (user == null &&
                request.getRequestURI().contains("login.jsp") == false &&
                request.getRequestURI().contains("register.jsp") == false){
            response.sendRedirect("login.jsp");
            return ;

        }

        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
