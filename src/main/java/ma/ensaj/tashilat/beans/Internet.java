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

    public Internet(Double price, Long number, String email, Operator operator, User user, String forfait) {
        super(price, number, email, operator, user);
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
}
