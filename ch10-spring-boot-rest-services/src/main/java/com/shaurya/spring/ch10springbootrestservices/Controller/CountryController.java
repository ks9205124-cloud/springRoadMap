package com.shaurya.spring.ch10springbootrestservices.Controller;

import com.shaurya.spring.ch10springbootrestservices.Model.CountryModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class CountryController {
    @GetMapping("/country")
    private List<CountryModel> countries(){
        CountryModel france = CountryModel.of("France","36000");
        CountryModel spain = CountryModel.of("spain","72000");
        return List.of(france,spain);
    }

    @GetMapping("/myCountry")
    private ResponseEntity<CountryModel> myCountry(){
        CountryModel India = CountryModel.of("India","36000");
        return ResponseEntity
        .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(India);
    }
}
