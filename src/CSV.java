import java.io.*;

public class CSV {
    public static void main(String[]args) throws IOException {
        PrintWriter pw = new PrintWriter(new File("hw5.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("Value_1");
        sb.append(';');
        sb.append("Value_2");
        sb.append(';');
        sb.append("Value_3");
        sb.append(';');
        sb.append('\n');

        sb.append("100");
        sb.append(';');
        sb.append("200");
        sb.append(';');
        sb.append("277");
        sb.append(';');
        sb.append('\n');

        sb.append("987");
        sb.append(';');
        sb.append("253");
        sb.append(';');
        sb.append("678");
        sb.append(';');
        sb.append('\n');


        pw.write(sb.toString());
        pw.close();
        System.out.println("Файл записан");

        BufferedReader br = new BufferedReader(new FileReader("hw5.csv"));
        String line = null;

        while ((line = br.readLine()) != null){

            System.out.println(line);
        }


    }

}




