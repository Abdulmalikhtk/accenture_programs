public class PlayerRating {
   

    public static void main(String[] args) {
        playerR R=new playerR(1,"Beckham");
        R.calculateAverageRating(9f, 9.9f);
        R.calculateCategory();
        R.display();
        playerR S=new playerR(1, "Oscar");
        S.calculateAverageRating(1f, 1f, 1f);
        S.calculateCategory();
        S.display();
    }
}

class playerR {
    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    public playerR(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    void calculateAverageRating(float criticOneRating, float criticTwoRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        averageRating = (criticOneRating + criticTwoRating) / 2.0f; // Use 2.0f for float division
       
    }

    void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3.0f; // Use 3.0f for float division
        
    }
    void calculateCategory(){
        if(averageRating>8){
            category='A';

        }
        if(averageRating>5 && averageRating<=8){
            category='B';
        }
        if(averageRating>0 && averageRating<=5){
            category='C';
        }

    }
    void display(){
          System.out.println("The player name is"+playerName);
          System.out.println("The player position is:"+1);
          System.out.println("The average rating is"+averageRating);
          System.out.println("The category is"+category);
    }
}
