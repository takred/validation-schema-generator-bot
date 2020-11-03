package takred.validationschemageneratorbot;

import org.springframework.stereotype.Service;

@Service
public class RestApiServiceImpl implements RestApiService {
    private final ValidationServiceClient validationServiceClient;

    public RestApiServiceImpl(ValidationServiceClient validationServiceClient) {
        this.validationServiceClient = validationServiceClient;
    }

    public String returning(DataDto dataDto) {
        return validationServiceClient.getValidation(dataDto.getData());
    }

    public String returning(String data) {
        return validationServiceClient.getValidation(data);
    }
}
