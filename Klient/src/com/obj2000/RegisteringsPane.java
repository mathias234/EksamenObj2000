package com.obj2000;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class RegisteringsPane extends GridPane {
    Label navn, alder, interesser, tlf, bosted, kjønn;
    TextField txtNavn, txtAlder, txtTlf, txtBosted;
    RadioButton m, d;
    TextArea txtInteresser;
    Button registrer;
    Image image  = new Image(getClass().getResourceAsStream(
            "NettMatch3.png"));
    HBox kjonn = new HBox();

    public RegisteringsPane(){
        fyllPane();
    }

    protected void fyllPane(){
        ImageView lugo = new ImageView(image);

        //Labels
        navn = new Label("Navn: ");
        alder = new Label("Alder: ");
        interesser = new Label("Interesser: ");
        tlf = new Label("Tlf: ");
        bosted = new Label("Bosted: ");
        kjønn = new Label("Kjønn: ");
        //navn, alder, bosted, tlf,
        interesser.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");
        navn.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");
        alder.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");
        tlf.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");
        bosted.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");
        kjønn.setStyle("-fx-font-size: 12px;-fx-font-weight:bold;");

        //Text
        txtNavn = new TextField();
        txtAlder = new TextField();
        txtTlf = new TextField();
        txtBosted = new TextField();
        txtInteresser = new TextArea();

        //Buttons
        m = new RadioButton();
        d = new RadioButton();
        registrer = new Button(" Registrer ");

        //kjønn box
        kjonn.getChildren().addAll(m, d );

        setAlignment(Pos.CENTER);
        setHgap(10);//Lager litt mellomrom rundt tingene, så de ikke er
        setVgap(10);//klin på hverandre
        setPadding(new Insets(20,20,20,20));
        m.setText("Mann    ");
        d.setText("Dame");
        txtInteresser.setMaxWidth(300);
        txtInteresser.setMaxHeight(100);
        ToggleGroup tg = new ToggleGroup();
        m.setToggleGroup(tg);
        d.setToggleGroup(tg);

        add(lugo, 0,1, 2, 1);
        add(navn, 0, 2);
        add(txtNavn, 1, 2);
        add(alder, 0, 3);
        add(txtAlder, 1, 3);
        add(bosted ,0, 4);
        add(txtBosted, 1, 4);
        add(tlf, 0, 5);
        add(txtTlf, 1, 5);
        add(interesser, 0, 6);
        add(txtInteresser, 1, 6);
        add(kjønn,0, 7);
        add(kjonn, 1, 7);
        //add(d, 1, 8);
        add(registrer,0, 9, 2, 1);
        registrer.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

    }
}
