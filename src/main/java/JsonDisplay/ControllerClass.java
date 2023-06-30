package JsonDisplay;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class  ControllerClass{
    @GetMapping("/data")
    public List<DataFile> dataDetails() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        List<DataFile> data = mapper.readValue(new File("src/main/resources/Data.json"), List.class);
        System.out.println("hello World");
        return data;
    }

}
