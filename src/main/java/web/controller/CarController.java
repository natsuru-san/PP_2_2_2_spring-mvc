package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCarPage(@RequestParam(value = "count", required = false) String count, Model model) {
        int quantity;
        try {
            quantity = Integer.parseInt(count);
        } catch (Exception e) {
            quantity = carService.getListCars().size();
        }
        if (quantity <= 0 | quantity >= 5) {
            quantity = carService.getListCars().size();
        }
        model.addAttribute("listCars", carService.getListCars(quantity));
        return "cars";
    }
}
