package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    @GetMapping
    public CarDTO getCar(){
        return new CarDTO("091","Scenic",8000.00);
    }

    @PostMapping
    public void postCar(@Valid @RequestBody(required = true)CarDTO car) {
        System.out.println(car);
    }
}