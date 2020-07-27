package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Array num = new Array(3);
        num.insert(10);
        num.insert(20);
        num.insert(30);
        num.insert(40);
        num.print();
        System.out.println("after removing");
        num.removeAt(1);
        System.out.println(num.indexOf(40));
        num.print();
    }
}