package com.example.tuan66.repositories;



import com.example.tuan66.entities.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostCommentRepositoty extends JpaRepository<PostComment, Long> {
//    Optional<Object> findUserByRegisteredAt(String registeredAt);
    // Các phương thức CRUD sẽ tự động được tạo ra
//    public List<Candidate> findAll();
}