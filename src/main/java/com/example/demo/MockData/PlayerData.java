package com.example.demo.MockData;

import com.example.demo.Dto.SportsClass;
import com.example.demo.Entity.PlayerClass;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PlayerData {
        public static List<PlayerClass> getPlayers() throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            List<PlayerClass> data = List.of(mapper.readValue(new File("/Users/developer/Downloads/demo/src/main/resources/JsonData/PlayersData.json"), PlayerClass[].class));
            System.out.println(data);
            return data;
        }

        public static SportsClass getSport() throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            SportsClass favSport = mapper.readValue(new File("/Users/developer/Downloads/demo/src/main/resources/JsonData/SportsData.json"), SportsClass.class);
            System.out.println(favSport);
            return favSport;
        }



}
