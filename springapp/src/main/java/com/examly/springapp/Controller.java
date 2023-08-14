import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller {
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }
}
