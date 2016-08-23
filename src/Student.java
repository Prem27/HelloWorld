import java.io.Serializable;  
public class Student implements Serializable{  
 
	private static final long serialVersionUID = 5398860413787067767L;
int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 