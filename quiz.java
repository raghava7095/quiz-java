
public class quiz {
    String question;
    String op1;
    String op2;
    String op3;
    String op4;
    String ans;
    quiz(String question, String op1, String op2,String op3, String op4, String ans){
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.ans = ans;
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return this.question;
    }
    public void setop1(String op1){
        this.op1 = op1;
    }
    public String getop1(){
        return this.op1;
    }
    public void setop2(String op2){
        this.op2 = op2;
    }
    public String getop2(){
        return this.op2;
    }
    public void setop3(String op3){
        this.op3 = op3;
    }
    public String getop3(){
        return this.op3;
    }
    public void setop4(String op4){
        this.op4 = op4;
    }
    public String getop4(){
        return this.op4;
    }
    public void setans(String ans){
        this.ans = ans;
    }
    public String getans(){
        return this.ans;
    }
}
