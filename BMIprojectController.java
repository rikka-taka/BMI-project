package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.MBI;

public class BMIprojectController implements Initializable {

    @FXML
    private TextField beratBadan;
    @FXML
    private TextField tinggiBadan;
    @FXML
    private Label perhitunganMBI;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        perhitunganMBI.setText("-");
    }

    @FXML
    private void hitungMBI(ActionEvent event) {
        try {
            double berat = parseAngka(beratBadan.getText());
            double tinggi = parseAngka(tinggiBadan.getText());

            MBI mbi = new MBI(berat, tinggi);

            perhitunganMBI.setText(String.format("%.1f - %s", mbi.hasil(), mbi.kategori()));
        } catch (NumberFormatException e) {
            perhitunganMBI.setText("Masukkan angka yang valid");
        } catch (IllegalArgumentException e) {
            perhitunganMBI.setText(e.getMessage());
        }
    }

    /** Menerima format 30.5 maupun 30,5. */
    private double parseAngka(String teks) {
        if (teks == null || teks.trim().isEmpty()) {
            throw new NumberFormatException("kosong");
        }
        return Double.parseDouble(teks.trim().replace(',', '.'));
    }
}