//Напишите метод который сжимает строку aaaabbbcdd
public class task2_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";   //a4b3c1d2
        System.out.println(compressionString(str));

    }

    public static String compressionString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        return sb.toString();
    }

}
