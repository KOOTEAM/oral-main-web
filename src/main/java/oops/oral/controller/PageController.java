/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description:
 * <p>
 * Create Author  : lilzhang
 * Create Date    : 2016-03-25
 * Project        : oralRepo
 * File Name      : PageController.java
 */
@Controller
public class PageController
{
    private static final Log logger = LogFactory.getLog(PageController.class);

    @RequestMapping(value = "/login")
    public ModelAndView pageLogin() {
        ModelAndView mv = new ModelAndView("login");
        logger.info("page login");
        return mv;
    }

    @RequestMapping(value = "/main")
    public ModelAndView pageMain() {
        ModelAndView mv = new ModelAndView("main");
        logger.info("page main");
        return mv;
    }

    // TODO: 2016/3/25 reg page
    @RequestMapping(value = "/reg")
    public ModelAndView pageRegister() {
        ModelAndView mv = new ModelAndView("reg");
        logger.info("page reg");
        return mv;
    }

}
