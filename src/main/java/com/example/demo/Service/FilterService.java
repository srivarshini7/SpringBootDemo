package com.example.demo.Service;
import com.example.demo.Entity.PlayersData;
import com.example.demo.MockData.PlayerMockData;
import java.io.IOException;
import java.util.List;

public class FilterService {
    public PlayersData MapAndFilterData(String favorite_sport) throws IOException {
        List<PlayersData> player = PlayerMockData.getPlayersData();
        System.out.println("hello to service file");
        return player.stream()
                .filter(PlayerDetails -> PlayerDetails.getFavorite_sport().equals(favorite_sport))
                .findFirst().orElse(null);
    }
}
