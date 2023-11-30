package com.bbva.Transfer2.service;

import com.bbva.Transfer2.DTOs.TransferDTO;


import java.util.List;
//aqui solo definimos los métodos
public interface TransferService {
    List<TransferDTO> getAllTransactions();

    TransferDTO getTransactionById(Long transferID);

        void saveTransaction(TransferDTO transferDTO);

    void deleTransaction(Long id);
}
