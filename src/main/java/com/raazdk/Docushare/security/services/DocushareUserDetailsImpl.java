package com.raazdk.Docushare.security.services;

import com.raazdk.Docushare.models.DocushareUser;
import com.raazdk.Docushare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DocushareUserDetailsImpl implements UserDetailsService {

    @Autowired
    UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        DocushareUser user  = repository.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("Username not found!!"));
        return DocushareUserDetails.build(user);
    }
}
