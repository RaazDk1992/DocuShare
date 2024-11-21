package com.raazdk.Docushare.security.services;

import com.raazdk.Docushare.models.DocushareUser;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Data
public class DocushareUserDetails  implements UserDetails {

    private String username;

    public DocushareUserDetails( String username,String password, String email, Collection<? extends GrantedAuthority> authorities) {
        this.password = password;
        this.username = username;
        this.email = email;
        this.authorities = authorities;
    }

    private String password;
    private String email;
    private Collection <? extends GrantedAuthority> authorities;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public static DocushareUserDetails build(DocushareUser user){
        GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getRoleName().name());
        return  new DocushareUserDetails(
                user.getUserName(),
                user.getPassword(),
                user.getEmail(),
                List.of(authority)
        );
    }
}
