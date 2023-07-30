public class Demo6TaskD {
    public static void main(String[] args) {
        String item1 = "Apple";
        int qty1 = 5;
        double price1 = 0.99;

        String item2 = "Oranges";
        int qty2 = 10;
        double price2 = 1.49;

        System.out.println("\033[033m+"+"-".repeat(10)+"+"+"-".repeat(10)+"+"+"-".repeat(7)+"+");
        System.out.printf("|\033[0m \033[1m%-9s\033[0m\033[33m|\033[0m\033[1m%9s\033[0m \033[33m|\033[0m\033[1m%6s\033[0m \033[33m|\n","ITEM","QUANTITY","PRICE");
        System.out.println("\033[33m+"+"\033[32m-\33[0m".repeat(10)+"\033[33m+"+"-".repeat(10)+"+"+"\033[32m-\033[0m".repeat(7)+"\033[33m+");
        System.out.printf("|\033[0m %-9s\033[33m|\033[0m\033[35m%9d\033[0m \033[33m|\033[0m \033[32m$\033[0m\033[31m%4.2f\033[0m \033[33m|\n",item1,qty1,price1);
        System.out.printf("|\033[0m %-9s\033[33m|\033[0m\033[35m%9d\033[0m \033[33m|\033[0m \033[32m$\033[0m\033[31m%4.2f\033[0m \033[33m|\033[0m\n",item2,qty2,price2);
        System.out.println("\033[33m+"+"\033[32m-\33[0m".repeat(10)+"\033[33m+"+"-".repeat(10)+"+"+"\033[32m-\033[0m".repeat(7)+"\033[33m+");

    }
}
