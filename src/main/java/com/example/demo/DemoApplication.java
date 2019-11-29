package com.example.demo;

import com.example.demo.nativeInterface.HelloSpring;
import com.example.demo.decoupled.HelloSpringMessageProvider;
import com.example.demo.decoupled.MessageProvider;
import com.example.demo.decoupled.MessageRenderer;
import com.example.demo.decoupled.OutputMessageRenderer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        HelloSpring hs=new HelloSpring();
        hs.print();

        System.out.println("Hello Spring");

        if(args.length>0)
        {
            for(int i=0;i<args.length;i++) {
                System.out.println(args[i]);
            }
        } else{
            System.out.println("There are no argument");
        }

        MessageRenderer mr=new OutputMessageRenderer();
        MessageProvider mp=new HelloSpringMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
        SpringApplication.run(DemoApplication.class, args);
    }

}