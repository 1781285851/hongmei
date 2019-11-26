package com.info.properties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SoftworksApiInfoProperties {
    private String title;
    private String description;
    private String termsOfServiceUrl;
    private SoftworksContact contact;
    private String license;
    private String licenseUrl;
    private String version;
}
