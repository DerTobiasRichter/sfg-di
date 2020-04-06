package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayhallo(){
        System.out.println("Hallo World");

        return "Hi Folks!";
    }
}
