package br.com.alura.datastructure.ed;

import br.com.alura.datastructure.models.Student;

public class VectorTest {
    public static void main(String[] args) {
        Student a1 = new Student("Alura");
        Student a2 = new Student("Lucas");

        Vector list = new Vector();

        System.out.println(list.size());
        list.add(a1);
        System.out.println(list.size());
        list.add(a2);
        System.out.println(list.size());

        System.out.println(list.size());

        for(int i = 0; i < 300; i++) {
            Student y = new Student("Joao" + i);
            list.add(y);
        }
        System.out.println(list);
    }
}
