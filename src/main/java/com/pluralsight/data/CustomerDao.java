package com.pluralsight.data;

import javax.sql.DataSource;

public class CustomerDao {
    private DataSource dataSource;
    public CustomerDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
