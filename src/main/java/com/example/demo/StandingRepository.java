package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StandingRepository {
    private final JdbcTemplate jdbc;

    public StandingRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<StandingClass> getAllFromView() {
        return jdbc.query("SELECT * FROM standings", (rs, rowNum) ->
                new StandingClass(
                        rs.getString("division"),
                        rs.getString("Team"),
                        rs.getInt("W"),
                        rs.getInt("L"),
                        rs.getInt("T"),
                        rs.getFloat("Pct"),
                        rs.getInt("PF"),
                        rs.getInt("PA"),
                        rs.getInt("Net Pts"),
                        rs.getString("Div"),
                        rs.getFloat("Div Pct"),
                        rs.getString("Strk"),
                        rs.getString("Last 2")
                )
        );
    }
}
