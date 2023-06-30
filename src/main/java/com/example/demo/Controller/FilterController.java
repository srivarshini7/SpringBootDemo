package com.example.demo.Controller;
import com.example.demo.Entity.PlayersData;
import com.example.demo.MockData.PlayerMockData;
import com.example.demo.Service.FilterService;
import com.example.demo.dto.SportsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;

@RestController
public class FilterController {
    @Autowired
    FilterService filterService;
    @GetMapping("/Players/{favorite_sports}")
    public PlayersData getPlayersDetails(@PathVariable String favorite_Sports) throws IOException{
        return filterService.MapAndFilterData(favorite_Sports);
    }
    @GetMapping("/getData")
    public SportsData details() throws IOException {
        return (SportsData) PlayerMockData.getPlayersData();
    }
    @GetMapping("/AllData")
    public List<PlayersData> getAllTheData() throws IOException{
        return PlayerMockData.getPlayersData();
    }
}
