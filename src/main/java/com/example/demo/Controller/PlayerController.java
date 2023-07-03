package com.example.demo.Controller;


import com.example.demo.Entity.PlayerClass;
import com.example.demo.Service.MapAndFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController

public class PlayerController {
    @Autowired
    MapAndFilter mapAndFilter;

    @GetMapping("/players/{favorite_sport}")
    public PlayerClass getPlayerDetails(@PathVariable String favorite_sport) throws IOException {
        return mapAndFilter.MapAndFilterData(favorite_sport);
    }

    @GetMapping("/newData")
    public List<PlayerClass> details() throws IOException {
        return mapAndFilter.getSportDetails();
    }



}
