package org.example.mapgoogoreal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MapGoogoController {
    @GetMapping("/map")
    public String MapGoogo(@RequestParam(name = "name", required = false, defaultValue = "Its Map!") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
