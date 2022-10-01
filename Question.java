package IndividualAssignment;

import java.util.List;
import java.util.Random;

public class Question {
    Random r=new Random();
    String operator1=r.nextInt(2)==1 ? "+" : "-";
    String operator2=r.nextInt(2)==1 ? "+" : "-";

    int num1= r.nextInt(100)+1;
    int num2=r.nextInt(100)+1;
    int num3=r.nextInt(100)+1;
    int x= r.nextInt(2);//决定运算符个数
    @Override
    public String toString() {


        if (x==0)//1个运算符
        return num1+operator1+num2;
        else
            return num1+operator1+num2+operator2+num3;

    }

    public Question() {
    }
    public int answer(){

        if(x==0)//1个运算符
        {
            if(operator1=="+")
                return num1+num2;
            else return num1-num2;
        }
        else {//2个运算符
            if(operator1=="+"){
                if(operator2=="-")
                    return num1+num2-num3;
                else return num1+num2+num3;
            }
            else {if(operator2=="+")
                return num1-num2+num3;
            else return num1-num2-num3;
            }
        }
    }
    public boolean equals(List<Question> que ){

        for (Question ques:que
             ) {if(ques.toString().equals(this))
                 return true;

        }

        return false;
    }

}
