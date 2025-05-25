package com.admin.bank.bank_services.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private Long numberAccount;

    private String change;

    private boolean enabled;

    @ManyToOne
    @JoinColumn(name = "client_id", foreignKey = @ForeignKey(name = "fk_account_client"))
    private Client client;
}
