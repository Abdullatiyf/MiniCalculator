import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        int arr[] ={};
       int sum=0,temp=0,li=0;
       int n=0,count=0,max=0,min=0;
        System.out.println("Welcome to Mini Calculator\t"+"Here is our Menu Chose one of'em:");
        System.out.println("Menu\n"+"1=+,-,/,*\n"+"2=Max/Min\n"+"3=Sorrting\n"+"4=Avrg\n");
        Scanner scan=new Scanner(System.in);
        int op= scan.nextInt();
        switch (op){
            case 1:{
                System.out.println("Chose from +,-,/,*\n");
                char ch=scan.next().charAt(0);
                    if (ch=='+'){
                        System.out.println("Enter how many enters you want:");
                        int bound=scan.nextInt();
                        arr= new int[bound];
                       for (int i=0;i<arr.length;i++){
                           System.out.println("Enter "+(i+1) +" value:");
                           arr[i]= scan.nextInt();
                       }
                       for (int j=0; j<arr.length; j++){
                           sum+=arr[j];
                       }
                        System.out.println("Result: "+ sum);
                    } else if (ch=='-'){
                        System.out.println("Enter how many enters you want:");
                        int bound=scan.nextInt();
                        arr= new int[bound];
                        for (int i=0;i<arr.length;i++){
                            System.out.println("Enter "+(i+1) +" value:");
                            arr[i]= scan.nextInt();
                        }
                        for (int j=0; j<arr.length; j++) {
                            sum -= arr[j];
                        }
                        System.out.println("Result:"+sum);
                    }else if(ch=='/'){
                        System.out.println("Enter how many enters you want:");
                        int bound=scan.nextInt();
                        arr= new int[bound];
                        for (int i=0;i<arr.length;i++){
                            System.out.println("Enter "+(i+1) +" value:");
                            arr[i]= scan.nextInt();
                        }
                        for (int j=0; j<arr.length; j++){
                            sum/=arr[j];
                        }
                        System.out.println("Result:"+sum);
                    } else if(ch=='*'){
                        System.out.println("Enter how many enters you want:");
                        int bound=scan.nextInt();
                        arr= new int[bound];
                        for (int i=0;i<arr.length;i++){
                            System.out.println("Enter "+(i+1) +" value:");
                            arr[i]= scan.nextInt();
                        }
                        for (int j=0; j<arr.length; j++){
                            sum*=arr[j];
                        }
                        System.out.println("Result:"+sum);
                    }
                break;
            }
            case 2:{

                System.out.println("Enter how many value you want to enter:");
                li= scan.nextInt();
                arr=new int[li];
                for (int i=0;i<arr.length;i++){
                    System.out.println("Enter "+(i+1)+"value");
                    n= scan.nextInt();
                    arr[i]=n;
                }
                for (int j=0;j<arr.length;j++){
                    max=arr[0];
                    if(arr[j]>max)
                        max=arr[j];
                } for (int k=0;k<arr.length;k++){
                    min=arr[0];
                    if(arr[k]<min)
                        min=arr[k];
                }
                System.out.println("Max Num:"+max);
                System.out.println("Min Num:"+min);
                break;
            }
            case 3:{
                System.out.println("Enter how many value you want to enter:");
                li= scan.nextInt();
                arr=new int[li];

                for (int i=0;i<arr.length;i++){
                    System.out.println("Enter "+(i+1)+"value");
                    n= scan.nextInt();
                    arr[i]=n;
                }
                for (int i = 1; i < arr.length; i++) {
                    for (int j = i; j > 0; j--) {
                        if (arr[j] < arr [j - 1]) {
                            temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                        }
                    }
                }System.out.println("Sorted by Ascending");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i+1; j < arr.length; j++) {
                        if(arr[i] < arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted Descending");
                for (int i=0;i< arr.length;i++){
                    System.out.println(arr[i]);
                }

                break;
            }
            case 4:{
                System.out.println("Enter how many value you want to enter:");
                li= scan.nextInt();
                arr=new int[li];

                for (int i=0;i<arr.length;i++){
                    System.out.println("Enter "+(i+1)+"value");
                    n= scan.nextInt();
                    arr[i]=n;
                }
                for (int i=0;i< arr.length;i++){
                    sum+=arr[i];
                    count++;
                }
                System.out.println("Avrg:" +(sum/count));
                break;
            }
        }
    }
}
