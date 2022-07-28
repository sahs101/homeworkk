package homework.homework3;


import java.io.*;

public class work3_basic {

    public static void main(String[] args) throws IOException {
        //задание 1
        Toyota toyota = new Toyota();
        Jigul jigul = new Jigul() {

        };
        toyota.carMoving();
        toyota.music();
        toyota.stop();
        jigul.carMoving();
        jigul.broke();
        jigul.stop();
        //задание 2
        FileReader fileReader = new FileReader("C:\\Java\\homeworkk\\src\\homework\\homework3\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line + " ");

        }

        fileReader.close();
        bufferedReader.close();
        System.out.println();
Financial_record record = new Financial_record(500, 300);
record.getEarnings();
record.setAntiearnigs();
  String    wew =   record.getEarnings() + ", " + record.setAntiearnigs();
       FileWriter fileWriter = new FileWriter("C:\\Java\\homeworkk\\src\\homework\\homework3\\report.txt");
fileWriter.write(wew);
fileWriter.flush();
fileWriter.close();

    }

}
