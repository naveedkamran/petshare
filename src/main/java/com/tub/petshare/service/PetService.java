package com.tub.petshare.service;

import com.tub.petshare.domain.Pet;

/**
 *
 * @author naveed
 */
public class PetService {

    private static final PetService instance = new PetService();

    public static PetService getInstance() {
        return instance;
    }

    public String create(Pet pet) {
        return null;
    }

    public String read(String id) {
        return null;
    }

    public String list() {
        return null;
    }

    public String update(Pet pet) {
        return null;
    }

    public String delete(String id) {
        return null;
    }
}
