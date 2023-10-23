package com.example.geode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.client.PoolFactoryBean;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.data.gemfire.support.ConnectionEndpoint;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;
import org.springframework.session.data.gemfire.serialization.SessionSerializer;
import org.springframework.session.data.gemfire.serialization.pdx.provider.PdxSerializableSessionSerializer;


@Configuration
@ClientCacheApplication(name = "SpringSessionDataGeodeClient")
@EnableGemfireRepositories
@EnableEntityDefinedRegions
@EnableGemFireHttpSession
public class SessionConfig {


    @Bean
    public PoolFactoryBean gemfirePool() {
        PoolFactoryBean gemfirePool = new PoolFactoryBean();
        gemfirePool.addLocators(new ConnectionEndpoint("locator", 10334));
        return gemfirePool;
    }

    @Bean(name = "SessionSerializerRegisteredBeanAlias")
    public SessionSerializer sessionSerializer() {
        return new PdxSerializableSessionSerializer();
    }
}
