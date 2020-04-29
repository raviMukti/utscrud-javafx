package entity;

import lombok.Builder;
import lombok.Data;

@Data
public class BarangModel {
    // Properti untuk model Barang
    private Integer id;
    private String namaBarang;
    private String satuan;
    private Integer jumlahJual;
    private Integer hargaBarang;
    private String tanggalJual;
    private Integer totalHarga;
}
