package com.itechart.warehouse.webapp;

import com.itechart.warehouse.core.client.service.ClientServiceCustom;
import com.itechart.warehouse.core.util.LoggingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientManagementController {

    @Autowired
    ClientServiceCustom clientServiceCustom;

    @RequestMapping({"/clients"})
    public String showHomePage(Model model) {
        LoggingProvider.debug("Client management");
        model.addAttribute("clients", clientServiceCustom.findAll());
        return "client-list";
    }

}
