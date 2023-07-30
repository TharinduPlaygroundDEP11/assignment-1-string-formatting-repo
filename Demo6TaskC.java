public class Demo6TaskC {
    public static void main(String[] args) {
        String city1 = "Los Angelies";
        String state1 = "California";
        int population1 = 3966936;

        String city2 = "\033[32mNew\033[0m York";
        String state2 = "\033[32mNew\033[0m York";
        int population2 = 8336817;

        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(13)+"+"+"-".repeat(12)+"+\033[0m");
        System.out.printf("\033[33m|\033[0m \033[1m%-16s\033[0m\033[33m|\033[0m \033[1m%-12s\033[0m\033[33m|\033[0m \033[1m%-11s\033[0m\033[33m|\033[0m\n","CITY","STATE","POPULATION");
        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(13)+"+"+"-".repeat(12)+"+\033[0m");
        System.out.printf("\033[33m|\033[0m %-16s\033[33m|\033[0m %-12s\033[33m|\033[0m\033[31m%,11d\033[0m \033[33m|\033[0m\n",city1,state1,population1);
        System.out.printf("\033[33m|\033[0m %-25s\033[33m|\033[0m %-21s\033[33m|\033[0m\033[31m%,11d\033[0m \033[33m|\033[0m\n",city2,state2,population2);
        System.out.println("\033[33m+"+"-".repeat(17)+"+"+"-".repeat(13)+"+"+"-".repeat(12)+"+\033[0m");
        
    }
}
