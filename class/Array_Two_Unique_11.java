
public class Array_Two_Unique_11 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 5, 1, 4, 3, 2, 6 };
        int res = 0;
        // 1'st part
        for(int i=0;i<arr.length;i++)
        {
            res = res ^ arr[i];
        }
        System.out.println(res);
        // 2'nd part
        int pos = 0; 
        for(int i=0;i<32;i++)
        {
            if ((res & (i << i)) > 0) {
                pos = i;
                break;
            }
        }
        // 3'rd part
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if((arr[i]&(1<<pos))>0)
            {
                num1 = num1 ^ arr[i];
            }
            
        }
        System.out.println(pos);
    }
}
