package com.honggom.springbootexternalread;

import com.honggom.springbootexternalread.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;


//@Import(MyDataSourceEnvConfig.class)
//@Import(MyDataSourceValueConfig.class)
//@Import(MyDataSourceConfigV1.class)
//@Import(MyDataSourceConfigV2.class)
@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = "com.honggom.springbootexternalread.datasource")
@ConfigurationPropertiesScan
public class SpringBootExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExternalReadApplication.class, args);
    }

}
