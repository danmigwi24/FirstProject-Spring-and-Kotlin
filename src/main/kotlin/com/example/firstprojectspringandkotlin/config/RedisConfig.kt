package com.example.firstprojectspringandkotlin.config

/*
@Configuration
class RedisConfig {

    @Value("\${spring.redis.host}")
    lateinit var redisHost: String

    @Value("\${spring.redis.port}")
    var redisPort: Int = 0

    @Value("\${spring.redis.password}")
    lateinit var redisPassword: String

    @Bean
    fun jedisConnectionFactory(): JedisConnectionFactory {
        val factory = JedisConnectionFactory()
        factory.hostName = redisHost
        factory.port = redisPort
        return factory
    }

    @Bean
    fun redisTemplate(jedisConnectionFactory: JedisConnectionFactory): RedisTemplate<String, Any> {
        val template = RedisTemplate<String, Any>()
        template.setConnectionFactory(jedisConnectionFactory)
        template.afterPropertiesSet()
        return template
    }
}


echo "# FirstProject-Spring-and-Kotlin" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/danmigwi24/FirstProject-Spring-and-Kotlin.git
git push -u origin main

*/
