public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        System.out.printf("\033[31m%d\033[0m/\033[32m%d\033[0m/\033[33m%d\033[0m \033[34m%d\033[0m:\033[35m%d\033[0m:\033[36m%d\033[0m\n ",month,day,year,hour,minute,second);
    }
}
