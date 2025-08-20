package com.example.javafresher.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfigBuilderCustomizer;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocketFactory;
import java.time.Duration;
import java.util.Optional;

@Configuration
@EnableCaching
public class RedisConfig {
    public JedisConnectionFactory jedisConnectionFactory() {


        return new JedisConnectionFactory();
    }
}
