package com.itechart.warehouse.webapp;

import com.itechart.warehouse.core.user.service.UserService;
import com.itechart.warehouse.core.util.LoggingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping({"/","/home"})
    public String showHomePage(Model model) {
        //model.addAttribute("helloString", TestCoreClass.getHelloString());
        LoggingProvider.debug("Go to home page view");
        //UserServiceImpl service = new UserServiceImpl();
        //User user = service.find(2);
        model.addAttribute("helloString", userService.nameById(2));
        return "home";
    }

    @RequestMapping("/usual")
    public String showUsualPage() {
        LoggingProvider.debug("Go to usual page view");
        return "usual-page";
    }
}
