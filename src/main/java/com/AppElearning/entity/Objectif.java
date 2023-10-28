package com.AppElearning.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "objectif")
public class Objectif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ordre;
    private String titre;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_chapitre")
    private Chapitre chapitre;

}
