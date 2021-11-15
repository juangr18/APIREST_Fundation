package com.jg.apirest.APIREST.View;

import com.jg.apirest.APIREST.Controller.FundacionMascotas;
import com.jg.apirest.APIREST.Model.Mascota;
import com.jg.apirest.APIREST.Model.Propietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class WebView {
    private final FundacionMascotas fundacionMascotas;

    public WebView(FundacionMascotas fundacionMascotas) {
        this.fundacionMascotas = fundacionMascotas;
    }

    @GetMapping("/propietario")
    public List<Mascota> getPropietarios(){
        return fundacionMascotas.listDB();
    }
}
