package com.EGbooks.EG_Book.Controller;

import com.EGbooks.EG_Book.Service.OxucuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/EGbook")
public class OxucuController {
    private final OxucuService oxucuService;

    @Autowired
    public OxucuController(OxucuService oxucuService) {
        this.oxucuService = oxucuService;
    }

    @GetMapping("/{id}")
    public String getOxucuById(@RequestParam Integer id) {
        String oxucu = oxucuService.getOxucuById(id);
        return oxucu != null ? oxucu : "Bele bir oxucu tapılmadı.";
    }
}
