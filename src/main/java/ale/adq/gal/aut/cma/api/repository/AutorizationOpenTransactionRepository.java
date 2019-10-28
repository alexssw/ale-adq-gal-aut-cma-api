package ale.adq.gal.aut.cma.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface AutorizationOpenTransactionRepository extends CrudRepository<AutorizationOpenTransaction, Long> {

    @Query(value = "SELECT * \n" +
            "FROM PS_GAL_AAS.AU_OPEN_TRANSACTION \n" +
            "WHERE TRANSACTION_END_TIME BETWEEN " +
            "TO_TIMESTAMP(:startDate, 'YYYY-mm-DDTHH:MM:SS') AND " +
            "TO_TIMESTAMP(:startDate, 'YYYY-mm-DDTHH:MM:SS')", nativeQuery = true)
    public List<AutorizationOpenTransaction> searchByTriggeredTransaction(
            @Param("TRANSACTION_END_TIME") Timestamp startDate,
            @Param("TRANSACTION_END_TIME") Timestamp endDate
    );

    @Query(value = "SELECT * \n" +
            "FROM PS_GAL_AAS.AU_OPEN_TRANSACTION \n" +
            "WHERE TRANSACTION_END_TIME BETWEEN " +
            "TO_TIMESTAMP(:startDate, 'YYYY-mm-DDTHH:MM:SS') AND " +
            "TO_TIMESTAMP(:startDate, 'YYYY-mm-DDTHH:MM:SS')", nativeQuery = true)
    public List<AutorizationOpenTransaction> searchByTransactionDenied(
            @Param("TRANSACTION_END_TIME") Timestamp startDate,
            @Param("TRANSACTION_END_TIME") Timestamp endDate
    );
}
