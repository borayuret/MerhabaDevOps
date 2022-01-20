package com.devopskurs.merhabadevops.controller;

import com.devopskurs.merhabadevops.entity.Kisi;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class KisiController {

    @GetMapping("/selamla")
    public String merhaba()
    {
        return "Merhaba DevOps";
    }

    @GetMapping("/kisiler")
    public List<Kisi> getKisiler()
    {
        List<Kisi> kisiListe = new ArrayList();

        Kisi kisi1 = new Kisi(1, "Aziz", "Sancar", 15000);
        Kisi kisi2 = new Kisi(2, "Cahit", "Arf", 123.45);
        Kisi kisi3 = new Kisi(3, "Uğur", "Şahin", 25000);

        kisiListe.add(kisi1);
        kisiListe.add(kisi2);
        kisiListe.add(kisi3);

        return kisiListe;

    }

    @DeleteMapping("/kisi")
    public String kisiSil()
    {
        return "kişi silinecek.";
    }

}
