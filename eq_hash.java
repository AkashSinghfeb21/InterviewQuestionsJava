
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

class Student{
      
       private int id;
       private String name;

       public Student(int id,String name){
              this.id = id;
              this.name = name;
       }

       @Override 
       public boolean equals(Object o){
              Student s = (Student) o;

              return (this.id==s.id)?true:false;
       }

       @Override
       public int hashCode(){
              return Objects.hash(id);
       }

       @Override
       public String toString(){
              return id+" "+name;
       }

}

public class eq_hash{
       public static void main(String[]args){
              
              Set<Student> set = new HashSet<>();
              set.add(new Student(1, "Akash"));
              set.add(new Student(1, "Aditya"));

              System.out.println(set);
       }
}