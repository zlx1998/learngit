import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class demo {
    static String realFileName="dc_yb03.sql";
    public static List<String> ergodic(File file,List<String> resultFileName){
        File [] files=file.listFiles();
        if(files==null) return  resultFileName;//
        for (File f:files){
            if(f.isDirectory()){
                ergodic(f,resultFileName);
            }else{
                if(f.getName().equals(realFileName)){
                    resultFileName.add(f.getPath());
                }

            }
        }
        return resultFileName;
    }

    public static void main(String[] args) {
        List<String> resultFileName= new ArrayList<String>();
        resultFileName=ergodic(new File("c:"),resultFileName);
        System.out.println(resultFileName);
    }
}
