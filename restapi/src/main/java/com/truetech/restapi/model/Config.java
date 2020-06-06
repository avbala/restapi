package com.truetech.restapi.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("app")
public class Config {

		
	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private int port;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String passwordstring;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.jpa.generate-ddl}")
	private String generateddl;
	
	@Value("spring.jpa.properties.hibernate.dialect")
	private String dialect;
	
	@Value("spring.jpa.hibernate.ddl-auto")
	private String ddlauto;
	
	@Value("spring.datasource.initialization-mode")
	private String initializationmode;
	
	
	public Config()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordstring() {
		return passwordstring;
	}
	public void setPasswordstring(String passwordstring) {
		this.passwordstring = passwordstring;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGenerateddl() {
		return generateddl;
	}
	public void setGenerateddl(String generateddl) {
		this.generateddl = generateddl;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public String getDdlauto() {
		return ddlauto;
	}
	public void setDdlauto(String ddlauto) {
		this.ddlauto = ddlauto;
	}
	public String getInitializationmode() {
		return initializationmode;
	}
	public void setInitializationmode(String initializationmode) {
		this.initializationmode = initializationmode;
	}
	
	
	
}
