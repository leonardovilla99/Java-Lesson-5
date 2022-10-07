/**
 * GradeActivity
 */
public class GradeActivity {
    // Fields
    public double score;

    // Constructor
    public GradeActivity(){
        score = 0.0;
    }
    public GradeActivity(double score){
        this.score = score;
    }

    // Mutator
    public void setScore(double score){
        if(score >=0){
            this.score = score;
        }
    }

    // Accessor
    public double getScore(){
        return score;
    }

    // Extra methods
    public char getGrade(){
        if(score >= 90){
            return 'A';
        }else if(score >= 80){
            return 'B';
        }else if(score >= 70){
            return 'C';
        }else if(score >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
}