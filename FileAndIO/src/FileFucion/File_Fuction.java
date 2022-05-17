package FileFucion;

import java.io.File;
import java.io.IOException;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-17 17:06
 */
public class File_Fuction {
    public static void Subfile_Creat(File Superfile,String str) throws IOException {
        Superfile=new File(Superfile,str);
        boolean falg=Superfile.createNewFile();
        if(falg){
            System.out.println("成功创建文件:"+str);
        }
    }
    public static void SubDr_Creat(File Superfile,String str) throws IOException {
        Superfile=new File(Superfile,str);
        boolean falg=Superfile.mkdir();
        if(falg){
            System.out.println("成功创建文件夹:"+str);
        }
    }
}
