package com.bbva.Transfer2.service.impl;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.Repository.TransferRepository;
import com.bbva.Transfer2.mapper.TransferMapper;
import com.bbva.Transfer2.model.Transfer;
import com.bbva.Transfer2.service.TransferService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

//Implementamos los metodos
@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferMapper transferMapper;


    @Override
    public List<TransferDTO> getAllTransactions() {
        List<Transfer> transfers = transferRepository.findAll();
        return transfers.stream()
                .map(transferMapper::ToTransferDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TransferDTO getTransactionById(Long transferID) {
        Transfer transfer = transferRepository.findById(transferID)
                .orElseThrow(() -> new EntityNotFoundException("Transference not found by id: " + transferID));
        return transferMapper.ToTransferDTO(transfer);
    }


    @Override
    public void saveTransaction(TransferDTO transferDTO) {
        // Mapea el TransferDTO a Transfer y luego guárdalo
        Transfer transfer = transferMapper.toTransferEntity(transferDTO);
        System.out.println("TransferDTO: " + transferDTO);
        System.out.println("Mapped Transfer: " + transfer);
        transferRepository.save(transfer);

    }

    @Override
    public void deleTransaction(Long id) {
        transferRepository.deleteById(id);
    }
}
