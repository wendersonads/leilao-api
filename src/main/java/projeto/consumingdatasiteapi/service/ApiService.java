package projeto.consumingdatasiteapi.service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class ApiService {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ApiService() {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    public <T> List<T> fetchData(String url, TypeReference<List<T>> typeReference) {
        try {
            String response = restTemplate.getForObject(url, String.class);
            return objectMapper.readValue(response, typeReference);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar JSON da URL: " + url, e);
        }
    }
}