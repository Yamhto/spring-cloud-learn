package com.yamhto.cloud.rest.template.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yamhto
 * @className: RestTemplateSelector.java
 * @package com.yamhto.cloud.rest.template.selector
 * @description:
 * @date 2020/3/13 17:30
 */
public class RestTemplateSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{
                "com.yamhto.cloud.rest.template.config.RestTemplateConfig"
        };
    }
}
