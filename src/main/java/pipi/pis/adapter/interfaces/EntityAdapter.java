package pipi.pis.adapter.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface EntityAdapter<T> {

    T adapt(ResultSet resultSet) throws SQLException;
}