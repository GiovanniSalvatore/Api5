package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    @GetMapping
    public CarDTO getCar(){
        return new CarDTO("091","Scenic",8000.00);
    }

    @PostMapping(value = "/getCarBody")
    public String getCarBody(@Valid @RequestBody CarDTO car, HttpServletRequest request, HttpServletResponse responce){
        if(responce != null){
            System.out.println("oggetto creato");
        }
        return car.toString();
    }
}