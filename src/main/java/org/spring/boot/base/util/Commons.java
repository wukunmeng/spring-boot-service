/**
 * Create with IntelliJ IDEA
 * Project name : spring-boot-service
 * Package name : org.spring.boot.base.util
 * Author : Wukunmeng
 * User : wukm
 * Date : 18-11-29
 * Time : 下午4:50
 * ---------------------------------
 */
package org.spring.boot.base.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Project name : spring-boot-service
 * Package name : org.spring.boot.base.util
 * Author : Wukunmeng
 * User : wukm
 * Date : 18-11-29
 * Time : 下午4:50
 * ---------------------------------
 * To change this template use File | Settings | File and Code Templates.
 */
public class Commons {

    private Commons(){
        /**
            公共静态
         **/
    }

    public static String formatNow(){
        return DateFormatUtils.format(new Date(), Constants.DATE_TIME_FORMAT_PATTERN);
    }

}
