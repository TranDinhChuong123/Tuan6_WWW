package com.example.tuan66.repositories;



import com.example.tuan66.entities.Post;
import com.example.tuan66.entities.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepositoty extends JpaRepository<Post, Long> {
//    Optional<Object> findUserByRegisteredAt(String registeredAt);
    // Các phương thức CRUD sẽ tự động được tạo ra
//    public List<Candidate> findAll();
}