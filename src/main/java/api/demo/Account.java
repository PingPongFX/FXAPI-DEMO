package api.demo;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/12/3 2:57 PM
 */
public class Account {

    public static void request() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 123);
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.get(newOrderParam, "secretKey", "https://fx1.pingpongx.com/v2/account/query");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
