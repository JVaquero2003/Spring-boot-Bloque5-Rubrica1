package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GoodByeWorld {

	public String message;
	   
	   
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
}
