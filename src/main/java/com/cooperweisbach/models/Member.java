package com.cooperweisbach.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    @NonNull
    @Column(name = "firstName", columnDefinition = "VARCHAR(50) NOT NULL")
    private String firstName;
    @NonNull
    @Column(name = "lastName", columnDefinition = "VARCHAR(50) NOT NULL")
    private String lastName;
    @NonNull
    @Column(name="email", columnDefinition = "NOT NULL")
    private String email;
    @NonNull
    @Column()
    private String phoneNumber;
    @NonNull
    @Column()
    private String password;
    @NonNull
    @Column()
    @Temporal(TemporalType.DATE)
    private Date joinedDate;
    @NonNull
    @Column()
    private String memberLevel;
    @NonNull
    @Column()
    private String memberStatus;
    @OneToMany(mappedBy = "member")
    private List<Lease> leases;
    @OneToMany(mappedBy = "member")
    private List<Post> posts;
    @OneToMany(mappedBy = "member")
    private List<Message> messages;
    @OneToMany(mappedBy = "member")
    private List<Payment> payments;






}
