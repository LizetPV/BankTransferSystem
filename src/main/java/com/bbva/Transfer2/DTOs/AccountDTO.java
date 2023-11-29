package com.bbva.Transfer2.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class AccountDTO {
    private Long accountNumber;
    private String name;
    private BigDecimal balance;
    private String currency;
}
