package com.honggom.springbootexternalread;

import com.honggom.springbootexternalread.config.MyDataSourceEnvConfig;
import com.honggom.springbootexternalread.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


//@Import(MyDataSourceEnvConfig.class)
@Import(MyDataSourceValueConfig.class)
@SpringBootApplication(scanBasePackages = "com.honggom.springbootexternalread.datasource")
public class SpringBootExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExternalReadApplication.class, args);
    }

}
