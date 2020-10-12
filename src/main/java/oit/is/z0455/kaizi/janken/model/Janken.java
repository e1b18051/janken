package oit.is.z0455.kaizi.janken.model;

public class Janken{
  public String result;
  public Janken(String hand){
    if(hand == "グー"){
      result = "Draw";
    }
    if(hand == "チョキ"){
      result = "You Lose...";
    }
    if(hand == "パー"){
      result = "You Win!!";
    }
  }

}
