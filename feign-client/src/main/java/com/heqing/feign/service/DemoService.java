package com.heqing.feign.service;

import com.heqing.feign.service.fallback.DemoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author heqing
 * @date 2021/7/22 15:28
 */
@FeignClient(name="study-feign-server", fallback= DemoServiceFallBack.class)
public interface DemoService {

    /**
     * 测试用例
     * @param str
     * @return
     */
    @RequestMapping(value="/feign/server", method= RequestMethod.GET)
    String server(@RequestParam String str);
}
