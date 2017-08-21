
import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lenovo on 2017/8/21.
 */
public class UpdateFileName {
    public static void main(String[] args) {
        File files = new File("D:\\Bluetooth\\");
        if(null != files){
            for(File file:files.listFiles()){
                if(!file.getName().equals("rcd.db")){
                    Date date = new Date(file.lastModified());
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    String name = ""+calendar.get(Calendar.YEAR)+(calendar.get(Calendar.MONTH)+1)+calendar.get(Calendar.DAY_OF_MONTH);
                    int i = 1;
                    while (true){
                        File newFile = new File("D:\\Bluetooth1\\"+name+"_"+i+"."+file.getName().substring(file.getName().lastIndexOf(".")+1));
                        if(newFile.exists()){
                                    i++;
                        }else {
                            file.renameTo(newFile);
                            break;
                        }
                    }

                }
            }
        }
    }
}
