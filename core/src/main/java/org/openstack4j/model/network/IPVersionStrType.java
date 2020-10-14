package org.openstack4j.model.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IP Address Version Type (IPv4/IPv6)
 *
 * @author bboyHan
 */
public enum IPVersionStrType {

    IPv4("IPv4"),
    IPv6("IPv6");
    private final String version;

    IPVersionStrType(String version) {
        this.version = version;
    }

    /**
     * Gets the version in Integer form
     *
     * @return the version as int
     */
    @JsonValue
    public String getVersion() {
        return version;
    }

    @JsonCreator
    public static IPVersionStrType forValue(String value) {
        for (IPVersionStrType v : IPVersionStrType.values()) {
            if (v.version.equalsIgnoreCase(value)) {
                return v;
            }
        }
        return IPv4;
    }

}
