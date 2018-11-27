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

    public static void request() {

        Map<String, Object> newOrderParam = new HashMap<>();

        newOrderParam.put("userId", 666);
        newOrderParam.put("cOrderId", "aaaaaaaaaa101");
        newOrderParam.put("symbol", "USDCNH");
        newOrderParam.put("side", "SELL");
        newOrderParam.put("qty", "0.11");
        newOrderParam.put("tenor", "ON");
        newOrderParam.put("type", "MKT");
        newOrderParam.put("memo", "~~~~");
        newOrderParam.put("notifyUrl", "http://127.0.0.1:8080/cb/abc");
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "ABCDEFG", "http://127.0.0.1:8080/v2/tx/order/create");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
