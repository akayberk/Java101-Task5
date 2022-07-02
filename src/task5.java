import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        float pi = 3.14f,  alpha, r;
        System.out.print("Dairenin yari capini giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextFloat();
        System.out.print("merkezi acisini yaziniz: ");
        alpha = input.nextFloat();
        float archArea = (pi*(r*r)*alpha)/360f;
        System.out.println("Daire diliminin alani= " + archArea);

    }
}
