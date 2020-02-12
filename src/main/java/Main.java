import utils.ComUtilsService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("test");
        try {
            file.createNewFile();
            ComUtilsService comUtilsService = new ComUtilsService(new FileInputStream(file), new FileOutputStream(file));
            comUtilsService.writeTest();
            System.out.println(comUtilsService.readTest());
            System.out.println("---------------------------------");
            comUtilsService.writechartest();
            System.out.println(comUtilsService.readchartest());
        }
        catch(IOException e)
        {
            System.out.println("Error Found during Operation:" + e.getMessage());
            e.printStackTrace();
        }
    }

}