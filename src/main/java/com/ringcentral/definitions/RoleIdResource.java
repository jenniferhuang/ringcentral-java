package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RoleIdResource
{
    //
    public String uri;
    public RoleIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public RoleIdResource id(String id) {
        this.id = id;
        return this;
    }
}
