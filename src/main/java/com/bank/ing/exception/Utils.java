package com.bank.ing.exception;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import java.util.Arrays;
import java.util.function.Supplier;

@UtilityClass
@Log4j2
public class Utils {
    public static void throwsOnCondition(boolean conditionToThrowsException,
                                   Supplier<? extends RuntimeException> exceptionSupplier,
                                   String ... logMessages) {
        if (conditionToThrowsException) {
            Arrays.stream(logMessages).forEach(log::error);
            throw exceptionSupplier.get();
        }
    }
}
