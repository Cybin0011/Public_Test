package com.Cybin.ExceptionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Chen Yuanbin
 * @create 2022-04-18 14:03
 */
public class Main {
    public void  method1() throws FileNotFoundException, IOException {
        File file=new File("hello.txt");
        FileInputStream fis=new FileInputStream(file);
        int data =fis.read();
        while (data!=-1){
            System.out.println((char)data);
            data=fis.read();
        }
        fis.close();
    }
}
