package pl.polska.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Dictionary {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String className;

    private boolean editable;

    public Dictionary(String name, String className, boolean editable) {
        this.name = name;
        this.className = className;
        this.editable = editable;
    }

    public Dictionary() {
    }
}
