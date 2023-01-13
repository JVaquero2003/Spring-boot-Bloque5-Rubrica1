package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainApp {
		@GetMapping("/")
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      GoodByeWorld obj1 = (GoodByeWorld) context.getBean("goodbyeworld");
	      obj1.getMessage();
	   }
	}
