package com.cooperweisbach.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {
    //Resources
    //https://www.dummies.com/web-design-development/wordpress/installing-configuring/using-a-mysql-database-to-manage-your-wordpress-blog-data/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int postId;
    @NonNull
    @Column(name="AuthorID")
    int authorId;
    @NonNull
    @Temporal(value=TemporalType.DATE)
    Date postDate;
    @NonNull
    @Temporal(value=TemporalType.DATE)
    Date creationDate;
    @NonNull
    @Column(name="PostTitle", columnDefinition = "VARCHAR(150) NOT NULL")
    String postTitle;
    @NonNull
    @Column(name="PostContent", columnDefinition = "TEXT NOT NULL")
    String postContent;
    @NonNull
    @Column(name="PostStatus", columnDefinition = "VARCHAR(15) NOT NULL")
    String postStatus;
    @ManyToMany
    List<PostTag> postTagList;
    @ManyToOne
    Member member;



}
