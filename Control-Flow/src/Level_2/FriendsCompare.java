package Level_2;

import java.util.Scanner;

public class FriendsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();

        int youngest = age1;
        if (age2 < youngest) youngest = age2;
        if (age3 < youngest) youngest = age3;

        int tallest = height1;
        if (height2 > tallest) tallest = height2;
        if (height3 > tallest) tallest = height3;

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}
