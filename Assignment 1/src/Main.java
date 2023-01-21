import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose: \n" + "1) Phone" + "\n"+ "2) Person"+"\n"+ "3) Matrix" + "\n"+ "4) Reader");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                Phone noApkPhone = new Phone("228 420 69", "iPhone", 5.5);
                Phone laggyGoofyAhhPhone = new Phone("667 178 14", "Samsung");
                Phone ChingChongPhone = new Phone();

                System.out.println(noApkPhone);
                System.out.println(laggyGoofyAhhPhone);
                System.out.println(ChingChongPhone);

                noApkPhone.receiveCall("Islam");
                laggyGoofyAhhPhone.receiveCall("Adolf West");
                ChingChongPhone.receiveCall("Arman");
                break;
            case 2:
                Person First = new Person("Kim");
                Person Second = new Person("Van", 50);

                System.out.println(Second);

                Second.move();
                Second.talk();
                break;
            case 3:
                double[][] matrix = {{1, 2}, {3, 4}};
                Matrix matrix1 = new Matrix(matrix, 2, 2);
                matrix1.Multiply(14);
                matrix1.print();
                break;
            case 4:
                Reader reader1 = new Reader("Cringeslam", 69, "Abobastroenie", "22.12.2004", "8 800 555 35 35");
                reader1.takeBook("C++ for chainiks", "How to escape from AITU");
                reader1.returnBook("C++ for gays");
                break;
            default:
                System.out.println("Choose from 1 - 4!");
                break;
        }
    }
}