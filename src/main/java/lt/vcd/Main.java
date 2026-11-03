package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] radii = new int[n];
        int maxRadius = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            radii[i] = scanner.nextInt();
            if (radii[i] > maxRadius) {
                maxRadius = radii[i];
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            if (radii[i] == maxRadius) {
                count++;
            }
        }

        System.out.println(maxRadius + " - " + count);
        scanner.close();
    }
}
