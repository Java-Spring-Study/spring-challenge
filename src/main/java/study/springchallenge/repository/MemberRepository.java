package study.springchallenge.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import study.springchallenge.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
