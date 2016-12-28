import java.util.Scanner;


public class SortApp {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Student[] arr = new Student[5];
        for (int i=0;i<5;i++){
            arr[i]=new Student();
            arr[i].setName(scanf.next());
            arr[i].setId(scanf.nextInt());
        }
        int min;
        Student temp;

        for (int index = 0; index < 5; index++)
        {
            min = index;
            for (int scan = index+1; scan < arr.length; scan++)
                if (arr[scan].getId()-arr[min].getId() < 0)
                    min = scan;
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
        for (int i=0;i<5;i++){
            System.out.print(arr[i].getName()+" ");
            System.out.print(arr[i].getId()+"\n");

        }
    }
    }
