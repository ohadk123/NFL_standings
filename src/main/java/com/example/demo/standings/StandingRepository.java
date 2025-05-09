package com.example.demo.standings;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StandingRepository {
    private final JdbcTemplate jdbc;

    public StandingRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<StandingRecord> getAllFromView() {
        return jdbc.query("SELECT * FROM standings", (rs, rowNum) ->
                new StandingRecord(
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
