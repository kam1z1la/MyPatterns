package com.myprojects.patterns.generative.factory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.myprojects.patterns.generative.factory.Events.*;

@Controller
@RequestMapping("/bouquets")
public class BouquetController {

    @GetMapping
    public String bouquetsPage() {
        return "bouquet-page";
    }

    @GetMapping("/wedding")
    public String weddingPage() {
        WeddingBouquet wedding = (WeddingBouquet) new BouquetFactory().createBouquet(WEDDING);
        return "redirect:" + wedding.getBouquets();
    }

    @GetMapping("/birthday")
    public String birthdayPage() {
        BirthdayBouquet birthday = (BirthdayBouquet) new BouquetFactory().createBouquet(BIRTHDAY);
        return "redirect:" + birthday.getBouquets();
    }

    @GetMapping("/jubilee")
    public String jubileePage() {
        JubileeBouquet jubilee = (JubileeBouquet) new BouquetFactory().createBouquet(JUBILEE);
        return "redirect:" + jubilee.getBouquets();
    }

    @GetMapping("/graduation")
    public String graduationPage() {
        GraduationBouquet graduation = (GraduationBouquet) new BouquetFactory().createBouquet(GRADUATION);
        return "redirect:" + graduation.getBouquets();
    }
}
