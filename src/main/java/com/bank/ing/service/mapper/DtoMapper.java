package com.bank.ing.service.mapper;

import com.bank.ing.dto.request.RequestCreationAccountDTO;
import com.bank.ing.dto.request.RequestDepositAccountDTO;
import com.bank.ing.dto.request.RequestTransferOperationDTO;
import com.bank.ing.dto.request.RequestWithdrawAccountDTO;
import com.bank.ing.dto.response.ResponseAccountDTO;
import com.bank.ing.dto.response.ResponseDepositWithdrawTransferDTO;
import com.bank.ing.entity.Account;
import com.bank.ing.entity.Operation;

public class DtoMapper {


    public static Account toAccountEntity(RequestCreationAccountDTO requestCreationAccountDTO) {
        return Account
                .builder()
                .initialDepositAmount(requestCreationAccountDTO.getInitialDepositAmount())
                .balance(requestCreationAccountDTO.getInitialDepositAmount())
                .build();
    }

    public static ResponseAccountDTO toResponseAccountDTO(Account account) {
        return ResponseAccountDTO
                .builder()
                .customerId(account.getCustomer().getId())
                .id(account.getId())
                .balance(account.getBalance())
                .creationTimestamp(account.getCreationTimestamp())
                .build();
    }

    public static Operation toTransferOperationEntity(RequestTransferOperationDTO requestTransferOperationDTO) {
        return Operation
                .builder()
                .value(requestTransferOperationDTO.getValue())
                .build();
    }

    public static Operation toDepositOperationEntity(RequestDepositAccountDTO requestOperationDTO) {
        return Operation
                .builder()
                .value(requestOperationDTO.getDepositAmount())
                .build();
    }


    public static Operation toWithdrawOperationEntity(RequestWithdrawAccountDTO requestOperationDTO) {
        return Operation
                .builder()
                .value(requestOperationDTO.getWithdrawAmount())
                .build();
    }

    public static ResponseDepositWithdrawTransferDTO toResponseOperationDTO(Operation operation) {
        return ResponseDepositWithdrawTransferDTO
                .builder()
                .id(operation.getId())
                .typeOperation(operation.getType())
                .senderAccountId(operation.getSenderAccount().getId())
                .receiverAccountId(operation.getReceiverAccount().getId())
                .value(operation.getValue())
                .creationTimestamp(operation.getOperationDateTime())
                .build();
    }

    public static ResponseDepositWithdrawTransferDTO toResponseHistoryDTO(Operation operation) {
        return ResponseDepositWithdrawTransferDTO
                .builder()
                .id(operation.getId())
                .typeOperation(operation.getType())
                .senderAccountId(null)
                .receiverAccountId(operation.getReceiverAccount().getId())
                .value(operation.getValue())
                .creationTimestamp(operation.getOperationDateTime())
                .build();
    }

    public static ResponseDepositWithdrawTransferDTO toResponseDepositWithdrawDTO(Operation operation) {
        return ResponseDepositWithdrawTransferDTO
                .builder()
                .id(operation.getId())
                .typeOperation(operation.getType())
                .senderAccountId(null)
                .receiverAccountId(operation.getReceiverAccount().getId())
                .value(operation.getValue())
                .creationTimestamp(operation.getOperationDateTime())
                .build();
    }




}
