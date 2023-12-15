package com.mall.shoppingmall.entitiy;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


public class MemberDetails implements UserDetails {

    private final Member member;

    public MemberDetails(Member member) {
        this.member = member;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public Long getMemberIndex(){
        return member.getMemberIndex();
    }
    public String getMemberId(){
        return member.getMemberId();
    }
    @Override
    public String getPassword() {
        return member.getPassword();
    }

    @Override
    public String getUsername() {
        return member.getName();
    }

    public String getEmail(){
        return member.getEmail();
    }
    // 계정이 만료되지 않았는지 리턴
    @Override
    public boolean isAccountNonExpired() {
        return true; // true시 만료되지 않음
    }

    //계정이 잠겨있지 않은지 리턴
    @Override
    public boolean isAccountNonLocked() {
        return true; //true면 잠겨있지 않음
    }

    //계정의 패스워드가 만료되지 않았는지 리턴
    @Override
    public boolean isCredentialsNonExpired() {
        return true; // 만료되지 않음
    }
    
    //계정이 사용가능한 계정인지 리턴
    @Override
    public boolean isEnabled() {
        return true; //사용가능한 계정
    }
}
