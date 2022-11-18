package study.springchallenge.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import study.springchallenge.dto.MemberFormDto;
import study.springchallenge.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @PostMapping(value = "/members/new")
  public String createMember(MemberFormDto form) {
    memberService.createMember(form);
    return "redirect:/members";
  }

  @GetMapping(value = "/members")
  public String getMemberList(Model model) {
    model.addAttribute("members", memberService.getMemberList());
    return "members/memberPage";
  }
}
