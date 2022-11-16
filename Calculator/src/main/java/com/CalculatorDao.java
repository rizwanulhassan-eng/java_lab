package com;

import java.sql.SQLException;
import java.util.List;

public interface CalculatorDao {


    boolean saveIt(Calculator calculator) throws SQLException;
}
