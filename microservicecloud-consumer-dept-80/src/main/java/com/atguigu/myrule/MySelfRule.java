package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author OliverYu
 * @Date 2019/2/14 16:33
 * @Email 253757635@qq.com
 * @Description TODO
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {

        //return new RandomRule();
        //return new RoundRobinRule();
        return new RoundRobinRule_Oliver();
    }

}
