import java.io.*;
public class CountWord {
    public static int countWord(String nameFile) {
        int count = 0;
        int count1 = 0;
        try {
            File file = new File(nameFile);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                count1++;
                if (line.length() == 0) continue;
                else {
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ') count++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count + count1;
    }

    public static void main(String[] args) {
        System.out.println(countWord("test.txt"));
    }
}
