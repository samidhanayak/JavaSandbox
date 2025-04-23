package apr22;

import java.util.Objects;

public final class Student {
    private int id;
    private String firsname;
    private String lastname;

    public Student(int id, String firsname, String lastname) {
        this.id = id;
        this.firsname = firsname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firsname='" + firsname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firsname, student.firsname) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firsname, lastname);
    }
}
