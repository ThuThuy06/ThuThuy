package service;

import interfaces.IService;
import models.NhanVien;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NhanVientService implements IService<NhanVien> {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();
    @Override
    public ArrayList<NhanVien> findAll() throws SQLException {
        return null;
    }

    @Override
    public void them(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
    }

    @Override
    public NhanVien timKiem(String id) {
        for (NhanVien nv : danhSachNhanVien) {
            if (Objects.equals(nv.getId(), id)) {
                return nv;
            }
        }
        return null;
    }

    @Override
    public void xoa(String id) {
        danhSachNhanVien.removeIf(nv -> Objects.equals(nv.getId(), id));
    }

    @Override
    public List<NhanVien> layDanhSach() {
        return List.of();
    }
}
