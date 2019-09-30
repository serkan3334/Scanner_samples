import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // ekrandan girdiign sayıların toplamını yapacagız bunu yaparken de kullanmamız gerkenler : sc.hasNext();

          Scanner sc = new Scanner(System.in);

          int a = 0, b = 0;

          while(sc.hasNextInt())
          {
              int num = sc.nextInt();
              a += num;
              b++;
              
          }

          int k = a/b;
        System.out.println("ortalama deger .: "+ k);


    }
}
