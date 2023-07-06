package com.example.demo.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarksByExam {
    public int id;
    public String examName;
    public int english;
    public int mathematics;
    public int science;
    public int social;
}
