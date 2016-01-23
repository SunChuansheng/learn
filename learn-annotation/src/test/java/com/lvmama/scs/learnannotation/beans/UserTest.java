package com.lvmama.scs.learnannotation.beans;

import com.lvmama.scs.learnannotation.ClassName;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class UserTest {

    @Test
    public void test(){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        System.out.println(validator.getClass().getName());

        User u = new User();
        u.setLastName("sun");
        u.setFirstName(null);
        System.out.println("user:");
        System.out.println("    lastName:"+u.getLastName());
        System.out.println("    firstName:"+u.getFirstName());

        Set<ConstraintViolation<User>> violations = validator.validate(u);
        System.out.println(violations);
    }

    @Test
    public void testClassName(){
        User u = new User();
        boolean flag = u.getClass().isAnnotationPresent(ClassName.class);
        if(flag){
            System.out.println("判断类是annotation");
            ClassName className = u.getClass().getAnnotation(ClassName.class);
            System.out.println(className);
        }
    }


} 
