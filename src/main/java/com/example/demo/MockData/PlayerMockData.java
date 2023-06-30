package com.example.demo.MockData;
import com.example.demo.Entity.PlayersData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PlayerMockData {
    public static List<PlayersData> getPlayersData() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        List<PlayersData> data = mapper.readValue(new File("src/main/resources/JsonData/PlayersData.json"), List.class);
        System.out.println("The Players data is: "+data);
        return data;

    }
}
