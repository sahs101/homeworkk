import java.util.Arrays;

public class work1 {
    public static void main(String[] args) {
        // задача 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String asd = world.trim().toLowerCase();
        String qwe = hi + asd + newLine;
        String zxc = qwe.trim();
        System.out.println((zxc + newLine).repeat(3));
        // задача 2
        double sas = 1.90;
        double sis = 22.5;
        double sus = sis / (sas * sas);
        System.out.println(sus);
        //задача 3
        char[] vbn = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println(vbn);
        char[] vbn1 = vbn;
        vbn1[3] = 'h';
        System.out.println(vbn1);


        }
    }
