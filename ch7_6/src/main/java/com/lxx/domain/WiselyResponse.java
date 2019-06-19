package com.lxx.domain;

/**
 * 响应类
 * <p>
 * 服务端向浏览器发送的消息
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/19 17:32
 * @since JDK 1.8
 */
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
