package org.albert.course.servlets;

import org.albert.course.service.CoreService;
import org.albert.course.util.SignUtil;

import java.io.IOException;
import java.io.PrintWriter;

public class CoreServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // 将请求、响应的编码均设置为 UTF-8（防止中文乱码）
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
       //调用核心业务类处理消息
        String respMessage = CoreService.processRequest(request);
        //响应消息
        PrintWriter out = response.getWriter();
        out.print(respMessage);
        out.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //微信加密签名
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        System.out.println("测试连接");

        PrintWriter out = response.getWriter();
        // 通过检验 signature 对请求进行校验， 若校验成功则原样返回 echostr， 表示接入
        //成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
        out = null;
    }
}
