module es.ideas.sliders {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ideas.sliders to javafx.fxml;
    exports es.ideas.sliders;
    exports es.ideas.sliders.controller;
    opens es.ideas.sliders.controller to javafx.fxml;
    exports es.ideas.sliders.modelo;
    opens es.ideas.sliders.modelo to javafx.fxml;
}