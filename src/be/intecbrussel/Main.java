package be.intecbrussel;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//        String [] zak = {"z","a"};
//        MyCollection myCollection = new MyCollection(zak);
//        System.out.println(myCollection.size());
//        myCollection.add("k");
//        System.out.println(myCollection.size());
//        //myCollection.remove(1);
//        System.out.println(myCollection.size());
//        for (int i=0; i< myCollection.size();i++){
//            System.out.println(myCollection.getindex(i));
        ArrayList<String> list = new ArrayList<>(){
            {
                add("first");
                add("second");
            }
        };
        list.get(0);
        System.out.println(list.get(0));

        System.out.println(list.size());
        //list.remove(0);
        //System.out.println(list.size());
        list.add("3de");
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
//        Collections.sort(list);
//        System.out.println(list);
        list.set(0,"eerste");
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------");
        //list.clear();
        System.out.println(list.size());

        list.forEach(n-> System.out.println(n));
        //of
        for (String n : list){
            System.out.println(n);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println("-----------------------");
        HashSet<String> words = new HashSet<String>();
        System.out.println( words.add("Test"));
        System.out.println( words.add("Test"));; //duplicate

        words.add("test");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(words.size());

        System.out.println(words.contains("test"));
        System.out.println(words.contains("testtttt"));

        Queue<Integer> numbers =new PriorityQueue<Integer>();
        numbers.add(4);
        numbers.add(2);

        System.out.println("queue: "+ numbers);

        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(9);
        numbers.offer(3);
        numbers.offer(8);
        System.out.println("Queue update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);

        numbers.poll(); // verwerk item
        System.out.println("Queue after poll update: "+ numbers);


        System.out.println(numbers.add(5));
        System.out.println(numbers.add(7));
        System.out.println(numbers.add(1));
        System.out.println(numbers.add(53));
        // * 10000000000000000
        System.out.println("exception");

        System.out.println("--------------------------------");
        System.out.println(numbers.offer(5));
        System.out.println(numbers.offer(7));
        System.out.println(numbers.offer(1));
        System.out.println(numbers.offer(53));
        // * 10000000000000000
        System.out.println("false");

        System.out.println("----------");

        HashMap<Integer,String> zipCodes = new HashMap<>();
        zipCodes.put(1000,"Brussels");
        zipCodes.put(9000,"Ghent");
        zipCodes.put(2000,"Antwerp");

        System.out.println(zipCodes.size());
        System.out.println(zipCodes.get(9000));


        System.out.println(zipCodes.containsKey(1000));
        System.out.println(zipCodes.containsValue("Antwerp"));
        System.out.println(zipCodes.containsValue("antwerp"));


        zipCodes.remove(1000);
        zipCodes.remove(9000,"ghent");

        System.out.println(zipCodes.size());

            }
        }




