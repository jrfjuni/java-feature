package com.modern.javafeature.record;

import org.springframework.util.StringUtils;

public record Option(String id, String value) {

    public Option{
        if(!StringUtils.hasLength(id))
            throw new IllegalArgumentException("id cannot be null.");

        if(!StringUtils.hasLength(value))
            throw new IllegalArgumentException("value cannot be null.");
    }
}
