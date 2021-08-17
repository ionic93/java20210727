package Io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamOutputStream {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.out.println("InputSource: "+Arrays.toString(inSrc));
//1)
//        int data = 0;
//        while ((data = input.read()) != -1) { //-1 = 더이상 읽을게 없을때
//            output.write(data);
//        }

//2)
//        input.read(temp,0,temp.length); //temp[]안에 temp길이만큼 input을 읽어서 넣는다
//        output.write(temp,5,5); //tmp[]중 index 5부터 길이 5만큼 output에 쓴다

//3)
        while (input.available() > 0) {
            try {
                int length = input.read(temp);
                byte[] temp2 = Arrays.copyOf(temp, length);

                output.write(temp2,0,length);
                outSrc = output.toByteArray();
                System.out.println("temp2   :"+ Arrays.toString(temp2));
                System.out.println("outSrc:"+ Arrays.toString(outSrc));
                temp= new byte[4];
            } catch (IOException e) { }
        }
//        outSrc = output.toByteArray();
//        System.out.println("inSrc"+ Arrays.toString(inSrc));
//        System.out.println("temp"+ Arrays.toString(temp));
//        System.out.println("outSrc"+ Arrays.toString(outSrc));
    }
}
