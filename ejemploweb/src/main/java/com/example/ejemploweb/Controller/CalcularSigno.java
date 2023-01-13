package com.example.ejemploweb.Controller;

import com.example.ejemploweb.ExceptionFecha;

import java.util.EmptyStackException;

public class CalcularSigno {
    String signo;

    public CalcularSigno() {
    }

    public void calcularSigno (int numdia, int nummes) throws ExceptionFecha {

        if((numdia > 31 || nummes > 12) ){
            signo="Fecha invalida";
            throw new ExceptionFecha();
        }
        else if((numdia >= 21 && nummes == 3) || (numdia <= 19 && nummes == 4)){
            signo="Aries";
        }
        else if((numdia >= 20 && nummes == 4) || (numdia <= 20 && nummes == 5)) {
            signo = "Tauro";
        }
        else if((numdia >= 21 && nummes == 5) || (numdia <= 20 && nummes == 6)){
            signo="Geminis";
        }
        else if((numdia >= 21 && nummes == 6) || (numdia <= 22 && nummes == 7)){
            signo="Cancer";
        }
        else if((numdia >= 23 && nummes == 7) || (numdia <= 22 && nummes == 8)){
            signo="Leo";
        }
        else if((numdia >= 23 && nummes == 8) || (numdia <= 22 && nummes == 9)){
            signo="Virgo";
        }
        else if((numdia >= 23 && nummes == 9) || (numdia <= 22 && nummes == 10)){
            signo="Libra";
        }
        else if((numdia >= 23 && nummes == 10) || (numdia <= 21 && nummes == 11)){
            signo="Escorpion";
        }
        else if((numdia >= 22 && nummes == 11) || (numdia <= 21 && nummes == 12)){
            signo="Sagitario";
        }
        else  if((numdia >= 22 && nummes == 12) || (numdia <= 20 && nummes == 1)){
            signo="Capricornio";
        }
        else if((numdia >= 21 && nummes == 1) || (numdia <= 19 && nummes == 2)){
            signo="Acuario";
        }
        else if((numdia >= 20 && nummes == 2) || (numdia <= 20 && nummes == 3)){
            signo="Piscis";
        }
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}
