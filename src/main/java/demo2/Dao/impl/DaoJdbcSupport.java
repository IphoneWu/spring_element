package demo2.Dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by win8 on 2017/2/26.
 */
public class DaoJdbcSupport {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
