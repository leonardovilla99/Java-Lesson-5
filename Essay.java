public class Essay extends GradeActivity{
    // Fields
    double grammar, spelling, correctLenght, content;

    // Constractors
    public Essay(){
        grammar = 0;
        spelling = 0;
        correctLenght = 0;
        content = 0;
    }
    public Essay(double grammar, double spelling, double correctLenght, double content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLenght = correctLenght;
        this.content = content;
        getScore();
    }

    // Accessors 
    public double getGrammar(){
        return grammar;
    }
    public double getSpelling(){
        return spelling;
    }
    public double getCorrectLenght(){
        return correctLenght;
    }
    public double getContent(){
        return content;
    }
    @Override
    public double getScore(){
        score = 30*grammar + 20*spelling + 20*correctLenght + 30*content;
        return score;
    }
}
