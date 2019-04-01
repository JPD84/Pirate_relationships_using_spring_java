package com.codeClan.example.pirateService.Controllers;

import com.codeClan.example.pirateService.Models.Pirate;
import com.codeClan.example.pirateService.Repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value = "/")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }
}
