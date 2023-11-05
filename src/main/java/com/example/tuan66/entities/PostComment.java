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
@Table(name = "postComment")
public class PostComment {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String title;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<PostComment> postComments;
    private Boolean published;
    private String content;
    private Instant publishedAt;
    private Instant createddAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public PostComment(long id) {
        this.id = id;
    }

    public PostComment(long id, Post post, String title, PostComment parent, Boolean published, String content, Instant publishedAt, Instant createddAt, User user) {
        this.id = id;
        this.post = post;
        this.title = title;
        this.parent = parent;
        this.published = published;
        this.content = content;
        this.publishedAt = publishedAt;
        this.createddAt = createddAt;
        this.user = user;
    }
}
