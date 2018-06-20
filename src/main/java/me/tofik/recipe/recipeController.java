package me.tofik.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class recipeController {

    @RequestMapping("/")
        public String showHomepage(){
            return "index";
        }

    @RequestMapping("/list")
        public String showList() {
        return "gallery";
        }

    @RequestMapping("/eggsauce")
        public String showEgg() {
        return "eggsauce";
        }

    @RequestMapping("/gimbap")
        public String showGimbap(){
            return "gimbap";
        }

    @RequestMapping("/injera")
    public String showInjera(){
        return "Injera";
    }

    @RequestMapping("/wings")
    public String showWings(){
        return "wings";
    }

    @RequestMapping("/ricenoodles")
    public String showRiceNoodles(){
        return "ricenoodles";
    }
}
