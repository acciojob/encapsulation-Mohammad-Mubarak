package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly Student =new RWOnly();
    Student.name="Md Mubarak";
    //'name' has private access in 'com.driver.RWOnly'
    Student.setName("MD Mubarak");
    Student.getName();
  }
}