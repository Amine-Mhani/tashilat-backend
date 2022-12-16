package ma.ensaj.tashilat.beans;

import jakarta.persistence.*;

@Entity
@Table
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id", nullable = false)
    private Integer operator_id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String image;

    public Operator(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Operator() {
    }

    public Integer getOperatorId() {
        return operator_id;
    }

    public void setOperatorId(Integer id) {
        this.operator_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
