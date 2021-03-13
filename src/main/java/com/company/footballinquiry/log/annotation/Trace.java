package com.company.footballinquiry.log.annotation;

import com.company.footballinquiry.log.eventtype.LogEventType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Dinesh Lohia
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
public @interface Trace {
  LogEventType type() default LogEventType.SERVICE;
}
