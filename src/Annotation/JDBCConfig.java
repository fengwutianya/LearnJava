package Annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by xuan on 2017/8/17 0017.
 */
@Target({METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding() default "UTF-8";
    String loginName();
    String password();
}
