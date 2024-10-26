package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IService<X> {
    ArrayList<X> findAll() throws SQLException;
    void them(X x);
    X timKiem(String id);
    void xoa(String id);
    List<X> layDanhSach();
}
