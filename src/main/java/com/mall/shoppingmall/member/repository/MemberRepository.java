package com.mall.shoppingmall.member.repository;

import com.mall.shoppingmall.member.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 사용자 id로 정보를 가져옴
    Member findByMemberId(String memberId);
}
