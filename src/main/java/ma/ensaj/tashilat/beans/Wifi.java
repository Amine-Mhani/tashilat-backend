package ma.ensaj.tashilat.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "wifi")
public class Wifi extends Bill{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String code;

    private String state;

    @Column(unique = true)
    private String month;

    @Column(unique = true)
    private String reference;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    public Wifi(String email, Operator operator, User user, String month, Client client) {
        super(200.0, email, operator, user);
        this.month = month;
        this.reference = "#"+client.getCode()+""+month+""+operator.getOperatorId();
        this.client = client;
        this.code = client.getCode();
        this.state = "Not payed";
    }

    public Wifi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
