package ale.adq.gal.aut.cma.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AutorizationOpenTransactionRepository extends CrudRepository<AutorizationOpenTransaction, Long> {

    @Query(value = "SELECT * \n" +
            "FROM PS_GAL_AAS.AU_OPEN_TRANSACTION \n" +
            "WHERE TRANSACTION_END_TIME BETWEEN ?1 AND ?2", nativeQuery = true)
    public List<AutorizationOpenTransaction> searchByTriggeredTransaction();

    @Query(value = "SELECT * \n" +
            "FROM PS_GAL_AAS.AU_OPEN_TRANSACTION \n" +
            "WHERE TRANSACTION_END_TIME BETWEEN ?1 AND ?2", nativeQuery = true)
    public List<AutorizationOpenTransaction> searchByTransactionDenied();
}
