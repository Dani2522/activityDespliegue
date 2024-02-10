package ada.example.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdApplication.class, args);
	}

}
