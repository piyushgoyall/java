public class p1_string {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println(str1);
        System.out.println(str2);

        // conact
        // str1.concat(str2);
        System.out.println(str1);
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // length
        System.out.println("Length of " + str3 + " is: " + str3.length());

        // print a particular character
        System.out.println(str3.charAt(0));

        // substring
        System.out.println(str3.substring(2, 8));

        // last index of
        System.out.println(str3.lastIndexOf('o'));

        // replace
        String rep = str3.replace('o', '0');
        System.out.println(rep);

    }
}

// public class string_1 {
// public static void main(String[] args) {
// String str1 = new String("Hello");
// String str2 = new String("Hello");
// if (str1 == str2) {
// System.out.println("The strings are equal");
// } else {
// System.out.println("Strigns are not equal");
// }
// }
// }

// public class string_1 {
// public static void main(String[] args) {
// String str1 = "Hello";
// String str2 = "Hello";
// if (str1 == str2) {
// System.out.println("The strings are equal");
// } else {
// System.out.println("Strigns are not equal");
// }
// }
// }
