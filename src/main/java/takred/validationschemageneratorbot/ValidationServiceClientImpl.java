package takred.validationschemageneratorbot;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceClientImpl implements ValidationServiceClient{
    private final ValidationClient validationClient;

    public ValidationServiceClientImpl(ValidationClient validationClient) {
        this.validationClient = validationClient;
    }

    @Override
    public String getValidation(String json) {
        return validationClient.getValidation(json);
    }
}
