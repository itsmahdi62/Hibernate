package entity;

import javax.persistence.*;

@Entity(name = "car")
@Table(name = "car")
public class Car {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition = "VARCHAR2(20)")
    private String model;

    public long getId() {
        return id;
    }


    public String getModel() {
        return model;
    }

    public Car setId(long id) {
        this.id = id;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }
}
