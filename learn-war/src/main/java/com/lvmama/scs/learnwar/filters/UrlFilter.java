package com.lvmama.scs.learnwar.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * 拦截url
 * Created by sunchuansheng on 2015/12/29.
 */
public class UrlFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UrlFilter init()");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter(),url:" +
                servletRequest.getProtocol() + "://" +
                servletRequest.getServerName() + ":" +
                servletRequest.getServerPort() + "/" +
                servletRequest.getRequestDispatcher("/"));
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("UrlFilter destroy()");
    }
}
