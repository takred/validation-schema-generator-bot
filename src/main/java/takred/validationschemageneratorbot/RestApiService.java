package takred.validationschemageneratorbot;

import org.springframework.stereotype.Service;

@Service
public class RestApiService {

    public String returning(DataDto dataDto) {
        return dataDto.getData();
    }
}
