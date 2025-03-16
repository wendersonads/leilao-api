package projeto.consumingdatasiteapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projeto.consumingdatasiteapi.model.DTO.Lote;
import projeto.consumingdatasiteapi.service.LoteService;

import java.util.List;

@RestController
@RequestMapping(value = "api/lotes")
public class LoteController {

    private final LoteService loteService;

    @Autowired
    LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Lote> getLotes() {
        return loteService.getLotes();
    }
}
