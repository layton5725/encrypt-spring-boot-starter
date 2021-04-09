package org.layton.encrypt.starter.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Layton
 * @date 2021/4/9 12:03
 */
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
