package com.hackaton.case2.config;

import com.hackaton.case2.common.UUIDTypeHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.UUID;

@Configuration
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        // Регистрация TypeHandler
        sessionFactory.getObject().getConfiguration().getTypeHandlerRegistry()
                .register(UUID.class, new UUIDTypeHandler());

        return sessionFactory.getObject();
    }
}
