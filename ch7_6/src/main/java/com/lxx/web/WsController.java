package com.lxx.web;

import com.lxx.domain.WiselyMessage;
import com.lxx.domain.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * 演示控制器
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/19 17:34
 * @since JDK 1.8
 */
@Controller
public class WsController {

    /**
     * 点对点式，通过SimpMessagingTemplate发送消息
     */
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping(value = "/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("why")) {
            // 参数1：接收消息的用户，参数2：浏览器订阅的地址，参数3：消息
            messagingTemplate.convertAndSendToUser("wisely", "/queue/notifications",
                    principal.getName() + " -send：" + msg);
        } else {
            messagingTemplate.convertAndSendToUser("why", "/queue/notifications",
                    principal.getName() + " -send：" + msg);
        }
    }


    @RequestMapping(value = "/ws")
    public String ws() {
        return "ws";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/chat")
    public String chat() {
        return "chat";
    }

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        return new WiselyResponse("Welcome " + message.getName() + " !");
    }


}
