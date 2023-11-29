package com.bbva.Transfer2.service;

import com.bbva.Transfer2.model.Transfer;

import java.util.List;
//aqui solo definimos los métodos
public interface TransferService {
    List<Transfer> getAllTransactions();

    Transfer getTransactionById(Long transferID);

    void saveTransaction (Transfer transaction);

    void deleTransaction(Long id);
}
