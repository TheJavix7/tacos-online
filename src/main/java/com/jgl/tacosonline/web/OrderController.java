package com.jgl.tacosonline.web;

import com.jgl.tacosonline.model.Order;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());

        return "orderForm";
    }

    public String processOrder(Order order){

        return "redirect:/";
    }
}
