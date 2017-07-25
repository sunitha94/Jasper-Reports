package com.ravi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

@Configuration
@EnableWebMvc
public class AdditionalConfig extends WebMvcConfigurerAdapter{	
	
	 @Override
	    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {

	        configurer.enable();
	    }
	    @Bean
	    public JasperReportsViewResolver getJasperReportsViewResolver() {

	        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
	        resolver.setPrefix("classpath:jasperreports/reports/");
	        resolver.setSuffix(".jrxml");

	        resolver.setReportDataKey("datasource");
	        resolver.setViewNames("*sample_*");
	        resolver.setViewClass(JasperReportsMultiFormatView.class);
	        resolver.setOrder(0);
	        return resolver;
	    } 	
}
