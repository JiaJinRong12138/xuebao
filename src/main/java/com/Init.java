package com;

import com.getTicket.utils.LoggerUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Init implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 清空登陆信息
         */
        LoggerUtil.getLogger().info("【INIT】：初始化完成");

    }
}
