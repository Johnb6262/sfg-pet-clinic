package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author John Bickerstaff
 * 27/07/2020
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String index() {
        return "owners/index";
    }

}
