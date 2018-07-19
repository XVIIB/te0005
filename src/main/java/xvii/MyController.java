package xvii;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  //声明为控制器
@RequestMapping(path = "/")  //请求映射
public class MyController {
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model){
        model.addAttribute("message","Hello Spring MVC!");
        return "root";
    }
}
