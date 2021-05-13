package com.wz.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@Import(JdbcConfig.class)
@ComponentScan(basePackages = "com")
@EnableTransactionManagement//开启事务
public class SpringConfig {
    @Bean("druidDataSource")
    public DruidDataSource getDruiDataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/ccs?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false");
        ds.setUsername("root");
        ds.setPassword("07582");
        return ds;
    }
    @Bean("jdbcDrui")
    public JdbcTemplate jdbcTemplate(@Qualifier("druidDataSource") DataSource dataSource) {
       return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("druidDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
