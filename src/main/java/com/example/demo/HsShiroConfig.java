//package com.example.demo;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
//import org.apache.shiro.session.mgt.eis.SessionDAO;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@Configuration
//public class HsShiroConfig {
//
//
//    @Autowired
//    private HsRealm hsRealm;
//
//
//    @Bean
//    ShiroFilterFactoryBean shiroFilterFactoryBean(){
//        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
//        //传入安全管理器
//        bean.setSecurityManager(securityManager());
//        //传入未登录用户访问登陆用户的权限所跳转的页面
//
//        //访问未授权网页所跳转的页面
//        bean.setUnauthorizedUrl("/unauthorized");
//        Map<String, String> map = new LinkedHashMap<>();
//        //设置所有的请求未登录不允许进入。
//        map.put("/**", "authc");
//        bean.setFilterChainDefinitionMap(map);
//        return bean;
//    }
//
//
//
//    //引入密码校验
//    //配置一个安全管理器
//    @Bean
//    DefaultWebSecurityManager securityManager(){
//        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
//        HsRealm myRealm = new HsRealm();
//        //将我们配置好的密码校验放入域中
//        //将域添加到我们的安全管理器中
//        manager.setRealm(myRealm);
//        //设置Session管理器，配置shiro中Session的持续时间
//        manager.setSessionManager(getDefaultWebSessionManager());
//        SecurityUtils.setSecurityManager(manager);
//        return manager;
//    }
//
//
//    //设置session过期时间
//    @Bean
//    public DefaultWebSessionManager getDefaultWebSessionManager() {
//        DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
//        return defaultWebSessionManager;
//    }
//
//    //设置访问拦截器
//
//}
