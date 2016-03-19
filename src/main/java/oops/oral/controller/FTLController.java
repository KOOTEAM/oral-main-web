package oops.oral.controller;

import oops.oral.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LilZhang on 2016/2/18.
 */
@Controller
public class FTLController {
    private static final Log logger = LogFactory.getLog(FTLController.class);

    private UserService userService;

    @Resource
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping(value = "/show")
    public ModelAndView showFTL() {
        ModelAndView mv = new ModelAndView("testDir/hello3");
//        User user = this.userService.findById(1);
        mv.addObject("title", "FTL title: " /*+ user.getUsername()*/);
        mv.addObject("content", "FTL content" /*+ user.getEmail()*/);
        logger.info("showFTL called");

        return mv;
    }

    @RequestMapping(value="/show.json")
    @ResponseBody
    public Map<String,Object> showJson(@RequestBody Map<String, Object> pmap){
//        logger.info(" validata user : {}",userName);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", true);
        return map;
    }
}
