package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "person")//? JPQL
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personId;
    @Column(columnDefinition = "VARCHAR2(20)",name = "first_name")
    //@Transient
    private String name;
    @Column(columnDefinition = "VARCHAR2(20)", name = "last_name")
    private String family;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public Person setPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public long getPersonId() {
        return personId;
    }
}
