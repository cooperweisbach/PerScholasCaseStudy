package com.cooperweisbach.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="messagethread")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageThread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int threadId;
    @NonNull
    @Column(name="ThreadName")
    private String threadName;
    @NonNull
    @Column(name="ThreadCreationDate")
    @Temporal(value = TemporalType.DATE)
    private Date threadCreationDate;
    @OneToMany
    List<Message> messageList;
}
