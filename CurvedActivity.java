public class CurvedActivity extends GradeActivity{
    // Fields
    private double rawScore, percentage;

    // Contractor
    public CurvedActivity(double percentage){
        this.percentage = percentage;
    }

    // Accessors
    public double getRawScore(){
        return rawScore;
    }
    public double getPercentage(){
        return percentage;
    }

    // Override
    @Override
    public void setScore(double score){
        rawScore = score;
        super.score = (rawScore * (100 + percentage)/100);
    }
}
