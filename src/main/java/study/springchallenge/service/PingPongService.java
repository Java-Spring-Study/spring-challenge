package study.springchallenge.service;

import org.springframework.stereotype.Service;
import study.springchallenge.dto.PingPongDto;

@Service
public class PingPongService {

  public PingPongDto pong() {
    return new PingPongDto();
  }
}
