package com.jg.apirest.APIREST.Fundation.Pet.View;

import com.jg.apirest.APIREST.Fundation.Pet.Controller.CreatePet;
import com.jg.apirest.APIREST.Fundation.Pet.Controller.DeletePet;
import com.jg.apirest.APIREST.Fundation.Pet.Controller.ListPet;
import com.jg.apirest.APIREST.Fundation.Pet.Controller.UpdatePet;
import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pet")
public class WebView {

    private final CreatePet createPet;

    private final ListPet listPet;

    private final UpdatePet updatePet;

    private final DeletePet deletePet;

    public WebView(CreatePet createPet, ListPet listPet, UpdatePet updatePet, DeletePet deletePet) {
        this.createPet = createPet;
        this.listPet = listPet;
        this.updatePet = updatePet;
        this.deletePet = deletePet;
    }

    @GetMapping("/")
    public List<Mascota> getPets() {
        return listPet.listPetDB();
    }

    @GetMapping("/id")
    public void getById(@PathVariable UUID id) {
        listPet.filterUserById(id);
    }

    @PostMapping
    public void createPet(@RequestBody Mascota mascota){
        createPet.createPet(mascota);
    }

    @PutMapping
    public void updatePet(@RequestBody Mascota mascota){
        updatePet.updatePet(mascota);
    }
    @DeleteMapping("/{id}")
    public void deletePetById(@PathVariable String id){
        deletePet.DeletePetById(id);
    }
}
