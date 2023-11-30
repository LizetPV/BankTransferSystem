package com.bbva.Transfer2.controller;

import com.bbva.Transfer2.DTOs.TransferDTO;
import com.bbva.Transfer2.service.TransferService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/transfer")
public class TransferController {
    @Autowired //enlazo mis servicios
    private TransferService transferService;

    @Operation(
            summary = "Fetch all transferences",
            description = "fetches all transfer entities and their data from data source"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "404", description = "cuando no le mandas el id de la transferencia")
    })
    @GetMapping//expongo el servicio
    public List<TransferDTO> getAllTransactions() {
        return transferService.getAllTransactions();
    }
     @GetMapping("/{id}")
    public ResponseEntity<TransferDTO>getById(@PathVariable("id") Long id){
        TransferDTO transferDTO;
        try {
            transferDTO = transferService.getTransactionById(id);
            return new ResponseEntity<>(transferDTO, HttpStatus. OK);
        } catch(EntityNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public void saveUpDate(@RequestBody TransferDTO TransferDTO) {
       transferService.saveTransaction(TransferDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteTransfer(@PathVariable ("id")Long id) {
        transferService.deleTransaction(id);
    }
}
