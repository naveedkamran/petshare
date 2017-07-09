package com.tub.petshare;

import com.tub.petshare.service.UserAccountService;
import org.bson.Document;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author navee
 */
@Component
public class SecUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*Here add user data layer fetching from the MongoDB.
          I have used userRepository*/
        Document user = UserAccountService.getInstance().readByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        } else {
            UserDetails details = new SecUserDetails(user);
            return details;
        }
    }
}
