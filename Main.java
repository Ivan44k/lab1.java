import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first;
        first = num.nextInt();
        System.out.println("Введите второе число: ");
        int second;
        second = num.nextInt();
        System.out.println("Введите третье число: ");
        int third;
        third = num.nextInt();
        System.out.println("Введите четвёртое число: ");
        int forth;
        forth = num.nextInt();
        System.out.println("Введите пятое число: ");
        int fifth;
        fifth = num.nextInt();
        int array[] = new int[]{first, second, third, forth, fifth};
        int min = getMin(array);
        System.out.println("Минимальное значение: "+min);
        int max = getMax(array);
        System.out.println("Максмальное значение: "+max);
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }
}