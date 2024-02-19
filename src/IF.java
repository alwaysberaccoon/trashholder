public class IF {
    public static void main(String [] args) {
        int myInt = 5; //при int=5 то выполниться первое условие, т.к выполняется первая инструкция                        .
        if(myInt>10){ //условие которое должно быть выполенено
            System.out.println("да, верно");
        } else if(myInt<20) { // в случае если if не верно, то выполняется блок else
            System.out.println("нет, не верно");
        } else {
            System.out.println("ни один из случаев."); //если ни одно из условий не подходит пишем доп. else.
        }
    }
}
