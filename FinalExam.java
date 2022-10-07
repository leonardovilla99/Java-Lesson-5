
public class FinalExam extends GradeActivity{
    // Fields
    private int numQuestions, numMissed;
    
    // Constructor
    public FinalExam(int questions, int missed){
        super(100.0-missed*100/questions);
        numQuestions = questions;
        numMissed = missed;
        //setScore(100.0-numMissed*getPointsEach());
    }

    // Accessors
    public int getNumQuestions(){
        return numQuestions;
    }
    public int getNumMissed(){
        return numMissed;
    }

    // Other
    public double getPointsEach(){
        return 100.0/numQuestions;
    }
}
