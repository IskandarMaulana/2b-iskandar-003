package com.astratech._2biskandar112.services;

public interface RabbitMQService {
    public String publishMessage(String message);
    public String consumeMessage(String message);
    public String callExternalApi(String url);
}
