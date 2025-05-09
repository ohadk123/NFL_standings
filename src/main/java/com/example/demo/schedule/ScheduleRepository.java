package com.example.demo.schedule;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduleRepository {
    private final JdbcTemplate jdbc;

    public ScheduleRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<ScheduleRecord> getAllFromView() {
        return jdbc.query("SELECT * FROM schedule", (rs, rowNum) ->
                new ScheduleRecord(
                        rs.getString("name_home"),
                        rs.getString("record_home"),
                        rs.getString("name_away"),
                        rs.getString("record_away"),
                        rs.getInt("week"),
                        rs.getString("day")
                )
        );
    }
}
