package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SportsData {
    public List<String> favorite_sports;
}
