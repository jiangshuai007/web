package com.ynu.sei.lib.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// import org.springframework.web.filter.CorsFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {

    public CORSFilter() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        // x-requested-with, authorization,client_id,Access-Control-Allow-Origin,request-token,baidu-pushkey

        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}

/*
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter {

	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public CorsFilter corsFilter() {
		// 1.添加CORS配置信息
		CorsConfiguration config = new CorsConfiguration();
		// 放行哪些原始域
		config.addAllowedOrigin("*");
		// 是否发送Cookie信息
		config.setAllowCredentials(true);
		// 放行哪些原始域(请求方式)
		config.addAllowedMethod("*");
		// 放行哪些原始域(头部信息)
		config.addAllowedHeader("*");
		// 暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
		config.addExposedHeader("Content-Type, Accept, X-Requested-With, remember-me,Access-Control-Request-Headers,Authorization,access-control-allow-origin,client_id,request-token");
		// config.addExposedHeader(HttpHeaderConStant.X_TOTAL_COUNT);

	    // Access-Control-Request-Headers: client_id,access-control-allow-origin,request-token,baidu-pushkey,authorization
		// 2.添加映射路径
		UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
		configSource.registerCorsConfiguration("/**", config);

		// 3.返回新的CorsFilter.
		return new CorsFilter(configSource);
	}

}
*/


/*
@Component
public class CORSFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filtering on...........................................................");
		HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "*");
		response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");

		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) {}

	@Override
	public void destroy() {}

}
*/