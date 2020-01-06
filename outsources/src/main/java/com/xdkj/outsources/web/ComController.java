package com.xdkj.outsources.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wc
 * @create 2020-01-06-16:20
 */
@RestController
@RequestMapping("/com")
public class ComController {
   //

    @RequestMapping(value = "/getCompanyCount",method = RequestMethod.GET)
    public int getCompanyCount(){

        return 2;
    }
}
