import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewcontroller {
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model) {
        model.addAttribute("message", "Perscholas");
        model.addAttribute("welcomeMessage", "welcome");
        int i = 10;
        model.addAttribute("number", i);

        List<String> list = Arrays.asList("one", "two");
        model.addAttribute("listData", list);
        return "viewPage";
    }


    @GetMapping("/goToViewPage")
    public ModelAndView passParametersWithModelAndView() {
        String st = "Welcome to the Page";
        ModelAndView modelAndView = new ModelAndView("viewPage_2");
        modelAndView.addObject("message", st);
        modelAndView.addObject("info", "Employee information.");
        return modelAndView;
    }
}
