//Q. W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes.


package assignmentR;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

  class Student {
	private int Roll_no;
	private String name;
	private int Age;
	private String course;  


	Student(int Roll_no,String name,int Age,String course)throws Exception {
	
       if(Age<15 || Age>21) {
  
       throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
          
    }
       if(!name.matches("[a-zA-Z]+")) {
       throw new NameNotValidException("Name should not contain numbers or special symbols.");
    }

        
        
	}
	public void setrollno(int Roll_no) {
		 this.Roll_no=Roll_no;
	}
	public int getrollno() {
		return Roll_no;
	}
	public void setName(String name) {
        this.name = name;
    }
	public String getName() {
        return name;
    }
	public void setAge(int Age) {
        this.Age = Age;
    }
	public int getAge() {
        return Age;
    }
	public void setCourse(String course) {
        this.course = course;
    }
	public String getCourse() {
        return course;
    }
	
   
	public static void main(String[] args) throws Exception {
		
		
		 
		try {
			Student s = new Student(51,"rahul",22,"MCA");
			System.out.println(s);
			
		} catch (AgeNotWithinRangeException e) {
            System.out.println("Exception:-" + e.getMessage());
        }
		
		try {
			
			Student s1 = new Student(51,"rahul1@#23",20,"MCA");
			System.out.println(s1);
		}
		
		catch ( NameNotValidException e) {
            System.out.println("Exception:-" + e.getMessage());
        }
		
          
	}

}
