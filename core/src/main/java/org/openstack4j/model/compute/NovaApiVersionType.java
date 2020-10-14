package org.openstack4j.model.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * NovaApiVersionType:
 * Filter the server list result by setting of the API version,
 * Valid values are:  2.1 ~ 2.87
 * link: https://docs.openstack.org/nova/latest/reference/api-microversion-history.html
 *
 * @author bboyHan
 */
public enum NovaApiVersionType {

    DEFAULT_VERSION("2.1"),
    VERSION_2_12("2.12"), // (Maximum in Liberty)
    VERSION_2_25("2.25"), // (Maximum in Mitaka)
    VERSION_2_38("2.38"), // (Maximum in Newton)
    VERSION_2_42("2.42"), // (Maximum in Ocata)
    VERSION_2_53("2.53"), // (Maximum in Pike)
    VERSION_2_60("2.60"), // (Maximum in Queens)
    VERSION_2_65("2.65"), // (Maximum in Rocky)
    VERSION_2_72("2.72"), // (Maximum in Stein)
    VERSION_2_79("2.79"), // (Maximum in Train)
    VERSION_2_87("2.87"), // (Maximum in Ussuri and Victoria)

    ;

    private final String novaApiVersion;

    NovaApiVersionType(String novaApiVersion) {
        this.novaApiVersion = novaApiVersion;
    }

    @JsonValue
    public String getNovaApiVersion() {
        return novaApiVersion;
    }

    @JsonCreator
    public static NovaApiVersionType forValue(String value) {
        if (value != null) {
            for (NovaApiVersionType v : NovaApiVersionType.values()) {
                if (v.novaApiVersion.equalsIgnoreCase(value))
                    return v;
            }
        }
        return DEFAULT_VERSION;
    }
}
