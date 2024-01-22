package com.holidayzer.api.controllers;
import java.util.ArrayList;
import java.util.List;

public class Hollyday {
    List<String[]> hollydays = new ArrayList<>();

    public Hollyday(){
        // Esse é o construtor da classe
    }
    
    public void test(){
        System.out.println(hollydays.size());
    }

    public String getAll(){
        String text = "";
        for (int i = 0; i < hollydays.size(); i++){
            String day = hollydays.get(i)[0] + " => " + hollydays.get(i)[1];
            text += day + "/n";
        }
        return text;
    }

    public void set(String day, String name){
        String[] hollyday = {day, name};
        hollydays.add(hollyday);
    }

    public String isHollyday(String day){
        for (int i = 0; i < hollydays.size(); i++){
            if (day.equals(hollydays.get(i)[0])){
                String text = "Dia " + hollydays.get(i)[0] + " é " + hollydays.get(i)[1] + "!";
                return text;
            }
        }
        String text = "Dia " + day + " não é feriado";
        return text;
    }
}
