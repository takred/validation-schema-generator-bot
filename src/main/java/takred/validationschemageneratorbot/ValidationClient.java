package takred.validationschemageneratorbot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8080", path = "/", name = "validation-client")
public interface ValidationClient {

    @PostMapping(value = "/create", consumes = {"application/json"})
    String getValidation(String json);
}
