import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Домашка 03");

        Scanner scanner = new Scanner(System.in);
        double[] array = new double[15];

        int pos =0;
        int  bb = 0;
        for (double elem:array
             ) {elem = Math.random()*15-10;
            array [bb]= elem;
            if (array[bb]>0){pos ++;}
            bb++ ;}
        System.out.println(Arrays.toString(array));

        double[] array2 = new double[pos];
        int pos1=0;
        int bb2=0;
        for (double elem2: array) {
         array[bb2]=elem2;
         if (array[bb2]>0){array2[pos1]=array[bb2];
        }
         bb2++;
        }
        System.out.println(Arrays.toString(array2));

        //Дз на собразительность
        Arrays.sort(array);
        for (double sort:array) {
            System.out.println(sort + ";");
        }




    }}





















