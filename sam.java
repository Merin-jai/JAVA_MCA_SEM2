import java.io.*;

class palinfunc {
    public static int reverse(int n) {
        int mod, rev = 0;
        int temp = n; // Save the original number
        while (temp != 0) {
            mod = temp % 10;
            rev = rev * 10 + mod;
            temp = temp / 10;
        }
		System.out.println(rev);
        return rev;
    }

    public static int checkp(int n) {
		System.out.println(reverse(n));
        if (reverse(n) == n)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]) {
        DataInputStream din = new DataInputStream(System.in);
        int n, c;
        try {
            System.out.println("Enter the number : ");
            n = Integer.parseInt(din.readLine());
            c = checkp(n);
			System.out.println(reverse(n));
            if (c == 1)
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
