package com.shaurya.spring.ch08springbootwebapps.Controller;

import com.shaurya.spring.ch08springbootwebapps.Model.Garage;
import com.shaurya.spring.ch08springbootwebapps.Service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GarageController {
    private final GarageService garageService;
    @Autowired
    public GarageController(GarageService garageService) {
        this.garageService = garageService;
    }
    @GetMapping("/garage")
    public String garage(Model model) {
        var garages = garageService.getGarages();
        model.addAttribute("garages", garages);
        return "garage.html";
    }
    @PostMapping("/garage")
    public String addGarage(
            @RequestParam(required = false,defaultValue = "BMW GARAGE") String name,
            @RequestParam(required = false,defaultValue = "BMW Model") String model,
            @RequestParam(required = false,defaultValue = "2000") float price
            ,Model m) {
        var garage = new Garage();
        garage.setName(name);
        garage.setModel(model);
        garage.setPrice(price);
        garageService.addGarage(garage);
        var garages = garageService.getGarages();
        m.addAttribute("garages", garages);
        return "garage.html";
    }
}
