package org.esprim.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.esprim.tpfoyer.entity.Bloc;
import org.esprim.tpfoyer.entity.Chambre;
import org.esprim.tpfoyer.services.IBlocService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

@Controller
public class BlocRestControlleur {
    IBlocService blocService;

    // http://localhost:13660/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getAllBlocs() {
        List<Bloc> listblocs = blocService.retriveAllblocs();
        return listblocs;
    }
    // http://localhost:13660/tpfoyer/bloc/retrieve-bloc/{id-bloc}
    @GetMapping("/retriveBloc/{bloc-id}")
    public Bloc retrieveChambre(@PathVariable("bloc-id") Long idBloc) {
        Bloc bloc = blocService.retriveBloc(idBloc);
        return bloc;
    }
    // http://localhost:13660/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:13660/tpfoyer/bloc/remove-bloc/{bloc-id}
// DELETE remove
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long idBloc) {
        blocService.removeBloc(idBloc);
    }

    // http://localhost:13660/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }
}
