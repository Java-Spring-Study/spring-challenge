package study.springchallenge.service;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.springchallenge.dto.MemberFormDto;
import study.springchallenge.entity.Member;
import study.springchallenge.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  // TODO : createMember Service 코드 작성
  public void createMember(MemberFormDto form) {
    // your code here
  }

  // TODO : getMemberList Service 코드 작성
  public List<Member> getMemberList() {
    // your code here
    List<Member> members = new ArrayList<>();

    // Hint : JPA Repository 에서 모든 멤버 값을 가져오시오.
    return members;
  }
}
