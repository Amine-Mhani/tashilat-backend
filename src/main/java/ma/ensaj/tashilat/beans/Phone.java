package ma.ensaj.tashilat.beans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "phone_bill")
public class Phone extends Bill{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id", nullable = false)
    private Integer phone_id;

    private String amount;

    private String reference;

    private String number;

    public Phone() {
        super();
    }

    public Integer getPhoneId() {
        return phone_id;
    }

    public void setPhoneId(Integer id) {
        this.phone_id = id;
    }

    public Phone(Double price, Long number, String email, Operator operator, User user, String amount) {
        super(price, email, operator, user);
        this.number = "+212-"+number;
        this.reference = "#"+number+""+operator.getOperatorId()+""+price;
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
