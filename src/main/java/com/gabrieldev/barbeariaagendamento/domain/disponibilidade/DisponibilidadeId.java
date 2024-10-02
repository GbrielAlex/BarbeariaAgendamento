package com.gabrieldev.barbeariaagendamento.domain.disponibilidade;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DisponibilidadeId implements Serializable {

    private Long barbeiroId;
    private LocalDate data;

    // Construtores, getters e setters...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisponibilidadeId)) return false;
        DisponibilidadeId that = (DisponibilidadeId) o;
        return Objects.equals(barbeiroId, that.barbeiroId) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barbeiroId, data);
    }
}
