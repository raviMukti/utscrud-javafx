package controller;

import entity.BarangModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import service.BarangService;

import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private ComboBox<String> comboSatuan;

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
    private TableView<BarangModel> tableBarang;

    @FXML
    private TableColumn<BarangModel, Integer> colIdBarang;

    @FXML
    private TableColumn<BarangModel, String> colNamaBarang;

    @FXML
    private TableColumn<BarangModel, String> colSatuanBarang;

    @FXML
    private TableColumn<BarangModel, Integer> colJumlahBarang;

    @FXML
    private TableColumn<BarangModel, BigDecimal> colHargaBarang;

    @FXML
    private TableColumn<BarangModel, String> colTanggalJual;

    @FXML
    private TableColumn<BarangModel, Integer> colTotalHarga;

    private BarangService barangService;

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
        // enable filed
        setEnableAllField();
    }

    @FXML
    void btnUbahAction(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resources) {
        //Mengisi nilai combobox
        ObservableList<String> satuanBarang = FXCollections.observableArrayList(
                "Unit",
                        "Pcs",
                        "Dus"
        );
        comboSatuan.setItems(satuanBarang);
        comboSatuan.setValue("Pcs");
        // Panggil set disable all field untuk kondisi awal sebelum button tambah di klik
        setDisableAllField();
        initKolom();
        setTableBarang();
    }

    // Set Disable semua Field sebelum button tambah di klik
    void setDisableAllField(){
        fieldIdBarang.setDisable(true);
        fieldNamaBarang.setDisable(true);
        comboSatuan.setDisable(true);
        fieldJumlahJual.setDisable(true);
        fieldHargaSatuan.setDisable(true);
        pickerTanggalJual.setDisable(true);
    }

    void setEnableAllField(){
        fieldIdBarang.setDisable(false);
        fieldNamaBarang.setDisable(false);
        comboSatuan.setDisable(false);
        fieldJumlahJual.setDisable(false);
        fieldHargaSatuan.setDisable(false);
        pickerTanggalJual.setDisable(false);
    }


    // Init kolom table
    void initKolom(){
        colIdBarang.setCellValueFactory(new PropertyValueFactory<BarangModel, Integer>("id"));
        colNamaBarang.setCellValueFactory(new PropertyValueFactory<BarangModel, String>("namaBarang"));
        colSatuanBarang.setCellValueFactory(new PropertyValueFactory<BarangModel, String>("satuan"));
        colJumlahBarang.setCellValueFactory(new PropertyValueFactory<BarangModel, Integer>("jumlahJual"));
        colTanggalJual.setCellValueFactory(new PropertyValueFactory<BarangModel, String>("tanggalJual"));
        colTotalHarga.setCellValueFactory(new PropertyValueFactory<BarangModel, Integer>("totalHarga"));
    }

    // Init data ke table
    void setTableBarang(){
        // inisialisasi data
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date tgl = new Date();
        ObservableList<BarangModel> lisBarangModel = FXCollections.observableArrayList();
        BarangModel barangModel = new BarangModel();
        barangModel.setId(1);
        barangModel.setNamaBarang("Masker");
        barangModel.setSatuan("Pcs");
        barangModel.setJumlahJual(10);
        barangModel.setHargaBarang(10000);
        barangModel.setTotalHarga(100000);
        barangModel.setTanggalJual(format.format(tgl));
        // set list barang
        lisBarangModel.add(barangModel);
        // set ke table
        tableBarang.setItems(lisBarangModel);
    }
}
