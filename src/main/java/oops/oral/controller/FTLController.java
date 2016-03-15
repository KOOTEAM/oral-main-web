package oops.oral.controller;

import oops.oral.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by LilZhang on 2016/2/18.
 */
@Controller
public class FTLController {
    private static final Log logger = LogFactory.getLog(FTLController.class);

    private UserService userService;


    public UserService getUserService()
    {
        return userService;
    }

    @Resource
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping(value = "/show")
    public ModelAndView showFTL() {
        ModelAndView mv = new ModelAndView("hello2");
        mv.addObject("title", "FTL title");
        mv.addObject("content", "FTL content");
        logger.info("showFTL called");
        this.userService.findById(1);
        return mv;
    }
}
