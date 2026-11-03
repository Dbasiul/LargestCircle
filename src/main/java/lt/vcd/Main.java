package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] r = new int[n];
        int did = 0;
        
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            if (r[i] > did) {
                did = r[i];
            }
        }
        
        int kiek = 0;
        for (int i = 0; i < n; i++) {
            if (r[i] == did) {
                kiek++;
            }
        }
        
        System.out.println(did + " - " + kiek);
    }
}
