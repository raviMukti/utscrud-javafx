package service;

import entity.BarangModel;

import java.util.ArrayList;
import java.util.List;

public class BarangService {
    // Inisialisasi List Array Barang
    List<BarangModel> listBarang = new ArrayList<BarangModel>();

    // Method untuk menambahkan Array Barang
    public void addBarang(BarangModel barangModel){
        listBarang.add(barangModel);
    }

    // Update barang
    public int updateBarang(int id, BarangModel barangModel){
        listBarang.set(id, barangModel);
        return  barangModel.getId();
    }

    // Delete barang
    public boolean hapusBarang(int id){
        BarangModel barangModel = null;
        id = barangModel.getId();
        listBarang.remove(id);
        return true;
    }

}
