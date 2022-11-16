package com;

import com.Calculator;
import com.CalculatorDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Repository
public class CalculatorDaoImpl implements CalculatorDao {

    public CalculatorDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    private static final String sqlinsert= "insert into calculators(input1,input2,result) values(?,?,?)";


    public boolean saveIt(Calculator calculator) throws SQLException{

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sqlinsert);
       Object [] params = {calculator.getInput1(),calculator.getInput2(),calculator.getResult()};



        preparedStatement.setInt(1, calculator.getInput1());
        preparedStatement.setInt(2,calculator.getInput2());
        preparedStatement.setInt(3,calculator.getResult());
        return preparedStatement.execute();

    }
}
