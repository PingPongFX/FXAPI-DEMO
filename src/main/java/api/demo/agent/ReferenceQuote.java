package api.demo.agent;

import api.demo.util.RequestUtil;
import api.demo.util.UUIDGenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 * @date 2018/11/24 11:36 AM
 */
public class ReferenceQuote {

    public static void request() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 42);
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());
        newOrderParam.put("queries", "USDCNH,CNHUSD");

        String s = RequestUtil
            .get(newOrderParam, "285fff0a0e824a678e8cc9632daec4d2", "https://dev-fx1.pingpongx.com/v2/agent/tx/quote/reference");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
