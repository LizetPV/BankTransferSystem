package com.bbva.Transfer2.mapper;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.model.Transfer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    @Mapping(target = "transferID", source = "transfer.transferID")
    TransferDTO ToTransferDTO(Transfer transfer);

    @Mapping(target = "transferID", ignore = true) // Ignore transferID during mapping from DTO to entity
    Transfer toTransferEntity(TransferDTO transferDTO);

}
