package com.lvmama.scs.learnspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器接口
 *
 * Created by sunchuansheng on 2016/1/8.
 */
public interface Controller {

    /**
     * 处理 request 返回要跳转的 url
     * @param request
     * @param response
     * @return 下一个 url
     */
    String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
