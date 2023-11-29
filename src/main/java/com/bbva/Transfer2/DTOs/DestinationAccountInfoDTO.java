package com.bbva.Transfer2.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinationAccountInfoDTO {
    private Long destinationAccountNumber;
    private String bankName;
    private String accountNumberCCI;
    private String ownerName;
}
