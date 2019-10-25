package ale.adq.gal.aut.cma.api.controller;

import ale.adq.gal.aut.cma.api.model.dto.CMATriggeredTransactionDto;
import ale.adq.gal.aut.cma.api.service.CMAService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "CMA")
public class CMAController {

    @Autowired
    CMAService cmaService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de transações acionadas"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @ApiOperation(value = "CMA")
    @RequestMapping(value = "/cma", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CMATriggeredTransactionDto getSummaryByTriggeredTransactions() {
        return new CMATriggeredTransactionDto();
    }

}
