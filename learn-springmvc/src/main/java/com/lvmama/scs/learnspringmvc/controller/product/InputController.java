package com.lvmama.scs.learnspringmvc.controller.product;

import com.lvmama.scs.learnspringmvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Created by sunchuansheng on 2016/1/8.
 */
public class InputController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        return "/product/input.jsp";
    }
}
