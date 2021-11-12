package com.heqing.feign.service.fallback;

import com.heqing.feign.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author heqing
 * @date 2019/7/2 14:41
 */
@Component
public class DemoServiceFallBack implements DemoService {

    @Override
    public String server(String str) {
        return "调用远程服务失败！";
    }

}
