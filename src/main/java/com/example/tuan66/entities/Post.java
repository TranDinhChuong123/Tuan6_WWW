package com.example.tuan66.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.util.Set;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Boolean published;
    private String content;
    private  String imagePath;

    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments;

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = true)
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

    public Post(Boolean published, String content, String imagePath, String metaTitle, String summary, Instant createddAt, Instant publishedAt, String title, User author, Instant updateAt, Instant publishAt) {

        this.published = published;
        this.content = content;
        this.imagePath = imagePath;

        this.metaTitle = metaTitle;
        this.summary = summary;
        this.createddAt = createddAt;
        this.publishedAt = publishedAt;
        this.title = title;
        this.author = author;
        this.updateAt = updateAt;
        this.publishAt = publishAt;
    }

    public Post(long id) {
        this.id = id;
    }
}
