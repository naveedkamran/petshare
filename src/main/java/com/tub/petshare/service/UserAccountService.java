package com.tub.petshare.service;

import com.tub.petshare.domain.UserAccount;

/**
 *
 * @author naveed
 */
public class UserAccountService {

    private static final UserAccountService instance = new UserAccountService();

    public static UserAccountService getInstance() {
        return instance;
    }

    public String create(UserAccount userAccount) {
        return null;
    }

    public String read(String id) {
        return null;
    }

    public String list() {
        return null;
    }

    public String update(UserAccount userAccount) {
        return null;
    }

    public String delete(String id) {
        return null;
    }
}
