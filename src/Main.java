import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 50; i++) {
            array.add(random.nextInt(100));
        }
        System.out.print(array);
        System.out.println();

        ArrayList<Integer> even=new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2==0){
                even.add(array.get(i));
            }
        }
        System.out.print(even);
        System.out.println();

        ArrayList<Integer> odd=new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2==1)
            {
                odd.add(array.get(i));
            }
        }
        System.out.print(odd);

        //OR
//        ArrayList<Integer> even = (ArrayList<Integer>) array.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
//        System.out.print(even + " ");
//        System.out.println();
//        ArrayList<Integer> odd = (ArrayList<Integer>) array.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
//        System.out.print(odd+ " ");
    }
}