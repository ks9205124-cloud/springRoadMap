package com.shaurya.spring.ch08springbootwebapps.Service;

import com.shaurya.spring.ch08springbootwebapps.Model.Garage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GarageService {
    ArrayList<Garage> garages = new ArrayList<>();
    public void addGarage(Garage garage)
    {
        garages.add(garage);
    }
    public ArrayList<Garage> getGarages() {
        return garages;
    }
}
