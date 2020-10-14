package org.openstack4j.model.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IP Address Version Type (IPv4/IPv6)
 *
 * @author bboyHan
 */
public enum DirectionType {

    INGRESS("ingress"),
    EGRESS("egress");

    private final String direction;

    DirectionType(String direction) {
        this.direction = direction;
    }

    @JsonValue
    public String getDirection() {
        return direction;
    }

    @JsonCreator
    public static DirectionType forValue(String value) {
        for (DirectionType v : DirectionType.values()) {
            if (v.direction.equalsIgnoreCase(value)) {
                return v;
            }
        }
        return null;
    }

}
