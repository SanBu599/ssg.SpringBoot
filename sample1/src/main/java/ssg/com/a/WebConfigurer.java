package ssg.com.a;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 접속 허가 설정
@Configuration
public class WebConfigurer implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		// registry.addMapping("/**").allowedOrigins("*"); 모든거 다 허용
		registry.addMapping("/**").allowedOrigins("http://localhost:9100");
	}

	
}
