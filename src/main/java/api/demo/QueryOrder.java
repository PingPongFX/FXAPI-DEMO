package api.demo;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/12/3 2:20 PM
 */
public class QueryOrder {

    public static void request() {

        Map<String, Object> newOrderParam = new HashMap<>();

        // 用户ID
        newOrderParam.put("userId", 123);

        // 客户订单号
        newOrderParam.put("cOrderId", "15433979336258638");

        // 平台订单号
        newOrderParam.put("orderId", "15433979336258638");

        // 64位随机数
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());

        // 客户端时间戳
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "secretKey", "https://fx1.pingpongx.com/v2/tx/order/cancel");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
