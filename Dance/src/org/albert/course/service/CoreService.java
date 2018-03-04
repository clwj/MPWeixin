package org.albert.course.service;

import org.albert.course.util.MessageUtil;
import org.albert.course.message.resp.TextMessage;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Date;

/**
 * Author Wenjian Lu
 * @Dara 2018-2-4
 * 用于处理微信发来的请求
 */
public class CoreService {

    public static String processRequest(HttpServletRequest request){
        String respMessage = null;
        try {
            // 默认返回的文本消息内容
            String respContent = "请求处理异常，请稍候尝试！";

            // xml 请求解析
            Map<String, String> requestMap = MessageUtil.parseXml(request);

            // 发送方帐号（open_id）
            String fromUserName = requestMap.get("FromUserName");
            // 公众帐号
            String toUserName = requestMap.get("ToUserName");
            // 消息类型
            String msgType = requestMap.get("MsgType");
            //消息内容
            String content = requestMap.get("Content");
            // 默认回复文本消息
            TextMessage textMessage = new TextMessage();
            textMessage.setToUserName(fromUserName);
            textMessage.setFromUserName(toUserName);
            textMessage.setCreateTime(new Date().getTime());
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
            textMessage.setFuncFlag(0);
            //事件推送
            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
                // 事件类型
                String eventType = requestMap.get("Event");
                // 订阅
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
                    respContent = "谢谢您的关注！";
                }
                // 取消订阅
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
                }
                // 自定义菜单点击事件
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)){
                    String eventkey = requestMap.get("EventKey");
                    //----------------------------------------
                    // 第一个 菜单  共享信息
                    //-----------------------------------------
                    //找老师菜单
                    if(eventkey.equals("11")) {
                        respContent = "找老师菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //找工作菜单
                    else if(eventkey.equals("12")){
                        respContent = "找工作菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //找教室菜单
                    else if(eventkey.equals("13")){
                        respContent = "找教室菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //北舞教师考级
                    else if(eventkey.equals("14")){
                        respContent = "北舞教师考级菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }

                    //------------------------------------
                    //第二个菜单   建立档案
                    //-----------------------------------
                    //机构信息
                    else if(eventkey.equals("21")){
                        respContent = "机构信息菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //教师信息
                    else if(eventkey.equals("22")){
                        respContent = "教师信息菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //信息分享
                    else if(eventkey.equals("23")){
                        respContent = "信息分享菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //------------------------------------
                    //第三个菜单    关于我们
                    //-------------------------------------

                    //往期精彩
                    else if(eventkey.equals("31")){
                        respContent = "往期精彩菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //联系方式

                    else if(eventkey.equals("32")){
                        respContent = "联系方式菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //线下教师
                    else if(eventkey.equals("33")){
                        respContent = "线下教师菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                    //合作平台
                    else if(eventkey.equals("34")){
                        respContent = "合作平台菜单被点击";
                        textMessage.setContent(respContent);
                        respMessage = MessageUtil.textMessageToXml(textMessage);
                    }
                }

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return respMessage;

    }
}
