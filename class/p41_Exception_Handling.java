public class p41_Exception_Handling {
    public static void main(String[] args) {
        // int arr[] = new int[100];
        // // System.out.println(arr[66]);

        // System.out.println("Exception se pehle ka code");

        // System.out.println(arr[666]);

        // System.out.println("Exception ke baad ka code");

        ///////////////

        // int arr[] = new int[100];
        // // System.out.println(arr[66]);

        // System.out.println("Exception se pehle ka code");

        // try {
        // System.out.println(arr[666]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("666 is an invalid address");

        // }
        // System.out.println("Exception ke baad ka code");

        ////////////////

        // int arr[] = new int[100];
        // // System.out.println(arr[66]);

        // System.out.println("Exception se pehle ka code");

        // try {
        // System.out.println(arr[666]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println(e.toString());

        // }
        // System.out.println("Exception ke baad ka code");

        ////////////////

        // int arr[] = new int[100];
        // // System.out.println(arr[66]);

        // System.out.println("Exception se pehle ka code");

        // try {
        // System.out.println(arr[666]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println(e.getMessage());

        // }
        // System.out.println("Exception ke baad ka code");

        /////////////

        // int arr[] = new int[100];
        // int x = 5;
        // int y = 0;

        // System.out.println("Exception se pehle ka code");

        // try {
        // x = x / y;

        // System.out.println(arr[666]);
        // // x = x / y;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array wali exception");
        // }
        // catch (ArithmeticException e) {
        // System.out.println("/0 wali exception");
        // }
        // System.out.println(x);
        // System.out.println("Exception ke baad ka code");

        ////////////////

        // int arr[] = new int[100];
        // int x = 5;
        // int y = 0;

        // System.out.println("Exception se pehle ka code");

        // try {
        // x = x / y;

        // System.out.println(arr[666]);
        // // x = x / y;
        // }
        // catch(ArrayIndexOutOfBoundsException | ArithmeticException |
        // NullPointerException e){
        // System.out.println("Exception Handeled");
        // }
        // // catch (ArrayIndexOutOfBoundsException e) {
        // // System.out.println("Exception Handeled");
        // // } catch (ArithmeticException e) {
        // // System.out.println("Exception Handeled"); // Instead of 2 catch with same
        // message
        // // }
        // System.out.println(x);
        // System.out.println("Exception ke baad ka code");

        ////////////////

        int arr[] = new int[100];
        int x = 5;
        // int y = 0;
        String s = new String();

        System.out.println("Exception se pehle ka code");

        try {
            // x = x / y;
            System.out.println(s);
            System.out.println(arr[666]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception Handeled");
        } catch (Exception e) {
            System.out.println("Baki ki exception");
        }

        System.out.println(x);
        System.out.println("Exception ke baad ka code");
    }
}
