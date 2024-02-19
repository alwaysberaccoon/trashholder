import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); // Ввод данных с клавиатуры.
        System.out.println("Ввести возраст"); //Введенное число храниться в INT
        int age = scanner.nextInt(); //Переменная принимающая числовые данные
        switch (age){
            case 0 :
                System.out.println("рождение");
                break; // Оператор который обрывает выполнение цикла и блока switch
            case 7 :
                System.out.println("школа");
                break;
            case 18 :
                System.out.println("универ");
                break;
            default: // условие если case не выполнены, дефолт является условием которое выполняется всегда
                System.out.println("неподходящие условия");
        }
    }
}
