package api.demo;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/11/24 11:36 AM
 */
public class Quote {

    public static void request() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 666);
        newOrderParam.put("symbol", "USDCNH");
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.get(newOrderParam, "ABCD123EFG", "http://127.0.0.1:8080/v2/tx/price/quote");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
