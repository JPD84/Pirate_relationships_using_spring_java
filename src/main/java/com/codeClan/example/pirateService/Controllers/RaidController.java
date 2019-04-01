package com.codeClan.example.pirateService.Controllers;


import com.codeClan.example.pirateService.Models.Raid;
import com.codeClan.example.pirateService.Repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;


    @GetMapping(value = "/")
    public List<Raid> getAllRaids(){
        return raidRepository.findAll();

    }

}
