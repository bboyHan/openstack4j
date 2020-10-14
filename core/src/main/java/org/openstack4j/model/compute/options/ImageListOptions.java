package org.openstack4j.model.compute.options;

import org.openstack4j.model.compute.ServerDiskConfigType;
import org.openstack4j.model.network.options.BaseListOptions;

/**
 * @author bboyHan
 */
public class ImageListOptions extends BaseListOptions<ImageListOptions> {

    private ImageListOptions(){}

    public static ImageListOptions create(){
        return new ImageListOptions();}

    public ImageListOptions name(String name) {
        return add("name", name);
    }

    public ImageListOptions minRam(String minRam) {
        return add("minRam", minRam);
    }

    public ImageListOptions minDisk(String minDisk) {
        return add("minDisk", minDisk);
    }

    public ImageListOptions id(String id) {
        return add("id", id);
    }

    /**
     * ACTIVE: image is in active state
     * SAVING: image is in queued or in saving process
     * DELETED: image is deleted or in progress of deletion
     * ERROR: image is in error state
     * UNKNOWN
     *
     * @param status ACTIVE | SAVING | DELETED | ERROR | UNKNOWN
     */
    public ImageListOptions status(String status) {
        return add("status", status);
    }

    /**
     * This parameter is only valid when specified by administrators
     *
     * @param autoDiskConfig auto_disk_config
     */
    public ImageListOptions autoDiskConfig(ServerDiskConfigType autoDiskConfig) {
        return add("auto_disk_config", autoDiskConfig.getAutoDiskConfig());
    }

    public ImageListOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }
}
