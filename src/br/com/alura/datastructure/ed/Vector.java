package br.com.alura.datastructure.ed;

import br.com.alura.datastructure.models.Student;

import java.util.Arrays;

public class Vector {
    private Student[] students = new Student[100];
    private int total = 0;

    public boolean validIndex(int index) {
        return index >= 0 && index < total;
    }

    public void resize() {
        if (total == students.length) {
            students = Arrays.copyOf(students, total * 2);
        }
    }

    public void add(Student student) {
        this.resize();
        this.students[total] = student;
        total++;
    }

    public void add(Student student, int index) {
        this.resize();
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (int i = total - 1; i >= index; i -= 1) {
            students[i+1] = students[i];
        }
        students[index] = student;
        total++;
    }

    public void remove(int index) {
        for (int i = index; i < this.total; i ++) {
            this.students[i] = this.students[i+1];
        }
        this.total--;
    }

    public Student get(int index) {
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return this.students[index];
    }

    public boolean hasStudent(Student student) {
        for (int i = 0; i < total; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return total;
    }

    public String toString() {
        return Arrays.toString(students);
    }
}
