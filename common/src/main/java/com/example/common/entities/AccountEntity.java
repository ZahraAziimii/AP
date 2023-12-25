package com.example.common.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CardEntity card;
    @Column(unique = true, nullable = false)
    private Long accountNumber;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity user;
    private Long balance;
    @OneToMany(mappedBy = "account", targetEntity = TransactionEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TransactionEntity> transactions;


}
