import java.util.ArrayList;
import java.util.HashSet;

public class Day12 {
    public static void main(String[] args) {
        ClearArray arr = new ClearArray();
        arr.addEl("Java");
        arr.addEl("Java");
        arr.addEl("C++");
        arr.addEl("Python");
        arr.addEl("Python");
        arr.addEl("C#");

        System.out.println(arr.clear());
    }
}

class ClearArray {
    ArrayList<String> arr;
    public ClearArray() {
        this.arr = new ArrayList<String>();
    }

    void addEl(String el) {
        this.arr.add(el);
    }

    HashSet<String> clear() {
        HashSet<String> newArr = new HashSet<String>();

        for (String i: this.arr) {
            newArr.add(i);
        }
        return newArr;
    }
}
