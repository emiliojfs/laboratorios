package fundamentos.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class FundamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

@GetMapping
String holaMundo(@RequestParam(defaultValue = "mundo")String nombre, Model model){
	model.addAttribute("nombre", nombre);
	return "hola-mundo";
}
}