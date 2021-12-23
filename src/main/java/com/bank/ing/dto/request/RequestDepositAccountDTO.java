package com.bank.ing.dto.request;

import com.bank.ing.configuration.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import static com.bank.ing.configuration.Constants.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestDepositAccountDTO {

    @JsonProperty("account_id")
    @NotNull
    @Min(value = 1, message = Constants.ACCOUNT_NOT_FOUND_ERROR)
    private Long accountId;


    @JsonProperty("deposit_amount")
    @DecimalMin(value = "0.01", inclusive = false,  message = INVALID_DEPOSIT_AMOUNT)
    @Digits(integer = 12, fraction = 2, message = INITIAL_AMOUNT_FORMAT_INVALID)
    private BigDecimal depositAmount;

}
