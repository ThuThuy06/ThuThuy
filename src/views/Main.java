package views;

import conf.Database;
import models.DuAn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database.connect(
                "Localhost",
                3306,
                "root",
                "",
                "NhanVien"
        );
        String sql = "SELECT * FROM `DuAn`";
        PreparedStatement stmt = Database.getConnection().prepareStatement("SELECT * FROM `DuAn`");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            DuAn duAn = new DuAn();
            duAn.setId_DA(String.valueOf(rs.getInt("id")));
            duAn.setName_DA(rs.getString("tenDuAn"));
            duAn.setDescription_DA(rs.getString("moTa"));
            duAn.setStartDate(rs.getDate("ngayBatDau"));
            duAn.setEndDate(rs.getDate("ngayKetThuc"));

            System.out.println(duAn);
        }
        Database.close();
    }
}