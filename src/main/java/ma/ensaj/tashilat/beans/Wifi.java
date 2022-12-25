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

    private String month;

    @Column(unique = true)
    private String reference;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    public Wifi(Operator operator, User user, String month, Client client) {
        super(200.0, client.getEmail(), operator, user);
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
