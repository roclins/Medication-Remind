package com.example.medicationremind;

////import org.litepal.crud.DataSupport;
//
//import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

import java.sql.Date;

public class Medicine extends LitePalSupport {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private int id;

    private String name;

    private Date endtime;

    private String remarks;


}
