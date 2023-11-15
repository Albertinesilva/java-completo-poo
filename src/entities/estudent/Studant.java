package entities.estudent;

public class Studant {
    
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
      return grade1 + grade2 + grade3;
    }

    public void missingPoints(){
        if(finalGrade() > 60.0){
            System.out.println("PASS");
        }else{
           
            System.out.printf("Failed" + "\nMissing %.2f", (60.0 - finalGrade()), " Points");
        }
    }

    public String toString() {
        return  name
                + String.format(", %.2f ", finalGrade());
    }
}
