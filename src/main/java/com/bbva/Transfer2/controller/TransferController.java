package com.bbva.Transfer2.controller;

import com.bbva.Transfer2.model.Transfer;
import com.bbva.Transfer2.service.TransferService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Transfer> getAllTransactions() {
        return transferService.getAllTransactions();
    }
    @GetMapping("/{transferId}")//expongo el servicio
    public Transfer getBId(@PathVariable("transferId") Long transferId){
        return transferService.getTransactionById(transferId);
    }
    @PostMapping
    public void saveUpDate(@RequestBody Transfer transfer) {
       transferService.saveTransaction(transfer);
    }
    @DeleteMapping("/{id}")
    public void deleteTransfer(@PathVariable ("id")Long id) {
        transferService.deleTransaction(id);
    }
}
