package demo1;

import  java.util.Scanner;
import java.io.*;

public class demo3 {
    private static File file;
    private static String[] str = new String[1024];
    public static void main(String[] args){
        read();

        System.out.println(java.util.Arrays.toString(str));
    }
    public static boolean juidge(String str){
        Scanner in=new Scanner(System.in);
        if(str.trim().equals("")) {return false;}
        try{
            file =  new File(str);
            if(file.isFile()){            	
                if(!file.exists()) {                	
                	file.createNewFile();
                }
            }else{
            	System.out.println("你输入的是目录,请重新输入吧！");  
            	juidge(in.next());}
        }catch(IOException e){
            System.out.println("大哥这个查找目的文件名称连目录错了！！！");
        }
        return true;
    }
    public static void read(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入要排序的文件名称吧");
        if(juidge(in.next())) {        	
            try {
                FileReader inl = new FileReader(in.next());
                int b=0;
                char[] c=new char[1];
                int count=0;
                while((b=inl.read(c))!=-1){
                    //str[count]=((char)b)+"";
                	str[count] = String.valueOf(b);
                    count++;
                } 
                inl.close();
            }catch(java.io.FileNotFoundException e){
                System.out.println("暂时没有找到当前的文件");
            }catch(IOException e){
                e.getStackTrace();
            }
        }
    }

    public static String[] sort(String[] str){
        for(int i=0; i<str.length - 1; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i].compareTo(str[j])>0){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        return str;
    }

}