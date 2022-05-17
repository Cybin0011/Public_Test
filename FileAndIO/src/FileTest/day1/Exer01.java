package FileTest.day1;

import FileFucion.File_Fuction;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-17 15:56
 */
public class Exer01 {
    public static void main(String[] args) throws IOException {
        File file1=new File("D:\\IDEA_workspace\\file_practice\\excer1");
        File_Fuction.Subfile_Creat(file1,"test.jpg");
    }
}
