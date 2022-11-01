package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first==second){
            System.out.println(first+"\n"+second);
        }else System.out.println(Math.max(first, second));
    }
}
