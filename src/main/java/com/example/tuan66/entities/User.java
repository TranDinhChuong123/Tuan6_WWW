package com.example.tuan66.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    private long id;
    private String mobile;
    private Instant lastLogin;
    private String lastNmae;
    private String intro;
    private String profile;
    private String registeredAt;
    @OneToMany(mappedBy = "user")
    private Set<PostComment> comments;
    private String passwordHash;
    private String middleName;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts;
    private String firstName;
    private String email;

    public User(long id) {
        this.id = id;
    }
}
