package com.imooc.test;

public class DrunkExcption extends Exception {
    public DrunkExcption(){

    }

   public DrunkExcption(String message){
       super(message);
   }
}
