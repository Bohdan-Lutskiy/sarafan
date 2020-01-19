package com.study.sarafan.domain;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserSubscriptionId implements Serializable {
    @JsonView(Views.Id.class)
    private String channelId;

    @JsonView(Views.Id.class)
    private String subscriberId;

    public UserSubscriptionId(String channelId, String subscriberId) {
        this.channelId = channelId;
        this.subscriberId = subscriberId;
    }

    public UserSubscriptionId() {
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSubscriptionId that = (UserSubscriptionId) o;
        return Objects.equals(channelId, that.channelId) &&
                Objects.equals(subscriberId, that.subscriberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, subscriberId);
    }

    @Override
    public String toString() {
        return "UserSubscriptionId{" +
                "channelId='" + channelId + '\'' +
                ", subscriberId='" + subscriberId + '\'' +
                '}';
    }
}
