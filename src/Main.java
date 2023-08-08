import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Dannye faila:");
        ArrayList<String> arrayList=new ArrayList<>();
        String name="vvod.txt";
        Scanner scanner=new Scanner(new File(name));
        while (scanner.hasNext()) {
            arrayList.add(scanner.next());
        }
        int tRoom= Integer.parseInt(arrayList.get(0));
        int tCond= Integer.parseInt(arrayList.get(1));
        String string=arrayList.get(2);
        if (string.equals("freeze")) {
            if (tRoom>tCond) {
                System.out.println(tCond);
            } else {
                System.out.println(tRoom);
            }
        }
        if (string.equals("heat")) {
            if(tRoom<tCond) {
                System.out.println(tCond);
            } else {
                System.out.println(tRoom);
            }
        }
        if (string.equals("auto")) {
            System.out.println(tCond);
        }
        if (string.equals("fan")) {
            System.out.println(tRoom);
        }

    }
}
