package com.example.agenziagui;

import javafx.fxml.FXML;
import agenzia.*;
import javafx.scene.control.*;

public class HelloController {
    private Agenzia agenzia = new Agenzia();
    @FXML
    private TextArea output;
    @FXML
    private TextField destinazione;
    @FXML
    private TextField durata;
    @FXML
    private TextField costoB;
    @FXML
    private CheckBox ritorno;
    @FXML
    private CheckBox pensione;
    @FXML
    private TextField nEscursioni;

    @FXML
    protected void pVolo() {
        agenzia.addPacchettoVolo(new PacchettoVolo(destinazione.getText(),Integer.parseInt(durata.getText()),Double.parseDouble(costoB.getText()),ritorno.isSelected()));
    }
    @FXML
    protected void pPasti() {
        agenzia.addPacchettoPasti(new PacchettoPasti(destinazione.getText(),Integer.parseInt(durata.getText()),Double.parseDouble(costoB.getText()),pensione.isSelected()));
    }
    @FXML
    protected void pEscursione() {
        agenzia.addPacchettoEscursione(new PacchettoEscursioni(destinazione.getText(),Integer.parseInt(durata.getText()),Double.parseDouble(costoB.getText()),pensione.isSelected(),Integer.parseInt(nEscursioni.getText())));
    }
    @FXML
    protected void visualizza() {
        output.setText(agenzia.toString());
    }
    @FXML
    protected void minMax() {
        output.setText(agenzia.visualizzaMaxMin());
    }
    @FXML
    protected void costoMedio() {
        output.setText(Double.toString(agenzia.costoMedio()));
    }
}