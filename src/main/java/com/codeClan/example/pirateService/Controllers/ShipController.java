package com.codeClan.example.pirateService.Controllers;


import com.codeClan.example.pirateService.Models.Ship;
import com.codeClan.example.pirateService.Repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ships")
public class ShipController {


    @Autowired
    ShipRepository shipRepository;


    @GetMapping(value = "/")
    public List<Ship> getAllShip(){
        return shipRepository.findAll();
    }
}
