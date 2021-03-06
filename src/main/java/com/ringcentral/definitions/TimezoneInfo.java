package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TimezoneInfo
{
    // Internal identifier of a timezone
    public String id;
    public TimezoneInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a timezone
    public String uri;
    public TimezoneInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Short name of a timezone
    public String name;
    public TimezoneInfo name(String name) {
        this.name = name;
        return this;
    }
    // Meaningful description of the timezone
    public String description;
    public TimezoneInfo description(String description) {
        this.description = description;
        return this;
    }
}
