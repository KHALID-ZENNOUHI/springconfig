package org.Spring.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String membershipNumber;
    private String firstName;
    private String lastName;
    private String idDocument;
    private String nationality;
    private LocalDate membershipDate;
    private LocalDate licenseExpiryDate;

}