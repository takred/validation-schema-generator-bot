package takred.validationschemageneratorbot;

import java.beans.ConstructorProperties;

public class DataDto {
    private final String data;

    @ConstructorProperties({"data"})
    public DataDto(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
