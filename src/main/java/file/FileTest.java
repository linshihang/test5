package file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.regex.Pattern;

/**
 * Created by ASUS on 2016/7/9.
 */
public class FileTest implements Serializable {
    public static void  main(String[]args){
        File file = new File("E:\\test");

        for(String s:file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(".*.txt");
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        })){
            System.out.println(s);
        }


    }
}
