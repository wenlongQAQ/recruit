package no.name.recruit.config;

import lombok.extern.slf4j.Slf4j;
import no.name.recruit.inteceptor.LoginInteceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
@Slf4j
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Autowired
    private LoginInteceptor loginInteceptor;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        //设置对象转换器
        messageConverter.setObjectMapper(new JacksonObjectMapper());
        //将消息转换器对象追加到mvc框架的转换器集合中
        converters.add(0,messageConverter);
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInteceptor).addPathPatterns("/**").excludePathPatterns("/static/page/login.html");
        super.addInterceptors(registry);
    }
}