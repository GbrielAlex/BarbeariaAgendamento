package com.gabrieldev.barbeariaagendamento.domain.disponibilidade;

import com.gabrieldev.barbeariaagendamento.domain.barbeiro.Barbeiro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Disponibilidade {

    @EmbeddedId
    private DisponibilidadeId id;

    @ManyToOne
    @MapsId("barbeiroId")
    @JoinColumn(name = "barbeiro_id")
    private Barbeiro barbeiro;


    @ElementCollection
    @CollectionTable(name = "disponibilidade_horarios_disponiveis",
            joinColumns = {
                    @JoinColumn(name = "disponibilidade_barbeiro_id", referencedColumnName = "barbeiro_id"),
                    @JoinColumn(name = "disponibilidade_data", referencedColumnName = "data")
            })
    private List<LocalTime> horariosDisponiveis;

    // Construtores, getters e setters...
}

