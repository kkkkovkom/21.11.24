package MyPackage;

import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validKey = false;
        while (!validKey) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validKey = true;
            } catch (Exception e) {
                System.out.println("Invalid key. Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo4 demo = new ThrowsDemo4();
        demo.getKey();
    }
}


