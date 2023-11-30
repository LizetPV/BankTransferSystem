package com.bbva.Transfer2.service;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.Repository.TransferRepository;
import com.bbva.Transfer2.mapper.TransferMapper;
import com.bbva.Transfer2.model.Transfer;
import com.bbva.Transfer2.service.impl.TransferServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TestTransferServiceImpl {
    @Mock
    private TransferRepository transferRepository;

    @Mock
    private TransferMapper transferMapper;

    @InjectMocks
    private TransferServiceImpl transferServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
 @Test
    void getAllTransactions(){
     Transfer transfer1 = new Transfer();
     Transfer transfer2 = new Transfer();

     when(transferRepository.findAll()).thenReturn(Arrays.asList(transfer1, transfer2));

     TransferDTO transferDTO1 = new TransferDTO();
     TransferDTO transferDTO2 = new TransferDTO();
     when(transferMapper.ToTransferDTO(transfer1)).thenReturn(transferDTO1);
     when(transferMapper.ToTransferDTO(transfer2)).thenReturn(transferDTO2);

     // Act
     List<TransferDTO> result = transferServiceImpl.getAllTransactions();

     // Assert
     assertEquals(2, result.size());
     assertEquals(transferDTO1, result.get(0));
     assertEquals(transferDTO2, result.get(1));
 }
 //Prueba 2
    @Test
    void testGetTransactionById() {
        // Arrange
        long transferId = 1L;
        Transfer transfer = new Transfer();
        when(transferRepository.findById(transferId)).thenReturn(Optional.of(transfer));

        TransferDTO transferDTO = new TransferDTO();
        when(transferMapper.ToTransferDTO(transfer)).thenReturn(transferDTO);

        // Act
        TransferDTO result = transferServiceImpl.getTransactionById(transferId);

        // Assert
        assertEquals(transferDTO, result);
    }

    //Prueba3
    @Test
    void testGetTransactionById_EntityNotFoundException() {
        // Arrange
        long transferId = 1L;
        when(transferRepository.findById(transferId)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(EntityNotFoundException.class, () -> transferServiceImpl.getTransactionById(transferId));
    }

    //Prueba 4
    @Test
    void testSaveTransaction() {
        // Arrange
        TransferDTO transferDTO = new TransferDTO();
        Transfer transfer = new Transfer();
        when(transferMapper.toTransferEntity(transferDTO)).thenReturn(transfer);

        // Act
        transferServiceImpl.saveTransaction(transferDTO);

        // Assert
        verify(transferRepository, times(1)).save(transfer);
    }
    @Test
    void testDeleTransaction() {
        // Arrange
        long transferId = 1L;

        // Act
        transferServiceImpl.deleTransaction(transferId);

        // Assert
        verify(transferRepository, times(1)).deleteById(transferId);
    }
}
