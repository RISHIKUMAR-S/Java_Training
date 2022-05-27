public class variables {
    public String name = "Math"; //instance variable
    public static int mark = 90; //static variable
    public static void main(String[] args){
        int rollno = 456; //local variable
        variables student = new variables();
        System.out.println("Subject name is: " + student.name);
        System.out.println("Mark is: " + variables.mark);
        System.out.println("Roll number is: " + rollno);
    }
    
}
