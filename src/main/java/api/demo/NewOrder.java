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

        // 用户ID
        newOrderParam.put("userId", 123);

        // 客户订单号
        newOrderParam.put("cOrderId", "");

        // 货币对
        newOrderParam.put("symbol", "AUDUSD");

        // 买卖方向
        newOrderParam.put("side", "SELL");

        // 交易数量
        newOrderParam.put("qty", "5.00");

        // 交割期限 T+0 ON
        newOrderParam.put("tenor", "ON");

        // 类型 MKT 市价
        newOrderParam.put("type", "MKT");

        // 备注 交易状态通知一并返回
        newOrderParam.put("memo", "~~~~");

        // 交易状态通知URL
        newOrderParam.put("notifyUrl", "");

        // 64位随机数
        newOrderParam.put("nonce", UUIDGenerator.generate() + UUIDGenerator.generate());

        // 客户端时间戳
        newOrderParam.put("timestamp", System.currentTimeMillis());

        String s = RequestUtil.post(newOrderParam, "secretKey", "https://fx1.pingpongx.com/v2/tx/order/create");
        System.out.println(s);
    }

    public static void main(String[] args) {
        request();
    }
}
