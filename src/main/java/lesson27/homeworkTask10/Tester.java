package lesson27.homeworkTask10;

import java.util.Objects;

public class Tester {
    private String name;
    private Integer id;

    public Tester(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tester)) return false;
        Tester tester = (Tester) o;
        return Objects.equals(getName(), tester.getName()) && Objects.equals(getId(), tester.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
