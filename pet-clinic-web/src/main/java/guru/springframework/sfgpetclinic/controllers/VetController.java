package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author John Bickerstaff
 * 27/07/2020
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String index() {
        return "vets/index";
    }

}
