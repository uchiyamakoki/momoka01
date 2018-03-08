package yui.momoka.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class MainAdminController {

    @RequestMapping(value = "/menu")
    public String toMenuPage(){
        return "admin/main";
    }

}
