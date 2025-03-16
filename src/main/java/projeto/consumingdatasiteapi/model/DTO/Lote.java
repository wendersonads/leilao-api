package projeto.consumingdatasiteapi.model.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lote {

    @JsonProperty("idlote")
    private Integer idLote;

    @JsonProperty("u_titulo")
    private String titulo;

    @JsonProperty("link")
    private String link;

    @JsonProperty("u_imagem_01")
    private String imagem;

    @JsonProperty("valor")
    private Double valor;

    @JsonProperty("lat")
    private Double latitude;

    @JsonProperty("lng")
    private Double longitude;

    @JsonProperty("cor")
    private String cor;
}