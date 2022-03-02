package kr.co.bttf.mybatis;


import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory factory;
	
	// 클래스 초기화 블럭(클래스가 처음 로딩될 때 한번만 수행)
	static {
		
		String resource = "./kr/co/bttf/mybatis/config.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}