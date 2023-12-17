package com.mall.shoppingmall.repository;

import com.mall.shoppingmall.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 사용자 id로 정보를 가져옴
    Member findByMemberId(String memberId);
}
