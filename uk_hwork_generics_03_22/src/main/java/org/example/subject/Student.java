package org.example.subject;

public class Student <S>{

    private S discipline;
    private final int id;

    public Student(S discipline, int id) {
        this.discipline = discipline;
        this.id = id;
    }

    public S getDiscipline() {
        return discipline;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "discipline=" + discipline +
                ", id=" + id +
                '}';
    }
}
