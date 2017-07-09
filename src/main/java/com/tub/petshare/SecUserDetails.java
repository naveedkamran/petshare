package com.tub.petshare;

import java.util.ArrayList;
import java.util.Collection;
import org.bson.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author navee
 */
public class SecUserDetails implements UserDetails {

    private User user;

    public SecUserDetails(User user) {
        this.user = user;
    }

    public SecUserDetails(Document doc) {
        Collection<? extends GrantedAuthority> authorities = new ArrayList();
        User user = new User(doc.get("username", String.class), doc.get("password", String.class), authorities);
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
