package com.tub.petshare.domain;

/**
 *
 * @author naveed
 */
public class Host {

    private String id;
    private String name;
    private String picture;
    private String description;
    private String location;
    private Integer age;
    private String gender;
    private String contact;
    private String petAttributes[];
    private String hostaAttributes;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the petAttributes
     */
    public String[] getPetAttributes() {
        return petAttributes;
    }

    /**
     * @param petAttributes the petAttributes to set
     */
    public void setPetAttributes(String[] petAttributes) {
        this.petAttributes = petAttributes;
    }

    /**
     * @return the hostaAttributes
     */
    public String getHostaAttributes() {
        return hostaAttributes;
    }

    /**
     * @param hostaAttributes the hostaAttributes to set
     */
    public void setHostaAttributes(String hostaAttributes) {
        this.hostaAttributes = hostaAttributes;
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
}
