package com.ohgiraffers.member.common;

import com.mysql.cj.exceptions.StatementIsClosedException;
import com.ohgiraffers.member.mapper.MemberMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/memberdb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){

        if(sqlSessionFactory == null){
            Environment environment =
                    new Environment("dev"
                    ,new JdbcTransactionFactory()
                    ,new PooledDataSource(DRIVER,URL,USER,PASSWORD));

            Configuration configuration = new Configuration(environment);
            configuration.addMapper(MemberMapper.class);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);{

            }
        } return sqlSessionFactory.openSession(false);

    }


}
