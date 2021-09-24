package com.stackroute.informationservice.controllers;

import com.stackroute.informationservice.models.LocationStats;
import com.stackroute.informationservice.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("kawach/v1.0.0")
public class LandingPageController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public ResponseEntity<List<LocationStats>> getData()
    {
        return new ResponseEntity<List<LocationStats>>(coronaVirusDataService.getAllStats(), HttpStatus.OK);
    }

}
