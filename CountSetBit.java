import java.util.Scanner;
public class CountSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 4, 5, 6 };
        int xorall = 0;
        int xornum=0;
        for(int i=0;i<arr.length;i++)
        {
            xornum=xornum^arr[i];
        }
        for(int i=1;i<=6;i++)
        {
            xorall=xorall^i;
        }

        int res = xorall^xornum;
        
        System.out.println(res);
    }
}
