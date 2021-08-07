package com.cooperweisbach.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="lease")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Lease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="LeaseId")
    private int leaseId;
    @OneToOne
    @JoinColumn(name="LeasableId", referencedColumnName = "LeaseId")
    private Leasable leasable;
    @NonNull
    @Temporal(value = TemporalType.DATE)
    private Date startDate;
    @ManyToOne
    private Member member;



}
