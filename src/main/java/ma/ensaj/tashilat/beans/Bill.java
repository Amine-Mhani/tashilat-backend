package ma.ensaj.tashilat.beans;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.util.Date;


@MappedSuperclass
public class Bill {
    @Column(unique = true)
    private String reference;
    private Double price;
    private Date date;
    private String number;

    private String email;

    @ManyToOne
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Bill(Double price, Long number, String email,Operator operator, User user) {
        this.reference = "#"+number+""+operator.getOperatorId()+""+price;
        this.price = price;
        this.date = new Date();
        this.email = email;
        this.number = "+212"+number;
        this.operator = operator;
        this.user = user;
    }

    public Bill() {

    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
