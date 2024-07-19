package entity;

import javax.persistence.*;

@Entity(name = "jet")
@Table(name = "jet")
public class Jet {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name ;
    public String getName() {
        return name;
    }

    public Jet setName(String name) {
        this.name = name;
        return this;
    }


}
