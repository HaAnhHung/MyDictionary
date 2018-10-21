import java.io.*;
import java.util.Scanner;

public class DocGhiFile {

    public static void DocFile(String f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(reader);
        String s;
        do {
            s = null;
            s = br.readLine();
            if (s != null) {
                System.out.println(s);
            }
        } while (s != null);
        System.out.println();
        br.close();
    }

    public static void CapNhatFile(String f) throws IOException {
        String tenmoi = null;
        String diachimoi = null;
        String ngaysinhmoi = null;
        boolean checked = true;

        File file = new File(f);
        File tempFile = new File("tempfile.txt");

        FileInputStream fis = new FileInputStream(file);
        Scanner sc = new Scanner(fis);

        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        System.out.print("Nhập mã nhân viên muốn sửa: ");
        Scanner s = new Scanner(System.in);
        String ma = s.nextLine();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            String[] token = line.split("\r\n");

            if (token[0].equals(ma) && checked) {
                System.out.print("Tên mới: ");
                Scanner s1 = new Scanner(System.in);
                tenmoi = s1.nextLine();
                System.out.print("Địa chỉ mới: ");
                Scanner s2 = new Scanner(System.in);
                diachimoi = s2.nextLine();
                System.out.print("Ngày sinh mới: ");
                Scanner s3 = new Scanner(System.in);
                ngaysinhmoi = s3.nextLine();
                System.out.print(line);
                line = token[0] + "\r\n" + tenmoi + "\r\n" + diachimoi + "\r\n" + ngaysinhmoi;
                checked = false;
            }

            bw.write(line + System.getProperty("line.separator"));
        }
        sc.close();
        bw.close();
        file.delete();
        tempFile.renameTo(file);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("---Danh sách nhân viên---");
        DocFile("nhanvien.txt");
        CapNhatFile("nhanvien.txt");
    }

}