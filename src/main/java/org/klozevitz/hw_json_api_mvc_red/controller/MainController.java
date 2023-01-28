package org.klozevitz.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MainController {
//    @Autowired
//    private ISolution solution;

    @GetMapping("/info")
    public String ping() {
        System.out.println("lkasfjdgjghlaksfdhjg");
        return "mindex";
    }

    @PostMapping("/dim")
    public String dim(@RequestParam int[] m1dim, @RequestParam int[] m2dim) {
        System.out.println(".ksdjafhl;aksfdhg;alsfdhjga./fsdlkhjgv;alsk");
        System.out.println(Arrays.toString(m1dim));
        System.out.println(Arrays.toString(m2dim));
        return "index";
    }

//    @PostMapping("/solve")
//    public String solve(@RequestParam String operation, @RequestParam double[][] lo1,
//                        @RequestParam double[][] lo2, Model model) {
//        model.addAttribute("solution", solution.answer(operation, new LinearOperator(lo1),
//                            new LinearOperator(lo2)));
//        System.out.println(model.getAttribute("solution"));
//        return "index";
//    }
}
