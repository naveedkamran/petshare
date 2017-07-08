package com.tub.petshare.domain;

import com.datenc.commons.enums.Gender;
import com.tub.petshare.enums.AnimalType;

/**
 *
 * @author naveed
 */
public class Pet {

    private String id;
    private String name;
    private String description;
    private String petPicture;
    private String location;
    private Integer age;
    private Gender gender;
    private AnimalType type;
    private String breed;
    private String contact;
    private String attributes[];

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
     * @return the petPicture
     */
    public String getPetPicture() {
        return petPicture;
    }

    /**
     * @param petPicture the petPicture to set
     */
    public void setPetPicture(String petPicture) {
        this.petPicture = petPicture;
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
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the type
     */
    public AnimalType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(AnimalType type) {
        this.type = type;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
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
     * @return the attributes
     */
    public String[] getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
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
