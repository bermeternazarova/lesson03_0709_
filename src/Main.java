import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.3, -1.2, 2.2, -2.5, -3.1, 2.7, -1.3, -4.2, 3.1, -3.3, 4.3, -3.4, 1.0, -4.6, 6.6};

        double result = 0;
        int i = 0;
        boolean a = false;
        boolean b = false;

        for (double elem : array) {
            if (a && b && elem > 0) {
                result += elem;
                i++;

                 System.out.println(elem);
            } else if (elem < 0) {
                b = true;
            } else {
                a = true;
            }}
            System.out.println("summa" + result);
            System.out.println("cреднее арифметическое"+result/i);
        for (int u = 0; u < array.length ; u++) {
            for (int j = u + 1; j < args.length-1 ; j++){
                if (array[j]>array[j+1]){double qw =array[j];
                    array[j]=array[j+1];
                    array[j+1]=qw;
        }}
            System.out.println(Arrays.toString(array));

        }}}






















