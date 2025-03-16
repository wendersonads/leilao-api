package projeto.consumingdatasiteapi.service;
import projeto.consumingdatasiteapi.Utils.UrlSites;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.consumingdatasiteapi.model.DTO.Lote;

import java.util.List;

@Service
public class LoteService {

    private final ApiService apiService;

    @Autowired
    LoteService(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<Lote> getLotes() {
       return apiService.fetchData(UrlSites.URL_BID_MAP, new TypeReference<List<Lote>>() {});
    }
}
