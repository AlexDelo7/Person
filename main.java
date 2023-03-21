public class main {

    public static void main(String[]args)
    {
        Student George = new Student("Geroge",784783);
        Student Greg = new Student("Greg",126543);
        Student Geremy = new Student("Geroge",816743);

        System.out.println(Greg);
        System.out.println(Greg instanceof Person);
        System.out.println(Greg instanceof Student);
    }
    
}
