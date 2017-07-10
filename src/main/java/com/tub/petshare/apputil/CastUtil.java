package com.tub.petshare.apputil;

import com.tub.petshare.domain.Host;
import com.tub.petshare.domain.Pet;
import com.tub.petshare.domain.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author naveed
 */
public class CastUtil {

    private static final CastUtil instance = new CastUtil();

    public static CastUtil getInstance() {
        return instance;
    }

    public Map castToMap(UserAccount userAccount) {
        Map<String, Object> map = new HashMap();

        map.put("username", userAccount.getUsername());
        map.put("password", userAccount.getPassword());

        return map;
    }

    public Map castToMap(Host host) {
        Map<String, Object> map = new HashMap();

        map.put("age", host.getAge());
        map.put("contact", host.getContact());
        map.put("description", host.getDescription());
        map.put("gender", host.getGender());
        map.put("hostaAttributes", host.getHostaAttributes());
        map.put("id", host.getId());
        map.put("location", host.getLocation());
        map.put("name", host.getName());
        map.put("petAttributes", host.getPetAttributes());
        map.put("picture", host.getPicture());

        return map;
    }

    public Map castToMap(Pet pet) {
        Map<String, Object> map = new HashMap();

        map.put("age", pet.getAge());
        map.put("contact", pet.getContact());
        map.put("description", pet.getDescription());
        map.put("gender", pet.getGender());
        map.put("id", pet.getId());
        map.put("location", pet.getLocation());
        map.put("name", pet.getName());

        return map;
    }
}
