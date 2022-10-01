package IndividualAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        //文字提示
        System.out.println("请输入题目数量");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        List<Question> que=new ArrayList<>();//创建存储题目的集合
        for (int i = 0; i <x ; i++) {
            Question qu=new Question();
            if(qu.equals(que)){//判断重复
                i=i-1;
                continue;
            }
            qu.toString();
            if(qu.answer()>100){//判断大小
                i=i-1;
                continue;
            }
            if(qu.answer()<1){//判断大小
                i=i-1;
                continue;
            }
            que.add(qu);
            System.out.println(qu);
        }
        writeE(que);//创建问题文件
        writeD(que);

}

    private static void writeD(List<Question> que) throws IOException {//创建问题文件
        BufferedWriter bw2=new BufferedWriter(new FileWriter("Answers.txt"));
        int j=1;
        for (Question ques:que) {
            bw2.write(j+"."+ques.answer());
            j++;
            bw2.newLine();
            bw2.flush();
        }
        bw2.close();
    }

        private static void writeE(List<Question> que) throws IOException {//创建答案文件
        BufferedWriter bw1=new BufferedWriter(new FileWriter("Exercises.txt"));
        int i=1;
        for (Question ques:que
             ) {bw1.write(+i+"."+ques.toString());
            i++;
            bw1.newLine();
            bw1.flush();
        }
    bw1.close();
    }
}