package ma.ensaj.tashilat.beans;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId", nullable = false)
    private Integer client_id;

    private String fname;
    private String lname;
    @Column(unique = true)
    private String cin;
    @Column(unique = true)
    private String email;
    private Date birthdate;
    @Column(unique = true)
    private String number;
    @Column(unique = true)
    private String code;

    public Client(String fname, String lname, String cin, String email, Date birthdate, String number, String code) {
        this.fname = fname;
        this.lname = lname;
        this.cin = cin;
        this.email = email;
        this.birthdate = birthdate;
        this.number = number;
        this.code = cin+""+2022;
    }

    public Client() {
    }

    public Integer getId() {
        return client_id;
    }

    public void setId(Integer id) {
        this.client_id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
