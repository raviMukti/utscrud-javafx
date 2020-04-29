package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Button btnTambah;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnUbah;

    @FXML
    private Button btnClear;

    @FXML
    private TextField fieldIdBarang;

    @FXML
    private TextField fieldNamaBarang;

    @FXML
    private ComboBox<?> comboSatuan;

    @FXML
    private TextField fieldJumlahJual;

    @FXML
    private TextField fieldHargaSatuan;

    @FXML
    private DatePicker pickerTanggalJual;

    @FXML
    private TextField fieldCariData;

    @FXML
    private Button btnCariData;

    @FXML
    private TableView<?> tableBarang;

    @FXML
    private TableColumn<?, ?> colIdBarang;

    @FXML
    private TableColumn<?, ?> colNamaBarang;

    @FXML
    private TableColumn<?, ?> colSatuanBarang;

    @FXML
    private TableColumn<?, ?> colJumlahBarang;

    @FXML
    private TableColumn<?, ?> colHargaBarang;

    @FXML
    private TableColumn<?, ?> colTanggalJual;

    @FXML
    private TableColumn<?, ?> colTotalHarga;

    @FXML
    void btnCariDataAction(ActionEvent event) {

    }

    @FXML
    void btnClearAction(ActionEvent event) {

    }

    @FXML
    void btnHapusAction(ActionEvent event) {

    }

    @FXML
    void btnTambahAction(ActionEvent event) {

    }

    @FXML
    void btnUbahAction(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}
