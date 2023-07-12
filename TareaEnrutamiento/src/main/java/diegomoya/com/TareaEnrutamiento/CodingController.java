package diegomoya.com.TareaEnrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String Dojo() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String Python() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("/java")
	public String Java() {
		return "¡Java/Spring es mejor!";
	}
}
