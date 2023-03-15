package com.example.registertjener;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegisterBiletterController {
    private final List<RegisterBiletter> bilettene = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(RegisterBiletter b){

        bilettene.add(b);
    }

    @GetMapping("/vis")
    public List<RegisterBiletter> vis(){
        return bilettene;
    }

    @GetMapping("/slett")
    public void slett(){
        bilettene.clear();
    }
}
