package com.lvmama.scs.learnannotation;

import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解来存放类名，加上这个注解的类就可以通过注解来获取这个类的类名
 *
 * Created by Scs on 1/23/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassName {
   String value() default "have not set";
}
