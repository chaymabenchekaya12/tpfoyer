package org.esprim.tpfoyer.entity;
import jakarta.persistence.*;
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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne()
    private Foyer foyer; //classe en majus
    @OneToMany(mappedBy = "bloc",cascade = CascadeType.ALL,fetch =FetchType.EAGER) // bloc1:ilisalitou f chambre ;;eager va afficher tous liste de chambra
    private List<Chambre> chambres;//chambre normalement class en majus
}
