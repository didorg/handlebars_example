package com.dido.hbsSpringExample.controllers;


import com.dido.hbsSpringExample.constans.HbsSpringConstans;
import com.dido.hbsSpringExample.services.HandlebarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/hbs_spring")
public class HbsSpringController {

  private HandlebarsService service;

  @Value("${static-footer}")
  private String footer;
  @Value("${static-navbar}")
  private String navbar;

  @Autowired
  public HbsSpringController(HandlebarsService service) {
    this.service = service;
  }

  @GetMapping(value = "/example")
  public ModelAndView greeting(
      @RequestParam(value = "name", defaultValue = "there") String name) {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("site");
    mav.addObject("title", HbsSpringConstans.GREETING);
    mav.addObject("name", "Hello " + name + " ! :)");
    mav.addObject("result", "Your lucky number is: "+this.service.getResult());
    mav.addObject("navbar",navbar);
    mav.addObject("footer", footer);

    return mav;
  }

}
