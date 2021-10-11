package io.github.dougllasfps.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Car extends PanacheEntity  {

    @NotBlank
    private String modelo;
    @NotBlank
    private String cor;
    @NotNull
    private Integer ano;
    @NotBlank
    private String proprietario;

    public Car(@NotBlank String modelo, @NotBlank String cor, @NotNull Integer ano, @NotBlank String proprietario) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.proprietario = proprietario;
    }
}
