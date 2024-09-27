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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "barbeiro_id")
    private Barbeiro barbeiro;

    private LocalDate data;

    @ElementCollection
    private List<LocalTime> horariosDisponiveis ;

}
