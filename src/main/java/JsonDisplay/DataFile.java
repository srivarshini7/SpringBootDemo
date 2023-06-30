package JsonDisplay;

import jdk.jfr.DataAmount;
import lombok.Data;
import java.util.List;

@Data
public class DataFile {
    public boolean id;
    private List< DataFile2> DemoData2;

    public static void main(String[] args) {
        System.out.println("DataFile is working");
    }


}
