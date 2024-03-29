package erikzambeli.com.br.testeGubee.testegubee.servie.base;


import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class JsonParsingService {

    private final RestTemplate restTemplate;

    public JsonArray parse(String url){
        JsonParser parser = new JsonParser();
        return parser.parse(restTemplate.getForObject(url, String.class)).getAsJsonArray();
    }
}
