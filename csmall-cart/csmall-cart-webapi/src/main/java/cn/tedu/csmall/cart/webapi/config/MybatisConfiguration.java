package cn.tedu.csmall.cart.webapi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: sweeterjava@163.com
 * @Date: 2023/2/9
 * @Time: 15:08
 */

@Configuration
@MapperScan("cn.tedu.csmall.cart.webapi.mapper")
public class MybatisConfiguration {
}
