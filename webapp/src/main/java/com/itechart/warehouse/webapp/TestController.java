package com.itechart.warehouse.webapp;

import com.itechart.warehouse.core.TestCoreClass;
import com.itechart.warehouse.core.util.LoggingProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping({"/","/home"})
    public String showHomePage(Model model) {
        model.addAttribute("helloString", TestCoreClass.getHelloString());
        LoggingProvider.info("{} test", "slf4j-log4j");
        return "home";
    }
}
