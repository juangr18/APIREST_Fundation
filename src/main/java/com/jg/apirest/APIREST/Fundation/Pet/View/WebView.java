package com.jg.apirest.APIREST.Fundation.Pet.View;

import com.jg.apirest.APIREST.Fundation.Pet.Controller.ControllerPet;
import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class WebView {
    private final ControllerPet fundacionMascotas;

    public WebView(ControllerPet fundacionMascotas) {
        this.fundacionMascotas = fundacionMascotas;
    }

    @GetMapping("/")
    public List<Mascota> getPets(){
        return fundacionMascotas.listDB();
    }
    @GetMapping("/id")
    public void getById(@PathVariable UUID id){
        fundacionMascotas.filterUserById(id);
    }
    @PostMapping
    public void createPet(@RequestBody Mascota mascota){

    }
}
