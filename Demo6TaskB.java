public class Demo6TaskB {
    public static void main(String[] args) {
        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(6)+"+\033[0m");
        System.out.printf("\033[33m| \033[0m\033[34m\033[1m%-16s\033[0m\033[0m\033[33m|\033[0m\033[34m\033[1m%5s \033[0m\033[33m|\033[0m\n","NAME","AGE");
        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(6)+"+\033[0m");
        System.out.printf("\033[33m|\033[0m %-16s\033[33m|\033[0m\033[31m%5d \033[0m\033[33m| \033[0m\n",name1,age1);
        System.out.printf("\033[33m|\033[0m %-16s\033[33m|\033[0m\033[31m%5d \033[0m\033[33m| \033[0m\n",name2,age2);
        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(6)+"+\033[0m");
    }
}
