package com.example.petshop2;

import java.util.Date;

public class Happy extends Mood{

    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }

    @Override
    public String getMood() {
        return "happy";
    }

}
