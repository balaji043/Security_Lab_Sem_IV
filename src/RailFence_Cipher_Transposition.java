import java.util.Arrays;
import java.util.Scanner;

public class RailFence_Cipher_Transposition {
    public static void main(String args[]) {
        String key;
        String encryptedMessage;
        int x = 0;
        int y = 0;
        key = "tape";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = sc.next();
        encryptedMessage = "";
        char temp[][] = new char[key.length()][message.length()];
        char msg[] = message.toCharArray();
        x = 0;
        y = 0;
        for (int i = 0; i < msg.length; i++) {
            temp[x][y] = msg[i];
            if (x == (key.length() - 1)) {
                x = 0;
                y = y + 1;
            } else {
                x++;
            }
        }
        char t[] = new char[key.length()];
        t = key.toCharArray();
        Arrays.sort(t);
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < key.length(); i++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < key.length(); i++) {
                int pos = 0;
                for (pos = 0; pos < t.length; pos++) {
                    if (key.charAt(i) == t[pos]) {
                        break;
                    }
                }
                System.out.print(temp[pos][j]);
                encryptedMessage += temp[pos][j];
            }
            System.out.println();
        }
        System.out.println(encryptedMessage);
        System.exit(0);
    }
}
//balajiar
//ablarjai