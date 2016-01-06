package de.netpioneer.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by skobow on 06.01.2016.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "index";
    }
}
