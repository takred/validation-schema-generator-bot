package takred.validationschemageneratorbot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class RestApiController {
    private final RestApiService restApiService;

    public RestApiController(RestApiService restApiService) {
        this.restApiService = restApiService;
    }

    @PostMapping(value = "return")
    public String returning(@RequestBody DataDto dataDto) {
        return restApiService.returning(dataDto);
    }
}
