package com.example.common.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CARD")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 5)
    private Integer cvv2;
    @Column(nullable = false)
    private Date expireDate;
    @Column(nullable = false, length = 20)
    private String cardNumber;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private AccountEntity account;
}
