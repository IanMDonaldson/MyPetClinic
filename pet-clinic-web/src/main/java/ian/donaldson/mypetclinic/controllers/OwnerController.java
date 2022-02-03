package ian.donaldson.mypetclinic.controllers;

import ian.donaldson.mypetclinic.model.Owner;
import ian.donaldson.mypetclinic.services.OwnerService;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

//heirarchy of web structure starts here
@RequestMapping("/owners")
@Controller
public class OwnerController {
    //final so that this class can never change it
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //don't need to specify owners because the scope of all requests is past /owners
    //you need empty string
    @RequestMapping({"", "/", "/index", "index.html"})
    public String listOwners(Model model) {
        /*Model is a component handled by spring for MVC, it injects it into this function here*/
        model.addAttribute("owners", ownerService.findAll());
        System.out.println(ownerService.findById(1L).toString());
        model.addAttribute("owner1", ownerService.findById(1L));
        return "owners/index";
    }
}
