package cn.plasticlove.weixinsell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.plasticlove.weixinsell.dao")
public class WeixinSellApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixinSellApplication.class, args);
    }

}
