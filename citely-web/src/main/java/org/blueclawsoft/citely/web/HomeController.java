/**
 * Created by greg on 12/27/2014.
 */
package org.blueclawsoft.citely.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.security.PermitAll;

@Controller
public class HomeController {

    @PermitAll
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @PermitAll
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error() {
        return "error";
    }



}