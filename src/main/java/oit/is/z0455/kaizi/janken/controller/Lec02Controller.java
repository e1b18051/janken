package oit.is.z0455.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {
  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    String username = name;
    model.addAttribute("username", "Hi "+ username);
    return "lec02.html";
  }
}
