package usefulclass.object;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class CharEncoding {
    public static void main(String[] args) throws Exception {
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8: " + joinByteArr(bArr));
        System.out.println("UTF-8: " + joinByteArr(bArr2));

        System.out.println("UTF-8: " + new String(bArr, StandardCharsets.UTF_8));
        System.out.println("UTF-8: " + new String(bArr2, "CP949"));
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj =  new StringJoiner("/","[","]");

        for (byte b: bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}
