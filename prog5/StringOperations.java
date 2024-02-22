public class StringOperations {

    // strcpy implementation
    public static String strcpy(String source) {
        return source;
    }

    // strlength implementation
    public static int strlength(String str) {
        return str.length();
    }

    // strcat implementation
    public static String strcat(String str1, String str2) {
        return str1 + str2;
    }

    // strcmp implementation
    public static int strcmp(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // str.charAt(i) implementation
    public static char charAt(String str, int index) {
        return str.charAt(index);
    }

    public static void main(String[] args) {
        String source = "Hello";
        String str1 = "World";
        String str2 = "Hello";
        int index = 2;

        // strcpy
        String copiedStr = strcpy(source);
        System.out.println("Copied string: " + copiedStr);

        // strlength
        int length = strlength(source);
        System.out.println("Length of string: " + length);

        // strcat
        String concatenatedStr = strcat(source, str1);
        System.out.println("Concatenated string: " + concatenatedStr);

        // strcmp
        int compareResult = strcmp(source, str2);
        System.out.println("Comparison result: " + compareResult);

        // str.charAt(i)
        char charAtIndex = charAt(source, index);
        System.out.println("Character at index " + index + ": " + charAtIndex);
    }
}
