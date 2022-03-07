import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {
        int[] arr;
       int sum=0,temp,sum1;
       int count=0,max=0,min=0;
        System.out.println("Welcome to Mini Calculator\t"+"Here is our Menu Chose one of them:");
        System.out.println("""
                Menu
                1=+,-,/,*
                2=Max/Min
                3=Sorting
                4=Average
                """);
       Scanner scan=new Scanner(System.in);
        int op= scan.nextInt();
        switch (op) {
            case 1 -> {
                System.out.println("Chose from +,-,/,*\n");
                char ch = scan.next().charAt(0);
                if (ch == '+') {
                    System.out.println("Enter how many enters you want:");
                    int bound = scan.nextInt();
                    arr = new int[bound];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Enter " + (i + 1) + " value:");
                        arr[i] = scan.nextInt();
                    }
                    for (int i : arr) {
                        sum += i;
                    }
                    System.out.println("Result: " + sum);
                } else if (ch == '-') {
                    System.out.println("Enter how many num you want:");
                    int bound = scan.nextInt();
                    arr = new int[bound];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Enter " + (i + 1) + " value:");
                        arr[i] = scan.nextInt();
                    }
                    for (int i : arr) {
                        sum -= i;
                    }
                    System.out.println("Result:" + sum);
                } else if (ch == '/') {
                    System.out.println("Enter a value:");
                    int a = scan.nextInt();
                    System.out.println("Enter b value");
                    int b = scan.nextInt();
                    sum1 = a / b;
                    System.out.println("Result:" + sum1);
                } else if (ch == '*') {
                    System.out.println("Enter a value:");
                    int a = scan.nextInt();
                    System.out.println("Enter b value");
                    int b = scan.nextInt();
                    sum1 = a * b;
                    System.out.println("Result:" + sum1);

                }
            }
            case 2 -> {

                System.out.println("Enter how many numbers you want:");
                int bound = scan.nextInt();
                arr = new int[bound];
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Enter " + (i + 1) + " value:");
                    arr[i] = scan.nextInt();
                }
                for (int i : arr) {
                    max = arr[0];
                    if (i > max)
                        max = i;
                }
                for (int i : arr) {
                    min = arr[0];
                    if (i < min)
                        min = i;
                }
                System.out.println("Max Num:" + max);
                System.out.println("Min Num:" + min);
            }
            case 3 -> {
                System.out.println("Enter how many n you want:");
                int bound = scan.nextInt();
                arr = new int[bound];
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Enter " + (i + 1) + " value:");
                    arr[i] = scan.nextInt();
                }
                for (int i = 1; i < arr.length; i++) {
                    for (int j = i; j > 0; j--) {
                        if (arr[j] < arr[j - 1]) {
                            temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted by Ascending");
                for (int k : arr) {
                    System.out.print(k + ",\n");
                }

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] < arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted Descending");
                for (int j : arr) {
                    System.out.print(j + ",");
                }

            }
            case 4 -> {
                System.out.println("Enter how many time you want input:");
                int bound = scan.nextInt();
                arr = new int[bound];
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Enter " + (i + 1) + " value:");
                    arr[i] = scan.nextInt();
                }
                for (int j : arr) {
                    sum += j;
                    count++;
                }
                System.out.println("Average:" + (sum / count));
            }
        }
    }

}
