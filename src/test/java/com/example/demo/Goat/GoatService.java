package com.example.demo.Goat;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GoatService {

    public static List<Goat> getGoats() {
        return List.of(
                new Goat()
        );
    }
}