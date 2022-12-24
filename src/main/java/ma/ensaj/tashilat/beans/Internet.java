package ma.ensaj.tashilat.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "internet_bill")
public class Internet extends Bill{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "internet_id", nullable = false)
    private Integer internet_id;

    private String forfait;

    private String reference;

    private String number;

    public Internet(Double price, Long number, String email, Operator operator, User user, String forfait) {
        super(price, email, operator, user);
        this.number = "+212-"+number;
        this.reference = "#"+number+""+operator.getOperatorId()+""+price;
        this.forfait = forfait;
    }

    public Internet() {

    }

    public Integer getInternet_id() {
        return internet_id;
    }

    public void setInternet_id(Integer internet_id) {
        this.internet_id = internet_id;
    }

    public String getForfait() {
        return forfait;
    }

    public void setForfait(String forfait) {
        this.forfait = forfait;
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
