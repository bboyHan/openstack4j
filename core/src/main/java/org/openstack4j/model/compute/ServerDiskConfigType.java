package org.openstack4j.model.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServerDiskConfigType:
 * Filter the server list result by the disk_config setting of the server,
 * Valid values are:  AUTO | MANUAL
 *
 * @author bboyHan
 */
public enum ServerDiskConfigType {
    AUTO("AUTO"),
    MANUAL("MANUAL"),
    ;

    private final String autoDiskConfig;

    ServerDiskConfigType(String autoDiskConfig) {
        this.autoDiskConfig = autoDiskConfig;
    }

    @JsonValue
    public String getAutoDiskConfig() {
        return autoDiskConfig;
    }

    @JsonCreator
    public static ServerDiskConfigType forValue(String value) {
        if (value != null) {
            for (ServerDiskConfigType v : ServerDiskConfigType.values()) {
                if (v.autoDiskConfig.equalsIgnoreCase(value))
                    return v;
            }
        }
        return null;
    }
}
