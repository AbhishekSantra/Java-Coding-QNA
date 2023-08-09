import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Accenture15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, n));
    }

    private static int solve(int[] arr, int n) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        even.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array ");
        for (int e : even)
            System.out.print(e + " ");
        System.out.println();
        System.out.println("sorted odd array ");
        for (int e : odd)
            System.out.print(e + " ");
        System.out.println();
        int evensec= even.get(even.size() - 2);int oddsec= odd.get(odd.size() - 2);
        System.out.println("Second Largest Element in Even List is:" + evensec);
        System.out.println("Second Largest Element in Odd List is:" + oddsec);
        return evensec+oddsec;
    }
}
