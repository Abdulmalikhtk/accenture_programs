
      
  enum DAY{
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    private int value;
    private DAY(int value){
      this.value=value;
    }
    public int getValue(){
      return this.value;
    }
  }
  public class malikh{
    public static void main(String[] args){
    //printing all constants of an enum
      for(DAY day:DAY.values())
        System.out.println("Day:"+day.name()+" Value:"+day.getValue());
    }
  }
  
  

    

  
