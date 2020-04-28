package com.yamhto.cloud.rest.template.annnotation;

import com.yamhto.cloud.rest.template.selector.RestTemplateSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author yamhto
 * @className: EnableRestTemplate.java
 * @package com.yamhto.cloud.rest.template.annnotation
 * @description:
 * @date 2020/3/13 17:27
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RestTemplateSelector.class)
public @interface EnableRestTemplate {
}
