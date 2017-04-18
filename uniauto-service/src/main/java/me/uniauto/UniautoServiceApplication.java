package me.uniauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by wangkuan on 2017/4/14.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("me.uniauto.mapper.*")
public class UniautoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniautoServiceApplication.class, args);
    }


}
