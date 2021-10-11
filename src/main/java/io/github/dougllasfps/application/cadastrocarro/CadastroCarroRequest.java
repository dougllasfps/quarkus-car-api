package io.github.dougllasfps.application.cadastrocarro;

import io.github.dougllasfps.domain.model.Car;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CadastroCarroRequest {

    @NotBlank
    private String modelo;
    @NotNull
    private Integer ano;
    @NotBlank
    private String cor;
    @NotBlank
    private String proprietario;

    public Car toModel(){
        return new Car(modelo, cor, ano, proprietario);
    }

}
