package com.example.gtics_lab6_20196483.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MesasController {
    @GetMapping("/listmesas")
    public String loginWindow(){
        return "/mesas/listMesas";
    }
}
