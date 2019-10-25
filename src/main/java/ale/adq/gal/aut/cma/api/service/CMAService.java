package ale.adq.gal.aut.cma.api.service;

import ale.adq.gal.aut.cma.api.model.dto.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CMAService {

    public CMATriggeredTransactionDto searchAuthorizationByTriggeredTransactions(
            LocalDateTime startPeriod, LocalDateTime endPeriod) {

        return CMATriggeredTransactionDto.builder().build();

    }

}
