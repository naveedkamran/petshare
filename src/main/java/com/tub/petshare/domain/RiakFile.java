package com.tub.petshare.domain;

/**
 *
 * @author naveed
 */
public class RiakFile {

    private String id;
    private String location;

    public RiakFile() {

    }

    public RiakFile(String id, String location) {
        this.id = id;
        this.location = location;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

}
