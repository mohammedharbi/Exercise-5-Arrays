import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output: false

//        int [] carr = {50, -20, 0, 30, 40, 60, 10};
//
//        System.out.println(carr.length);
//        if (carr.length < 2){
//            System.out.println("Array length must be at least equal or greater than 2.");
//        }
//
//            if (carr[0] == carr[carr.length-1]){
//                System.out.println("True");
//            }else System.out.println("False");

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//            [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        The average of the said array is: 22.0 The numbers in the said array that are
//        greater than the average are: 25 100

//        int [] avgrry = {1, 4, 17, 7, 25, 3, 100};
//        double sum = 0;
//        double avg = 0;
//        ArrayList <Integer> higheravg = new ArrayList<>();
//
//        for (double i = 0; i < avgrry.length; i++) {
//            sum += avgrry[(int) i];
//            avg = sum/avgrry.length;
//        }
//        for (int a:avgrry){
//            if (a > avg){higheravg.add(a);}
//        }
//        System.out.println("The average is: "+sum/ avgrry.length);
//        System.out.println("that are greater than the average are: "+higheravg);

//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//        [20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40

//        int [] lasmnum = {20, 30, 40};
//
//        if (lasmnum[0] > lasmnum[lasmnum.length-1]){
//            System.out.println("Larger value between first and last element: "+lasmnum[0]);
//        }else {System.out.println("Larger value between first and last element: "+lasmnum[lasmnum.length-1]);}

//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//        Original Array:
//        [20, 30, 40]
//        Sample Output:
//        New array after swapping the first and last elements: [40, 30, 20]

//        int [] swrry = {20, 30, 40};
//        ArrayList<Integer> newarry = new ArrayList<Integer>();
//        int temp = swrry[0];
//        for (int a:swrry) {
//            newarry.add(a);
//        }
//        newarry.set(0, swrry[swrry.length - 1]);
//        newarry.set(swrry.length - 1, temp);
//        System.out.println(newarry);

//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//        [2,3,40,1,5,9,4,10,7]
//        Sample Output:
//        [3,1,5,9,7,2,40,4,10]

//            int [] arr = {2,3,40,1,5,9,4,10,7};
//
//            int count = 0;
//            int temp = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i]%2 != 0){
//                    count++;
//                }
//            }
//            int i = 0;
//            int j = i+1;
//            while (i != count){
//                if (arr[i]%2 != 0){
//                    i++;
//                    j = i + 1;
//                }else if ( j < arr.length){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    j++;
//                }
//        }
//        System.out.println(Arrays.toString(arr));

//        6. Write a program that test the equality of two arrays.
//        [2,3,6,6,4] [2,3,6,6,4]
//        Sample Output: true

//            int [] arr1 = {2,3,6,6,4};
//            int [] arr2 = {2,3,6,6,4};
//
//            Boolean isEqual = false;
//
//        for (int i = 0; i < arr1.length; i++) {
//
//
//            if (arr1[i] != arr2[i]) {
//                break;
//            } else {
//                isEqual = true;
//            }
//        }
//        System.out.println(isEqual);
    }

        }
