package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateSubscriptionRequest
{
    // Mandatory. Collection of URIs to API resources (see Event Types for details). For APNS transport type only message event filter is available
    public String[] eventFilters;
    public CreateSubscriptionRequest eventFilters(String[] eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }
    // Notification delivery settings
    public NotificationDeliveryModeRequest deliveryMode;
    public CreateSubscriptionRequest deliveryMode(NotificationDeliveryModeRequest deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    // Subscription lifetime in seconds. Max value is 7 days (604800 sec)
    public Long expiresIn;
    public CreateSubscriptionRequest expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
