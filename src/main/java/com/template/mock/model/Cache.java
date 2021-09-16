package com.template.mock.model;

import elemental.json.Json;

public class Cache {
    private String args;
    private Json headers;
    private String origin;
    private String url;

    public String getUrl()
    {
        return this.url;
    }

    public Json getHeaders(){
        return this.headers;
    }
}
