package FoundModel.AbstractFactory;

/**
 * Created by sunpengwei on 2016/8/1.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("这是短消息发送信息");
    }
}
