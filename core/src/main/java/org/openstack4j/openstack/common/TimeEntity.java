package org.openstack4j.openstack.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * created_at/updated_at time field
 *
 * @author bboyHan
 */
public class TimeEntity {

    @JsonProperty("created_at")
    protected String createdTime;
    @JsonProperty("updated_at")
    protected String updatedTime;

    public String getUpdatedTime() {
        return updatedTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }
}
