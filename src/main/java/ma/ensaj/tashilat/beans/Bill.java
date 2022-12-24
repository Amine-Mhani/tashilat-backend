package ma.ensaj.tashilat.beans;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.util.Date;


@MappedSuperclass
public class Bill {


    private Double price;
    private Date date;

    private String email;

    @ManyToOne
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Bill(Double price, String email,Operator operator, User user) {
        this.price = price;
        this.date = new Date();
        this.email = email;
        this.operator = operator;
        this.user = user;
    }

    public Bill() {

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
