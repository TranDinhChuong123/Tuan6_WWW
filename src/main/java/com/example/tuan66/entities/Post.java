package com.example.tuan66.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "post")
public class Post {
    @Id
    private long id;
    private Boolean published;
    private String content;
    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Post parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Post> posts;

    private String metaTitle;
    private String summary;
    private Instant createddAt;
    private Instant publishedAt;

    private String title;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
    private Instant updateAt;
    private Instant publishAt;

    public Post(long id) {
        this.id = id;
    }
}
