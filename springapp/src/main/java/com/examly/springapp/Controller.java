import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controller {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }
}
