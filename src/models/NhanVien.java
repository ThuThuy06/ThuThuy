package models;

public class NhanVien {
    private String name;
    private long id;
    private int age;
    private String position;
    private String department;
    private long Id_DA;

    public NhanVien() {
    }

    public NhanVien(String name, long id, int age, String position, String department, long id_DA) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.position = position;
        this.department = department;
        Id_DA = id_DA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getId_DA() {
        return Id_DA;
    }

    public void setId_DA(long id_DA) {
        Id_DA = id_DA;
    }
}