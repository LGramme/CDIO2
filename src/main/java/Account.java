public class Account {
    private int score;

    public Account(){
        score = 1000;

    }

    public void changeScore(int value){
        score += value;
    }
    public int getScore(){
        return score;
    }

}
