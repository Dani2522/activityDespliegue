package ada.example.cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController

public class CdController {
    @GetMapping(path = "/nombre")
    public String name (String myname){
        return myname="Laura Daniela Moreno Buitrago";
    }
}
