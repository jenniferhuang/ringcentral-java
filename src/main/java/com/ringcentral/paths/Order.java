package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Order extends Path {
    public Order (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "order", id);
    }
}
