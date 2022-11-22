package be.intecbrussel;

import java.util.Arrays;

public class MyCollection {
    private String[] array;

    public MyCollection(String[] array) {
        this.array = array;
    }


    // <String> arrayList=new ArrayList<>();
    // array.add(value);

    public void add(String value) {

        int n = array.length;


        array = Arrays.copyOf(array, n + 1);

        array[n] = value;
        //System.out.println(Arrays.toString(array));
    }

    public void remove(int index) {
        String[] tmpArr = new String[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                tmpArr[count] = array[i];
                count++;
            }
        }
        array = tmpArr;
    }

    public int size() {
        return array.length;
    }

    public String getindex(int index) {


        return array[index];
    }

}







