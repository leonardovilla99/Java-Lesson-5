public class TestGradedActivities {
    public static void main(String[] args) {
        CurvedActivity ca1 = new CurvedActivity(50);
        ca1.setScore(60);
        System.out.println("The score is: " + ca1.getScore());
    }
}
