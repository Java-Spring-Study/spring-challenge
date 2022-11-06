package study.springchallenge.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springchallenge.dto.PingPongDto;
import study.springchallenge.service.PingPongService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PingPongController {

  private final PingPongService pingPongService;

  @GetMapping("/ping")
  public PingPongDto ping() {
    PingPongDto pong = pingPongService.pong();
    log.info(pong.toString());
    return pong;
  }
}
