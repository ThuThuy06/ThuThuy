package controllers;

import interfaces.IController;
import models.NhanVien;
import service.NhanVientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NhanVienControllers implements IController<NhanVien> {
    private final ArrayList<NhanVien> nhanViens;
    private NhanVientService nhanVienService;

    public NhanVienControllers() {
        this.nhanViens = new ArrayList<>();
        this.nhanVienService = new NhanVientService();
    }

    @Override
    public void them(NhanVien nhanVien) {
        nhanVienService.them(nhanVien);
        nhanViens.add(nhanVien);
    }

    @Override
    public void xoa(String id) {
        nhanVienService.xoa(id);
        nhanViens.removeIf(nv -> Objects.equals(nv.getId(), id));
    }

    @Override
    public NhanVien timKiem(String id) {
        return nhanVienService.timKiem(id);
    }

    @Override
    public List<NhanVien> layDanhSach() {
        return nhanVienService.layDanhSach();
    }
}