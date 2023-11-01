package com.ohgiraffers.member.common;

import com.ohgiraffers.member.run.MemberMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/memberdb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        if (sqlSessionFactory == null) {
            Environment environment =
                    new Environment("dev",
                            new JdbcTransactionFactory(),
                            new PooledDataSource(DRIVER, URL, USER, PASSWORD));

            Configuration configuration = new Configuration(environment);
            /*매퍼 인터페이스를 추가하고 나서 기입을 해준다.*/
            configuration.addMapper(MemberMapper.class);

            //재료던져주고 만들어라
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }
        return sqlSessionFactory.openSession(false);
    }
}