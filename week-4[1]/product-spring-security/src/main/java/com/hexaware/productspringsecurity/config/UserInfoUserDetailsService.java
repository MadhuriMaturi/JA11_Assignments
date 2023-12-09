package com.hexaware.productspringsecurity.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hexaware.productspringsecurity.entity.UserInfo;
import com.hexaware.productspringsecurity.repository.UserInfoRepository;



public class UserInfoUserDetailsService  implements UserDetailsService{
	 @Autowired
	    private UserInfoRepository repository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Optional<UserInfo> userInfo = repository.findByName(username);
	        return userInfo.map(UserInfoUserDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));


}
}
