package com.lvmama.scs.learnspringmvc.controller;

import com.lvmama.scs.learnspringmvc.controller.product.InputController;
import com.lvmama.scs.learnspringmvc.controller.product.SaveController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 调度者
 *
 * Created by sunchuansheng on 2016/1/8.
 */
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 统一使用utf-8编码
        System.out.println("request的默认编码：" + request.getCharacterEncoding());
        System.out.println("response的默认编码：" + response.getCharacterEncoding());
        System.out.println("response的默认ContentType：" + response.getContentType());
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        // get the action name
        String uri = request.getRequestURI();
        String actionName = uri.substring(uri.lastIndexOf("/") + 1);

        // 根据 action name 调用相应的 Controller
        String dispatchUrl = "index.html";
        if(actionName.equals("product_input.action")||actionName.equals("product_input")){
            dispatchUrl = new InputController().handleRequest(request, response);
        }else if(actionName.equals("product_save.action")||actionName.equals("product_save")){
            dispatchUrl = new SaveController().handleRequest(request, response);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(dispatchUrl);
        dispatcher.forward(request,response);
    }
}
