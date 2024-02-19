public class Arrays {
    public static void main(String [] args) {
        int number = 10; //примитивный тип данных, ложим в коробку число 10//
        char character = 'a'; //примитивный тип данных//
        String s = "Jalapenho"; //Просто строка коротким способом//
        String s1 = new String("Huppa");//длинный способ переменная s ссылается на коробку//
        int [] numbers = new int [5]; //переменная numbers ссылается на объект массив с числом 5//
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
         //считаем с нуля 0 - 4





    }
}
