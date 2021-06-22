package com.convict.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author: Convict.Yellow
 * @date: 2021/6/22 23:20
 * @description: Easy to configure multiple data sources, such as readSource and writeSource
 */
@SpringBootConfiguration
public class DatasourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

}
