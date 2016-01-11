package com.lvmama.scs.learnspringmvc.controller;

import com.lvmama.scs.learnspringmvc.model.persistantobject.ProductPo;
import com.lvmama.scs.learnspringmvc.model.valueobject.ProductVo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 控制器 Servlet
 * Created by sunchuansheng on 2016/1/8.
 */
//@javax.servlet.annotation.WebServlet(name = "ControllerServlet", urlPatterns = {"*.action"})
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the action name
        String uri = request.getRequestURI();
        String actionName = uri.substring(uri.lastIndexOf("/") + 1);

        // forward to a view
        String dispatchUrl = "/index.html";
        if(actionName.equals("product_input.action")){
            dispatchUrl  = "/product/input.jsp";
        }else if(actionName.equals("product_save.action")){
            request.setCharacterEncoding("utf-8");

            ProductVo productVo = new ProductVo();
            productVo.setName(request.getParameter("name"));
            productVo.setDescription(request.getParameter("description"));
            productVo.setPrice(BigDecimal.valueOf(Double.valueOf(request.getParameter("price")))); // 没有做转换校验

            // transfer a VO into a PO
            ProductPo productPo = new ProductPo();
            productPo.setName(productVo.getName());
            productPo.setDescription(productVo.getDescription());
            productPo.setPrice(productVo.getPrice());

            // 操作 PO 进行
            // ProductService.save(productPo);

            // 构建一个用于响应的 VO 对象
            request.setAttribute("product", productVo);
            dispatchUrl = "/product/details.jsp";
        }

        // 设置 utf-8 编码
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        RequestDispatcher dispatcher = request.getRequestDispatcher(dispatchUrl);
        dispatcher.forward(request, response);
    }
}
