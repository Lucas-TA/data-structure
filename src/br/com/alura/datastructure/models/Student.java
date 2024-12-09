package br.com.alura.datastructure.models;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return student.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
