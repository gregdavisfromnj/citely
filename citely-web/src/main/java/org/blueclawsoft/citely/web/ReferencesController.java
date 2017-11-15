package org.blueclawsoft.citely.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.security.PermitAll;

/**
 * Created by Gregory on 6/21/2015.
 */
@Controller
public class ReferencesController {

    @PermitAll
    @RequestMapping(value = "/references", method = RequestMethod.GET)
    public String references() {
        return "references";
    }

}
