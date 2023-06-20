package com.example.demo.PostTask;

import com.example.demo.PostTask.DemoData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<DemoData, Long> {
    DemoData findAllByUserId(long userid);



}
