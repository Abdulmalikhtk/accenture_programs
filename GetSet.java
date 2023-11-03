public class GetSet {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();
        // Use setter methods to set the values
        student.setstudent_id(007);
        student.setstudent_name("sudha");
        student.setqma(80);
        student.setrs("h");
        student.setyoe(3);    
 // Use getter methods with proper escape sequences to display values
        System.out.println("student_id: " + student.getstudent_id());
        System.out.println("student_name: " + student.getstudent_name());
        System.out.println("qma: " + student.getqma());
        System.out.println("rs: " + student.getrs());
        System.out.println("yoe: " + student.getyoe());
    }
}
 class Student {
    private int student_id;
    private String student_name;
    private int qma;
    private String rs;
    private int yoe;

    public void setstudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getstudent_id() {
        return student_id;
    }

    public void setstudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getstudent_name() {
        return student_name;
    }

   public void setqma(int qma) {
        this.qma = qma;
    }

    public int getqma() {
        return qma;
    } 
    public void setrs(String rs) {
        this.rs = rs;
    }

    public String getrs() {
        return rs;
    }
        public void setyoe(int yoe) {
        this.yoe = yoe;
    }

    public int getyoe() {
        return yoe;
    } 
    } 



