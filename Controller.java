package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class Controller {



    @FXML
    TextField in;

    @FXML
    Label wynikW;

    @FXML
    RadioButton inC;

    @FXML
    RadioButton inF;

    @FXML
    RadioButton inK;

    @FXML
    RadioButton outC;

    @FXML
    RadioButton outF;

    @FXML
    RadioButton outK;




    Obliczenia obliczenia = new Obliczenia();

    public void inputC(ActionEvent actionEvent) {
        przelicz();
    }

    public void inputF(ActionEvent actionEvent) {
        przelicz();
    }

    public void inputK(ActionEvent actionEvent) {
        przelicz();
    }

    public void outputC(ActionEvent actionEvent) {
        przelicz();
    }

    public void outputF(ActionEvent actionEvent) {
        przelicz();
    }

    public void outputK(ActionEvent actionEvent) {
        przelicz();
    }
    public void oblicz(ActionEvent actionEvent) {
        przelicz();
    }
    private void przelicz() {

        try {
            obliczenia.setTemp(Double.parseDouble(in.getText().replace(',','.')));


            if (inC.isSelected() && outF.isSelected()) {
                obliczenia.przeliczCnaF(obliczenia.getTemp());
            }
            if (inC.isSelected() && outK.isSelected()) {
                obliczenia.przeliczCnaK(obliczenia.getTemp());
            }
            if (inF.isSelected() && outC.isSelected()) {
                obliczenia.przeliczFnaC(obliczenia.getTemp());
            }
            if (inF.isSelected() && outK.isSelected()) {
                obliczenia.przeliczFnaK(obliczenia.getTemp());
            }
            if (inK.isSelected() && outC.isSelected()) {
                obliczenia.przeliczKnaC(obliczenia.getTemp());
            }

            if (inK.isSelected() && outF.isSelected()) {
                obliczenia.przeliczKnaC(obliczenia.getTemp());

            }
            wynikW.setText(String.format("%.2f",obliczenia.getTemp()));
        }
        catch (Exception e){

            wynikW.setText("Wpisz liczbę!");


        }

    }






    }




