package api.demo;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/11/24 10:39 AM
 */
public class NewOrder {

    public static void requestProd() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 666);
        newOrderParam.put("cOrderId", UUIDGenerator.generate());
        newOrderParam.put("symbol", "AUDUSD");
        newOrderParam.put("side", "SELL");
        newOrderParam.put("qty", "5");
        newOrderParam.put("tenor", "ON");
        newOrderParam.put("type", "MKT");
        newOrderParam.put("memo", "~~~~");
        newOrderParam.put("notifyUrl", "https://fx1.pingpongx.com/cb/abc");
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "ABCDEFG", "https://fx1.pingpongx.com/v2/tx/order/create");
        System.out.println(s);
    }

    public static void requestLocal() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 666);
        newOrderParam.put("cOrderId", UUIDGenerator.generate());
        newOrderParam.put("symbol", "USDCNH");
        newOrderParam.put("side", "SELL");
        newOrderParam.put("qty", "10");
        newOrderParam.put("tenor", "ON");
        newOrderParam.put("type", "MKT");
        newOrderParam.put("memo", "~~~~");
        newOrderParam.put("notifyUrl", "http://127.0.0.1:8080/cb/abc");
        newOrderParam.put("nonce", "c93408e21c874298a5f6b57cb43db4c26bd7a99d80944eaf8c4cc543691d2faf");
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "ABCDEFG", "http://127.0.0.1:8080/v2/tx/order/create");
        System.out.println(s);
    }

    public static void main(String[] args) {
        requestProd();
        // requestLocal();
    }
}
