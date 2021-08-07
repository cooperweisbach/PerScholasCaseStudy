package com.cooperweisbach.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name="leasable")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Leasable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaseableId;
    @NonNull
    @Column(name="LeasableCode")
    private String leasableCode;
    @NonNull
    @Column(name="LeasableType")
    private String leasableType;
    @NonNull
    @Column(name="LeaseableStatus")
    private String leasableStatus;
    @NonNull
    @Column(name="LeasableYearlyRent")
    private double leasableYearlyRent;
    @NonNull
    @Column(name="LeasableSize")
    private double leasableSize;
    @OneToOne(mappedBy = "leasable")
    private Lease lease;


}
