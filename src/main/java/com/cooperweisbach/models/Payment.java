package com.cooperweisbach.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PaymentId")
    int paymentId;
    @NonNull
    @Column(name="PaymentAmount")
    double paymentAmount;
    @NonNull
    @Column(name="PaymentFor")
    String paymentFor;
    @NonNull
    @Column(name="PaymentStatus")
    String paymentStatus;
    @NonNull
    @Column(name="PaymentDate")
    @Temporal(value=TemporalType.DATE)
    Date paymentDate;
    @ManyToOne()
    Member member;
}
