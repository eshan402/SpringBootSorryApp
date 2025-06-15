
package com.sorryapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SorryController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/reply")
    public String reply(@RequestParam("message") String message, Model model) {
        model.addAttribute("reply", message);
        return "thankyou";
    }
}
