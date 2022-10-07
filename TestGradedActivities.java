public class TestGradedActivities {
    public static void main(String[] args) {
        GradeActivity[] gradeActivities = new GradeActivity[2];
        gradeActivities[0] = new FinalExam(20, 5);
        gradeActivities[1] = new CurvedActivity(50);
        gradeActivities[1].setScore(60);
        for(int i = 0; i < gradeActivities.length; i++){
            System.out.println("The activity score is: " + gradeActivities[i].getScore());
        }


    }
}
