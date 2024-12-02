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
    protected void pBase() {
        agenzia.addPacchettoBase();
    }
}