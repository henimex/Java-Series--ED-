package hendev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args){



        //HashMapArrayList();
        //ClassArrayList();
        //TypeSafeArrayList();
    }

    private static void HashMapArrayList() {
        HashMap<String, String> anotherDictionaryExample = new HashMap<String,String>();
        anotherDictionaryExample.put("Apple","Elma");
        anotherDictionaryExample.put("Book","Kitap");
        anotherDictionaryExample.put("Car","Araba");
        anotherDictionaryExample.put("Computer","Bilgisayar");

        System.out.println(anotherDictionaryExample);
        System.out.println(anotherDictionaryExample.get("Apple"));
        System.out.println(anotherDictionaryExample.get("Elma"));

        HashMap<Integer, String> cityList = new HashMap<Integer,String>();
        cityList.put(26,"Eskişehir");
        cityList.put(34,"İstanbul");
        cityList.put(6,"Ankara");
        cityList.put(43,"Kütahya");

        System.out.println(cityList);
        System.out.println(cityList.get(6));
        cityList.remove(43);

        for (Integer item: cityList.keySet()){
            System.out.println("Number Code \t: " + item + " \t City Name \t: " + cityList.get(item));
        }
    }

    private static void ClassArrayList() {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer testUser = new Customer(5,"Tester","Tested");
        customers.add(new Customer(1,"Ferhat","Oygur"));
        customers.add(new Customer(2,"Dilek","Oygur"));
        customers.add(new Customer(3,"Esila","Oygur"));
        customers.add(new Customer(4,"Ali Alp","Oygur"));
        customers.add(testUser);

        System.out.println(customers.size());
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

        customers.remove(testUser);
        System.out.println(customers.size());
    }

    private static void TypeSafeArrayList() {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("California");
        cities.add("Miami");
        cities.add("Seattle");

        System.out.println(cities);

        Collections.sort(cities);
        for (String city: cities){
            System.out.println("Listed City Name : " + city.toUpperCase(Locale.ROOT));
        }
    }

    public void ObjectArrayUsage(){
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add("Eskişehir");
        numbers.set(0, 100);
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        numbers.remove(0);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));

        for (Object member : numbers) {
            System.out.println(member);
        }

        numbers.clear();

        System.out.println(numbers.size());
    }
}
