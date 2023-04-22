package t00.env;
import java.util.Scanner;

/**
 * @author 12S21041 Samuel Christy Angie Sihotang
 * @author NIM Nama
 * 
 */
public class IO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NIM = input.nextLine();

        String NAMA = input.nextLine();

        System.out.println(NIM + "|" + NAMA);
    }
}