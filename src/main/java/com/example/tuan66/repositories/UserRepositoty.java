package com.example.tuan66.repositories;



import com.example.tuan66.entities.PostComment;
import com.example.tuan66.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long> {
    // Các phương thức CRUD sẽ tự động được tạo ra
//    public List<Candidate> findAll();
    public User findUserByRegisteredAt(String RegisteredAt);
}