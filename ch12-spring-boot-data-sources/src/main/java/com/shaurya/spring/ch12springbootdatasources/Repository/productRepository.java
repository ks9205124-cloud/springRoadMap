package com.shaurya.spring.ch12springbootdatasources.Repository;

import com.shaurya.spring.ch12springbootdatasources.Model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class productRepository {
    private final JdbcTemplate jdbc;
    @Autowired
    public productRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(product p) {
        String sql = "INSERT INTO purchase (name, price) VALUES (?, ?)";
        jdbc.update(sql, p.getName(), p.getPrice());
    }

    public List<product> findAll() {
        String sql = "SELECT * FROM purchase";
        return jdbc.query(sql, (rs, rowNum) -> {
            product s = new product();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setPrice(rs.getInt("price"));
            return s;
        });
    }
}
