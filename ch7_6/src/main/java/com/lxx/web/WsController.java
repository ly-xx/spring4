package com.lxx.web;

import com.lxx.domain.WiselyMessage;
import com.lxx.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping(value = "/ws")
    public String ws() {
        return "ws";
    }

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        return new WiselyResponse("Welcome " + message.getName() + " !");
    }
}
