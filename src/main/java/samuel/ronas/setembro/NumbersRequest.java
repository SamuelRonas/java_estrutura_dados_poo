package samuel.ronas.setembro;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NumbersRequest {

    @JsonProperty("num1")
    private int num1;

    @JsonProperty("num2")
    private int num2;


}

