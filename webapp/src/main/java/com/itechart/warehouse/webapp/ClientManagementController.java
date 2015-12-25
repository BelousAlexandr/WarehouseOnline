package com.itechart.warehouse.webapp;

import com.itechart.warehouse.core.util.LoggingProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientManagementController {

    @RequestMapping({"/clients"})
    public String showHomePage(Model model) {
        LoggingProvider.debug("Client management");
        return "client-list";
    }

}
