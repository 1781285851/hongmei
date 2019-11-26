package com.info;

import com.info.properties.SoftworksApiInfoProperties;
import com.info.properties.SoftworksDocketProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements java.io.Serializable{
    private Boolean enable;
    private SoftworksApiInfoProperties apiInfo;
    private SoftworksDocketProperties docket;
}
