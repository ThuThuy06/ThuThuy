package models;

import java.util.Date;

public class DuAn {
    private String Id_DA;
    private String Name_DA;
    private String Description_DA;
    private Date startDate;
    private Date endDate;
    public DuAn(){}
    public DuAn(String id_DA, String name_DA, String description_DA, Date startDate, Date endDate) {
        Id_DA = id_DA;
        Name_DA = name_DA;
        Description_DA = description_DA;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId_DA() {
        return Id_DA;
    }

    public void setId_DA(String id_DA) {
        Id_DA = id_DA;
    }

    public String getName_DA() {
        return Name_DA;
    }

    public void setName_DA(String name_DA) {
        Name_DA = name_DA;
    }

    public String getDescription_DA() {
        return Description_DA;
    }

    public void setDescription_DA(String description_DA) {
        Description_DA = description_DA;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
