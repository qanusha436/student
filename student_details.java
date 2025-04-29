public class student_details{
    String name;
    int id;
    String course;
   
    //constructor
        public student_details(String name,int id,String course){
            this.name=name;
            this.id=id;
            this.course=course;
        }
        //method to display employee details
        public void displayIntfo(){
            System.out.println("employee name:"+name);
            System.out.println("employee id:"+id);
            System.out.println("employee course:"+course);
            
        }
        //main method
        public static void main(String[] args) {
            student_details s1=new student_details("nitra", 538, "bca");
            s1.displayIntfo();
            
        }
    
    
        
    }
    
    
}


    
}
