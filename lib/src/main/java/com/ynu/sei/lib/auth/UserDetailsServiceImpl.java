package com.ynu.sei.lib.auth;


import com.ynu.sei.lib.domain.User;
import com.ynu.sei.lib.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Primary
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    /**
     *
     * 用户Dao
     *
     * */
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsImpl udi = null;

        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(authority);

        // 不知道为什么的最坑 "{noop}" + user.getPassword()
        if (userRepository == null) {
            udi = new UserDetailsImpl("d236e3a8-01fd-4360-947f-d1b51d77d833", "cstadmin", "{noop}123123",
                    authorities, true);
        } else {
            User user = userRepository.getByName(username);
            if (user != null) {
                udi = new UserDetailsImpl(user.getId(), user.getName(), "{noop}" + user.getPassword(), authorities, true);
            }
        }
        return udi;
    }
}
