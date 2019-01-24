

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<ObjType> dlist = new ArrayList<>();

        File file = new File("src/data.txt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();

                List<String> List = Arrays.asList(str.split(","));


                ObjType temp = new ObjType(Float.parseFloat(List.get(0)),
                        Float.parseFloat(List.get(1)),
                        Float.parseFloat(List.get(2)),
                        Float.parseFloat(List.get(3)),List.get(4));


                dlist.add(temp);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.printf(dlist.get(0).fifth);

        for (int i = 0;i<dlist.size();i++){
            System.out.println("1:"+dlist.get(i).first+
                     "2:"+dlist.get(i).second+
                     "3:"+ dlist.get(i).third+
                     "4:"+dlist.get(i).forth+
                    "5:"+dlist.get(i).fifth);
        }
    }
}
