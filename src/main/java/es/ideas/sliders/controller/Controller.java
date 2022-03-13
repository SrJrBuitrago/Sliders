package es.ideas.sliders.controller;

import es.ideas.sliders.modelo.Colorr;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private ObservableList<Colorr> listaColores;
    @FXML
    private Button bAnadir;

    @FXML
    private Button bEliminar;

    @FXML
    private Label labelAzul;

    @FXML
    private Label labelRojo;

    @FXML
    private Label labelVerde;

    @FXML
    private ListView<Colorr> listView;

    @FXML
    private Ellipse objeto;

    @FXML
    private Slider sliderAul;

    @FXML
    private Slider sliderRojo;

    @FXML
    private Slider sliderVerde;

    @FXML
    private Text tfBlue;

    @FXML
    private Text tfGreen;

    @FXML
    private Text tfRed;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    listaColores = FXCollections.observableArrayList();
    listView.setItems(listaColores);

    bEliminar.disableProperty().bind(
            listView.getSelectionModel().selectedItemProperty()
                    .isNull()
    );
    listView.getSelectionModel().selectedItemProperty().addListener(
            (obs,oldValue,newValue) ->{
             if (newValue!=null){
                 sliderRojo.setValue(newValue.getRed());
                 sliderVerde.setValue(newValue.getGreen());
                 sliderAul.setValue(newValue.getBlue());
             }
            });
            
        sliderVerde.valueProperty().addListener((obs, oldValue, newValue) -> {

            objeto.setFill(
                    Color.rgb((int) sliderRojo.getValue(), newValue.intValue()
                            , (int) sliderAul.getValue())
            );
            int verde = newValue.intValue();
            tfGreen.setText(""+verde);
        });
        sliderRojo.valueProperty().addListener((obs, oldValue, newValue) -> {

            objeto.setFill(
                    Color.rgb(newValue.intValue(),(int) sliderVerde.getValue(),
                            (int) sliderAul.getValue())
            );
            int rojo = newValue.intValue();

            tfRed.setText("" + rojo);
        });
        sliderAul.valueProperty().addListener((obs, oldValue, newValue) -> {
            objeto.setFill(
                    Color.rgb((int) sliderRojo.getValue(),(int)
                            sliderVerde.getValue(), newValue.intValue())
            );
            int azul = newValue.intValue();
            tfBlue.setText("" + azul);
        });
    }
    @FXML
    private void agregar(ActionEvent event){
        Colorr color = new Colorr((int)sliderRojo.getValue(),
                (int) sliderVerde.getValue(), (int) sliderAul.getValue());
        listaColores.add(color);
    }
    @FXML
    private void eliminar(ActionEvent event){
        listaColores.remove(listView.getSelectionModel().getSelectedItem());
        listView.getSelectionModel().clearSelection();
    }

}

