package api.demo.callback;

import api.demo.util.RequestUtil;
import api.demo.util.SHAUtil;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxian
 * @date 2018/11/17 2:59 PM
 */
@RestController
@RequestMapping("path") //自行定义
public class MockCallback {

    @PostMapping("abc") //自行定义
    public String getResp(HttpServletRequest request) throws IOException {

        String sign = request.getHeader("sign");
        String body = RequestUtil.getBody(request);

        // 验签
        SHAUtil.verifySha512(body + "secretKey", sign);
        //TODO 业务逻辑
        return "true";
    }

    @PostMapping("bcd") //自行定义
    public String getCancelReject(HttpServletRequest request) throws IOException {

        String sign = request.getHeader("sign");
        String body = RequestUtil.getBody(request);

        // 验签
        SHAUtil.verifySha512(body + "secretKey", sign);
        //TODO 业务逻辑
        return "true";
    }
}
