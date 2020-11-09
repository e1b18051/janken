package oit.is.z0455.kaizi.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0455.kaizi.janken.model.User;
import oit.is.z0455.kaizi.janken.model.UserMapper;
import oit.is.z0455.kaizi.janken.model.Entry;
import oit.is.z0455.kaizi.janken.model.Janken;

@Controller
public class Lec02Controller {

  @Autowired
  private Entry room;

  @Autowired
  UserMapper userMapper;

  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    String username = name;
    model.addAttribute("username", "Hi "+ username);
    return "lec02.html";
  }

  @GetMapping("lec02")
  public String lec02(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);
    model.addAttribute("login_user", loginUser);
    ArrayList<User> users = userMapper.selectAllUsers();
    model.addAttribute("users", users);

    return "lec02.html";
  }

  @GetMapping("/rock")
    public String rock(ModelMap model){
      String hand ="グー";
      Janken janken = new Janken(hand);

      model.addAttribute("yourhand", hand);
      model.addAttribute("result", janken.result);
      return "lec02.html";
    }
  @GetMapping("/scissors")
    public String scissors(ModelMap model){
      String hand ="チョキ";
      Janken janken = new Janken(hand);

      model.addAttribute("yourhand", hand);
      model.addAttribute("result", janken.result);
      return "lec02.html";
    }
  @GetMapping("/paper")
    public String paper(ModelMap model){
      String hand ="パー";
      Janken janken = new Janken(hand);

      model.addAttribute("yourhand", hand);
      model.addAttribute("result", janken.result);
      return "lec02.html";
    }

}
