package com.bbva.Transfer2.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
public class TransferDTO {
    private Long transferID;

    private String sourceAccount;

    private String destinationAccount;
    private BigDecimal amount;
    private LocalDateTime date;
    private String status;
    private String message;
}
