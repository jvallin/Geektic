package jvallin.controller;

import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;



/**
 * Srping application configuration. Lacks some annotations.
 * @author J VALLIN
 */

@EnableTransactionManagement
@ComponentScan(value = {"jvallin"})
@Configuration
public class AppConfig
{
    @Bean
    public LocalContainerEntityManagerFactoryBean emf() {
        LocalContainerEntityManagerFactoryBean result = new LocalContainerEntityManagerFactoryBean();
        result.setPersistenceUnitName("GEEKTIC");
        result.setDataSource(dataSource());
        result.setPersistenceProviderClass(HibernatePersistence.class);
        return result;
    }

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource("jdbc:hsqldb:hsql://localhost/GEEKTIC", 
        									"sa", 
        									"");
    }

    @Bean
    public PlatformTransactionManager txManager() {
        return new JpaTransactionManager(emf().getObject());
    }
}
