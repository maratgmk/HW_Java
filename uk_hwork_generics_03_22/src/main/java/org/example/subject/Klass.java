package org.example.subject;

import java.util.Arrays;
import java.util.List;

public class Klass<S>{

    public List<Student<S>> students;

    public Klass(List<Student<S>> students) {
        this.students = students;
    }

    public List<Student<S>> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Klass{" +
                "students=" + students +
                '}';
    }
}
