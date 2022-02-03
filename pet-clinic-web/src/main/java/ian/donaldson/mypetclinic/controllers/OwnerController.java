package ian.donaldson.mypetclinic.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//heirarchy of web structure starts here
@RequestMapping("/owners")
@Controller
public class OwnerController {
    //don't need to specify owners because the scope of all requests is past /owners
    //you need empty string
    @RequestMapping({"", "/", "/index", "index.html"})
    public String listOwners() {
        return "owners/index.html";
    }
}
