package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author John Bickerstaff
 * 27/07/2020
 */

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String index(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    /*
     @RequestMapping({"", "/", "/index.html", "/index"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
     */

}
