package com.bbva.Transfer2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_DestinationAccountInfo")
public class DestinationAccountInfo {
    @Id
    @Column(name = "destinationAccountNumber")
    private Long destinationAccountNumber;
    private String bankName;
    private String accountNumberCCI;
    private String ownerName;
}
