package com.bbva.Transfer2.controller;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.service.TransferService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestTransferController {
    @Mock
    private TransferService transferService;

    @InjectMocks
    private TransferController transferController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllTrans() {

        TransferDTO transfer1 = new TransferDTO();

        transfer1.setSourceAccount("15454145445245");
        transfer1.setDestinationAccount("114444446452139");
        transfer1.setAmount(new BigDecimal(145.35));
        transfer1.setStatus("pendiente o confirmado");
        transfer1.setDate(LocalDateTime.parse("2023-11-28T12:30:45"));
        transfer1.setMessage("pago motivo por : ");

        TransferDTO transfer2 = new TransferDTO();

        transfer2.setSourceAccount("789441214654121");
        transfer2.setDestinationAccount("35659985985965645");
        transfer2.setAmount(new BigDecimal(1987.99));
        transfer2.setStatus("PEN");
        transfer2.setDate(LocalDateTime.parse("2023-11-28T12:30:45"));
        transfer2.setMessage("pago motivo por :");

        List<TransferDTO> expectedTransfers = Arrays.asList(transfer1, transfer2);

        when(transferService.getAllTransactions()).thenReturn(expectedTransfers);


        List<TransferDTO> result = transferController.getAllTransactions();

        assertEquals(expectedTransfers, result);
    }

    @Test
    void testGetById() {

        Long id = 1L;
        TransferDTO transferDTO = new TransferDTO();
        when(transferService.getTransactionById(id)).thenReturn(transferDTO);


        ResponseEntity<TransferDTO> responseEntity = transferController.getById(id);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(transferDTO, responseEntity.getBody());
        verify(transferService, times(1)).getTransactionById(id);
    }

    @Test
    void testGetByIdNotFound() {

        Long id = 1L;
        when(transferService.getTransactionById(id)).thenThrow(new EntityNotFoundException("Transfer not found"));


        ResponseEntity<TransferDTO> responseEntity = transferController.getById(id);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        verify(transferService, times(1)).getTransactionById(id);
    }

    @Test
    void testSaveUpdate() {

        TransferDTO transferDTO = new TransferDTO();


        transferController.saveUpDate(transferDTO);


        verify(transferService, times(1)).saveTransaction(transferDTO);
    }

    @Test
    void testDeleteTransfer() {

        Long id = 1L;

        transferController.deleteTransfer(id);


        verify(transferService, times(1)).deleTransaction(id);
    }

}
