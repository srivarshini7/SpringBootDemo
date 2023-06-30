package JsonDisplay;

import lombok.Data;

@Data
public class DataFile2 {
    private int userId;
    private int id;
    private String title;
    private String body;

    public static void main(String[] args) {
        System.out.println("DataFile2 is working");
    }
}
