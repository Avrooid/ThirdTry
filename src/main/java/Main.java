import java.io.Console;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("НУ ВЫ И ДУРАЧКИ!");
        int i = 1;
        System.out.println(i);
        if (i > 5)
        {
            System.out.println("переменная больше 5");
        }

        else
        {
            System.out.println("Переменная меньше 5");
        }

        switch(i)
        {
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println("i != 1");
                break;
        }

        int[] array = new int[10];
        for(var j = 0; j < array.length; j++)
        {
            array[j] = j;
            System.out.println(array[j]);
        }

        for(var a : array)
        {
            System.out.println(a);
        }

        var b = 2;

        do
        {
            System.out.println("do while b = " + ++b);
        }while (b < 0);

        while(b > 0)
        {
            System.out.println("while b = " + b--);
        }

        }
    }
