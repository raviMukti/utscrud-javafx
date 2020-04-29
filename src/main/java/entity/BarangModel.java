package entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class BarangModel {
    // Properti untuk model Barang
    private Integer id;
    private String namaBarang;
    private String satuan;
    private Integer jumlahJual;
    private BigDecimal hargaBarang;
    private Date tanggalJual;
}
