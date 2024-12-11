package com.honggom.springbootexternalread.config;

import com.honggom.springbootexternalread.datasource.MyDataSource;
import com.honggom.springbootexternalread.datasource.MyDataSourcePropertiesV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
//@EnableConfigurationProperties(MyDataSourcePropertiesV1.class) -> @ConfigurationPropertiesScan 으로 대체 가능 (main class에 선언)
@RequiredArgsConstructor
public class MyDataSourceConfigV1 {

    private final MyDataSourcePropertiesV1 properties;

    @Bean
    public MyDataSource dataSource() {
        return new MyDataSource(
                properties.getUrl(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getEtc().getMaxConnection(),
                properties.getEtc().getTimeout(),
                properties.getEtc().getOptions());
    }

}
