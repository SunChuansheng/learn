package com.lvmama.scs.learnspringmvc.controller.product;

import com.lvmama.scs.learnspringmvc.controller.Controller;
import com.lvmama.scs.learnspringmvc.model.persistantobject.ProductPo;
import com.lvmama.scs.learnspringmvc.model.valueobject.ProductVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

/**
 * 保存的 Controller
 * Created by sunchuansheng on 2016/1/8.
 */
public class SaveController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
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
        return "/product/details.jsp";
    }
}
