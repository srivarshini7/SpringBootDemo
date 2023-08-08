package com.example.demo.Repository;
import com.example.demo.Entities.Users;
import com.example.demo.dto.CommentsResponse;
import com.example.demo.dto.PostResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
