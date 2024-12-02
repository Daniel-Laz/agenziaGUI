package agenzia;

import java.util.Scanner;

public class Agenzia {
    private Pacchetto[] pacchetti;
    private int cont = 0;

    public Agenzia(){
        pacchetti = new Pacchetto[100];
    }
    public Agenzia(int n){
        pacchetti = new Pacchetto[n];
    }

    public void addPacchettoBase(Pacchetto p){
        pacchetti[cont] = p;
        cont++;
    }
    public void addPacchettoVolo(PacchettoVolo p){
        pacchetti[cont] = p;
        cont++;
    }
    public void addPacchettoPasti(PacchettoPasti p){
        pacchetti[cont] = p;
        cont++;
    }
    public void addPacchettoEscursione(PacchettoEscursioni p){
        pacchetti[cont] = p;
        cont++;
    }

    public String visualizzaMaxMin(){
        int min = 0;
        int max = 0;
        for(int i = 0; i<cont; i++){
            if (pacchetti[i].calcolaCosto()>pacchetti[max].calcolaCosto()){
                max = i;
            }else if (pacchetti[i].calcolaCosto()<pacchetti[min].calcolaCosto()){
                min = i;
            }
        }
        return "min: "+pacchetti[min].toString()+"\n"+"min: "+pacchetti[max].toString();
    }

    public double costoMedio(){
        int costoMedio=0;
        for (int i = 0; i< cont ; i++){
            costoMedio+=pacchetti[i].calcolaCosto();
        }
        costoMedio= costoMedio/cont;
        return costoMedio;
    }
}