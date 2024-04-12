import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> grades = new HashMap<>();
    public void addStudent(String name, int grade){
        grades.put(name, grade);
    }
    public void printStudentsAboveGrade(int threshold){
        for (Map.Entry<String, Integer> entry : grades.entrySet()){
            if (entry.getValue()>threshold){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
