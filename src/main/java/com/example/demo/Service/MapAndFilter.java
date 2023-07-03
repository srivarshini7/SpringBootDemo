package com.example.demo.Service;
import com.example.demo.Entity.PlayerClass;
import com.example.demo.MockData.PlayerData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class MapAndFilter {
    public PlayerClass MapAndFilterData(String favourite_sport) throws IOException {
        List<PlayerClass> player = PlayerData.getPlayers();
        return player.stream()
                .filter(PlayerDetails -> PlayerDetails.getFavorite_sport().equals(favourite_sport))
                .findFirst().orElse(null);
    }

    public List<PlayerClass> getSportDetails() throws IOException {
        List<PlayerClass> addData = new ArrayList<>();
        List<String> values = PlayerData.getSport().getFavorite_sports();
        for (PlayerClass playerDetails : PlayerData.getPlayers()) {
            if (values.contains(playerDetails.getFavorite_sport())) {
                addData.add(playerDetails);
            }
        }
        return addData;
    }
}
