package br.com.alura.datastructure.ed;

public class LinkedArrayTest {
    public static void main(String[] args) {
        LinkedArray list = new LinkedArray();

        System.out.println(list);
        list.addToStart("Lucas");
        System.out.println(list);
        list.addToStart("Pedro");
        System.out.println(list);
        list.addToStart("Guilherme");
        System.out.println(list);
    }
}
