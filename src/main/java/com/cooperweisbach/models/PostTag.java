package com.cooperweisbach.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PostTag")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int postTagId;
    @NonNull
    @Column(name="TagType")
    String tagType;
    @ManyToMany(mappedBy = "post")
    List<Post> postList;


}
