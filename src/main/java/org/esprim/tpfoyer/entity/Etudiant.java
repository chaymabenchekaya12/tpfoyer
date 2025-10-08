package org.esprim.tpfoyer.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt ;
    private Long cin;
    private String ecole;
    @JsonFormat(pattern = "yyy-MM-dd")
    private Date dateNaissance;
    private String prenomEt;
    @ManyToMany(mappedBy="etudiants",cascade =CascadeType.ALL)
    private List<Reservation> reservations;
}
