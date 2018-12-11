/**
 * Create with IntelliJ IDEA
 * Project name : spring-boot-service
 * Package name : org.spring.boot.base.boot
 * Author : Wukunmeng
 * User : wukm
 * Date : 18-11-29
 * Time : 下午4:49
 * ---------------------------------
 */
package org.spring.boot.base.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Create with IntelliJ IDEA
 * Project name : spring-boot-service
 * Package name : org.spring.boot.base.boot
 * Author : Wukunmeng
 * User : wukm
 * Date : 18-11-29
 * Time : 下午4:49
 * ---------------------------------
 * To change this template use File | Settings | File and Code Templates.
 */
@SpringBootApplication
@ComponentScan("org.spring.boot.base")
public class ApplicationContext {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationContext.class);
        app.run(args);
    }
}
