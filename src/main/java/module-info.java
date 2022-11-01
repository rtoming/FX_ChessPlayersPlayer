module com.example.fx_chessplayers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_chessplayers to javafx.fxml;
    exports com.example.fx_chessplayers;
}