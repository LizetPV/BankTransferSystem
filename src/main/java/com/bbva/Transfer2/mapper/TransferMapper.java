package com.bbva.Transfer2.mapper;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.model.Transfer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    TransferDTO ToTransferDTO(Transfer transfer);
     Transfer toTransferEntity(TransferDTO transferDTO);

}
