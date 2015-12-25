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
        LoggingProvider.debug("Go to home page view");
        model.addAttribute("helloString", userService.firstNameById(1));
        return "home";
    }

    @RequestMapping("/usual")
    public String showUsualPage() {
        LoggingProvider.debug("Go to usual page view");
        return "usual-page";
    }
}
