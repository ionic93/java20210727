package Io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\classJava\\workspace\\java20210727\\src\\main\\Io\\FileEx1.java");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf("."); // .이 마지막으로 등장한 위치값

        System.out.println("경로를 제외한 파일 이름: "+f.getName());
        System.out.println("오직 파일명만: "+fileName.substring(0,pos));
        System.out.println("확장자: "+fileName.substring(pos+1));
        System.out.println("경로를 포함한 파일이름: "+f.getPath());
        System.out.println("파일의 절대 경로: "+f.getAbsolutePath());
        System.out.println("파일의 정규 경로: "+f.getCanonicalPath());//예외가 발생하므로 IOException에 회피
        System.out.println("파일이 속해 있는 디렉토리: "+f.getParent());
    }
}
