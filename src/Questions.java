
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Questions {
    
    
    private int firstNumLow, firstNumHigh;
    private int secondNumLow, secondNumHigh; 
    private int questionNum;
    

    List<int[]> questions = new ArrayList<>();
    public Questions(){
        
    }
    

    public Questions(int firstNumLow, int firstNumHigh, int secondNumLow, int secondNumHigh, int questionNum) {
        this.firstNumLow = firstNumLow;
        this.firstNumHigh = firstNumHigh;
        this.secondNumLow = secondNumLow;
        this.secondNumHigh = secondNumHigh;
        this.questionNum = questionNum;
    }

    @Override
    public String toString() {
        return "Questions{" + "firstNumLow=" + firstNumLow + ", firstNumHigh=" + firstNumHigh + ", secondNumLow=" + secondNumLow + ", secondNumHigh=" + secondNumHigh + ", questionNum=" + questionNum + '}';
    }
    
    
    

    
    public void randomQuestion(int a1, int a2, int b1, int b2, int n){
        Random rand = new Random();
        
        int firstRandomNum;
        int secondRandomNum;
     
      
        for(int i=0; i<n; i++){
            firstRandomNum = rand.nextInt(a2 - a1 + 1) + a1;
            secondRandomNum = rand.nextInt(b2 - b1 + 1) + b1;
            int[] tmp = {firstRandomNum, secondRandomNum};
            questions.add(tmp);
        }
 
    }
    
    
}
