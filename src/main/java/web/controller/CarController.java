package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.model.Car;
import web.config.service.CarServiceImpl;
import web.config.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carsPrint(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang", 1965));
        cars.add(new Car("Ford", "Shelby", 1961));
        cars.add(new Car("Pontiac", "GTO", 1965));
        cars.add(new Car("Ford", "Torino", 1969));
        cars.add(new Car("Chevrolet", "Chevelle", 1966));


        CarService carService = new CarServiceImpl();
        cars = carService.getCars(cars, count);
        model.addAttribute("messages", cars);
        return "index";
    }

}
