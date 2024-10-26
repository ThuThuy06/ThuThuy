package interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IController<X> {
    void them(X x);
    void xoa(String id);
    X timKiem(String id);
    List<X> layDanhSach();
}
