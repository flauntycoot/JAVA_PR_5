package com.company;
public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursion5(1337));
        System.out.println(recursion6(17, 2));
        recursion7(18, 2);
        System.out.println(recursion8("rattar"));
    }

    public static int recursion5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {
        // i- доп. параметр рекурсии(делитель n). При вызове должен равняться двум.
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void recursion7(int n, int k) {
        // k- доп. параметр. При вызове должен равняться двум.
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion7(n / k, k);
        } else {
            recursion7(n, ++k);
        }
    }

    public static String recursion8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}