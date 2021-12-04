import java.util.ArrayList;

public class MyArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesNumbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        for (int i = 0; i < numbers.size(); i++) {

        }
        names.add("Raushan");
        names.add("Kuanysh");
        names.add("Ershon");
        names.add("Jansaya");
        names.add("Aruza");
        names.add("Aizere");
        names.add("Aiganym");
        names.add("Inkar");
        names.add("Rauan");
        names.add("Mama");
        for (int i = 0; i < names.size(); i++) {
           String s= numbers.get(i) +" "+ "-"+" " + names.get(i);
            namesNumbers.add(s);
        }

        for(String naNeme: namesNumbers){
            System.out.println(naNeme);
        }

    }
}
