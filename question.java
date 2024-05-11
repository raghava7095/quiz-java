
import java.util.ArrayList;
import java.util.Scanner;
public class question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int total = 10;
        System.out.println("Welcome to the quiz");
        ArrayList<quiz> ques = new ArrayList<quiz>();
        ques.add(new quiz("Which is the biggest continent in the world ?","North America","Asia","Africa","Australia","Asia"));
        ques.add(new quiz("Which is the longest river in the world ?","Great Ganga","Nile","Amazon","Niger","Nile"));
        ques.add(new quiz("Which is the India's first super computer ?","Param8000","Param80000","Param800","Param8","Param8000"));
        ques.add(new quiz("Tsunami is a word in which language ?","Hindi","Urdu","Japanese","French","Japanese"));
        ques.add(new quiz("Which planet in the solar system is known as Red Planet ?","Venus","Earth","Mars","Jupiter","Mars"));
        ques.add(new quiz("What gas is used to extinguish fire ?","Oxygen","Nitrogen","Carbon dioxide","Hydrogen","Carbon dioxide"));
        ques.add(new quiz("What is the official currency of Japan ?","Won","Euro","Yen","Dollar","Yen"));
        ques.add(new quiz("Which is considered the lung of Earth ?","Amazon rainforest","The Mississippi Rivder","The sahara","Everest","Amazon rainforest"));
        ques.add(new quiz("Which is the largest island ?","New Guinea","Andaman Nicobar","Greenland","Hawaii","Greenland"));
        ques.add(new quiz("Which chemical element is designated as 'Hg' ?","Silver","Tin","Copper","Mercury","Mercury"));
        total = ques.size()*10;

        int quessize = ques.size();
        for(int i = 0; i < quessize; i++){
            System.out.println(ques.get(i).question);
            System.out.println("1. " + ques.get(i).op1 + "\t 2. " + ques.get(i).op2);
            System.out.println("3. " + ques.get(i).op3 + "\t 4. " + ques.get(i).op4);
            System.out.print("Enter (1 or 2 or 3 or 4) as answer : ");
            int uinp = sc.nextInt();
            switch(uinp){
               case 1 : if(ques.get(i).op1.equals(ques.get(i).ans))
               score += 10;
               break;
               case 2 : if(ques.get(i).op2.equals(ques.get(i).ans))
               score += 10;
               break;
               case 3 : if(ques.get(i).op3.equals(ques.get(i).ans))
               score += 10;
               break;
               case 4 : if(ques.get(i).op4.equals(ques.get(i).ans))
               score += 10;
               break;
               default :
                 System.out.println("Invalid input");  
            }
        }
        System.out.println("Total score : " + score + "/" + total);
        sc.close();
    }
    
}
