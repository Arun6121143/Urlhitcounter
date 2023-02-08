package com.example.newproject.model;

public class Newmodel {
   private int count;
   private String username;

   public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public int getCount() {
    return count;
}

public void setCount(int count) {
    this.count = count;
}

public Newmodel(int count) {
    this.count = count;
}

public Newmodel(String username,int count){
    this.username=username;
    this.count=count;
   }

   @Override
   public String toString(){
    return "{Visit {"+"username"+username+"count"+count+"}}";
   }

   


  
}
