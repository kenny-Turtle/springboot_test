package com.itany.ums.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> local=new ThreadLocal<SqlSession>();
    static{
        factory=new SqlSessionFactoryBuilder().build(MybatisUtil.class.
                getClassLoader().getResourceAsStream
                ("mybatis-config.xml"));

        }
    public static SqlSession getSession(){
        SqlSession sqlSession=local.get();
        if(sqlSession==null){
            sqlSession=factory.openSession();
            local.set(sqlSession);
        }
        return  sqlSession;
    }
    public static void closeSession(){
        SqlSession sqlSession=local.get();
        local.set(null);
        if(sqlSession!=null){
            sqlSession.close();
        }
    }

}
