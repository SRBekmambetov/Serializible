import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -32764732647324732L;

    private int id;
    private String name;
    private int age;
    private byte type;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
