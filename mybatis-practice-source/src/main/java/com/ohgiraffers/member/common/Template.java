package com.ohgiraffers.member.common;


import com.ohgiraffers.member.mapper.MemberMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.lang.reflect.Member;

public class Template {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/memberdb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "1q2w3e4R!";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){

        if (sqlSessionFactory == null){
            //Environment는 데이터베이스 연결 정보를 관리하기 위한 클래스이고
            // 데이터베이스의 정보를 담고, MyBatis의 Configuration 객체에 전달
            Environment environment =
                new Environment("dev"
                , new JdbcTransactionFactory()
                , new PooledDataSource(DRIVER, URL, USER, PASSWORD));

            Configuration configuration = new Configuration(environment);
            // Configuration : MyBatis의 런타임 설정 정보를 나타냅니다. 이 클래스는 MyBatis의 핵심적인 설정을 관리하며,
            // 매퍼 인터페이스와 SQL 문을 매핑하고, 데이터베이스와의 세션 관리를 담당

            configuration.addMapper(MemberMapper.class);
            //memberMapper인터페이스를 Mybatis매퍼 레지스트리에 등록하고 매핑을 설정하는 역할을 함

            //Mapping : 데이터베이스와 자바 객체 간의 관계를 정의하고, SQL 쿼리와 자바 메서드를 연결하는 작업

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            //sqlSessionFactory : 데이터베이스 세션을 생성하는 역할을 합니다. MyBatis에서 세션은 데이터베이스와의 연결을 나타내며,
            // 데이터베이스 작업을 수행하기 위한 기본 단위입니다.
        }
        return sqlSessionFactory.openSession(false);
    }



}
