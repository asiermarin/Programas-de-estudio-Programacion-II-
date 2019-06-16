package comun;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface itfPersistable {
    void loadResulstSet(ResultSet rs) throws Exception;
}
