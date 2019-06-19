package com.lxx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * 广播式配置类
 *
 * 广播式：服务端有消息时，将消息发送给所有连接了当前endpoint的浏览器
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/19 17:21
 * @since JDK 1.8
 */
@Configuration
@EnableWebSocketMessageBroker // 1:开启使用stomp协议来传输基于代理的消息
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    // 2 extends AbstractWebSocketMessageBrokerConfigurer, 由于该类已过时，替换为WebSocketMessageBrokerConfigurer

    /**
     * 注册stomp协议的节点，并映射指定的url
     *
     * @param registry 节点注册器
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 注册节点，并指定使用SockJS协议
        registry.addEndpoint("/endpointWisely").withSockJS();
    }

    /**
     * 配置消息代理
     * @param registry 消息代理
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // 使用广播式，需配置topic消息代理
        registry.enableSimpleBroker("/topic");
    }
}
