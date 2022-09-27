package site.metacoding.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	@GetMapping("/")
	public String getStadium() {
		return "index";
	}
}
