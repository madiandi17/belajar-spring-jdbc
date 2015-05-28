package com.wordpress.bmadi.belajar.spring.jdbc.domain;

import com.wordpress.bmadi.belajar.spring.jdbc.model.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void simpan(Person p) {
        try {
            Connection conn = dataSource.getConnection();
            String sql = "INSERT INTO person (nama, tanggal_lahir) VALUES (?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(sql);
            psInsert.setString(1, p.getNama());
            psInsert.setDate(2, new java.sql.Date(p.getTanggaLahir().getTime()));
            psInsert.executeUpdate();

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
