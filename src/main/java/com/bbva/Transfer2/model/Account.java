package com.bbva.Transfer2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_Account ")
public class Account {
    @Id
    @Column(name = "id_accountNumber",unique = true, nullable = false)
    private Long accountNumber;
    private String name;
    private BigDecimal balance;
    private String currency;
}
