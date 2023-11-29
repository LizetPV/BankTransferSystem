package com.bbva.Transfer2.service.impl;

import com.bbva.Transfer2.Repository.TransferRepository;
import com.bbva.Transfer2.model.Transfer;
import com.bbva.Transfer2.service.TransferService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Implementamos los metodos
@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransferRepository transferRepository;
    @Override
    public List<Transfer> getAllTransactions() {
        return transferRepository.findAll();
    }

    @Override
    public Transfer getTransactionById(Long transferID) {
        return transferRepository.findById(transferID).
                orElseThrow(() -> new EntityNotFoundException("Tranference no encontrada:" +transferID));
    }

    @Override
    public void saveTransaction(Transfer transfer) {
        transferRepository.save(transfer);
    }

    @Override
    public void deleTransaction(Long id) {
        transferRepository.deleteById(id);

    }
}
