package com.honggom.springbootexternalread.config;

import com.honggom.springbootexternalread.datasource.MyDataSource;
import com.honggom.springbootexternalread.datasource.MyDataSourcePropertiesV2;
import com.honggom.springbootexternalread.datasource.MyDataSourcePropertiesV3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
@EnableConfigurationProperties(MyDataSourcePropertiesV3.class)
@RequiredArgsConstructor
public class MyDataSourceConfigV3 {

    private final MyDataSourcePropertiesV3 properties;

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
