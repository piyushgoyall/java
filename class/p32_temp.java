import java.util.Scanner;

public class p32_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Convert to binary string
        String binaryString = Integer.toBinaryString(num);

        // Pad with zeros to ensure 32 bits
        binaryString = String.format("%32s", binaryString).replace(' ', '0');

        long sum = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            int temp = (int) binaryString.charAt(i);
            sum += Math.pow(temp, i);
            System.out.println("i: " + i);
            // System.out.print(binaryString.charAt(i) + " ");
        }

        System.out.println(binaryString);
        System.out.println(sum);
        sc.close();
    }
}
