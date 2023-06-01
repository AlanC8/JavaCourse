package Upgrade;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            al.add(scanner.nextInt());
        }
        for(int i : al){
            System.out.print(i + " ");
        }
    }
}
