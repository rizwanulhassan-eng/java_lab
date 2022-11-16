package com;

import com.Calculator;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculatorRowMapper implements RowMapper<Calculator> {

    public Calculator mapRow(ResultSet rs, int rowNum) throws SQLException {
        Calculator employee =new Calculator();
        employee.setId(rs.getInt("id"));
        employee.setInput1(rs.getInt("input1"));
        employee.setInput2(rs.getInt("input2"));
        employee.setResult(rs.getInt("result"));
        return employee;
    }
}
