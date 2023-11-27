package com.cg.trainee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//Embedded  server(tomcat),,starters,actuators
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.cg.trainee.repository"),
	      @ComponentScan("com.cg.trainee.service") })//@Service,@Repository @Entity

//@ComponentScan("com.cg.trainee")		Spring boot -autoconfiguration,embeded server,starters ,actuator
public class AppConfig {//configuration

   @Bean
   public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
      factoryBean.setPersistenceUnitName("spring_jpa");
      return factoryBean;
   }

   @Bean
   public JpaTransactionManager getJpaTransactionManager() {
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
      return transactionManager;
   }
}
//spring has given annotations for user defined classes but not predefined classes we have to configure explicitly

//spring boot (STS)most of the classes which are commonly used already configured by the spring boot