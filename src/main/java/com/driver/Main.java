package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly Student =new RWOnly();

    try {
      Student.name="Md Mubarak";
    }catch (Exception error){
      System.out.println(error);
    }
    //'name' has private access in 'com.driver.RWOnly'
    Student.setName("MD Mubarak");
    Student.getName();
  }
}