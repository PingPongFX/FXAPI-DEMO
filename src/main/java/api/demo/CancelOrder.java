package api.demo;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/11/24 10:39 AM
 */
public class CancelOrder {

    public static void requestProd() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 666);
        newOrderParam.put("orderId", "15433979336258638");
        newOrderParam.put("notifyUrl", "https://fx1.pingpongx.com/cb/bcd");
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "ABCDEFG", "https://fx1.pingpongx.com/v2/tx/order/cancel");
        System.out.println(s);
    }

    public static void main(String[] args) {
        requestProd();
        // requestLocal();
    }
}
