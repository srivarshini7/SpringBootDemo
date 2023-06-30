package com.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayersData {
    public String name;
    public String favorite_sport;
    public String address;
    public String date_of_birth;
    public String phone_number;
    public String surname;
    public String father_name;
    public String mother_name;
}
