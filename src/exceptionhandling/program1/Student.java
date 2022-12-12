package exceptionhandling.program1;

public class Student {
	
	private int rollno;
	private String sname;
	private String saddress;
	private StudentResult srobj;
	private int count =0;
	private float result;
	public Student(int rollno, String sname, String saddress,StudentResult srobj) {
		
		setRollno(rollno);
		setSname(sname);
		setSaddress(saddress);
		setSrobj(srobj);	
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	
	@Override
	public String toString() {
	
	 try {
		 
		 result = (getSrobj().getMaths()+getSrobj().getPhysics()+getSrobj().getChemistry()+getSrobj().getHindi()+getSrobj().getEnglish())/5;
			
		   if(getSrobj().getMaths() < 40) {
			   count++;
		   }
		   if(getSrobj().getPhysics() < 40) {
			   count++;
		   }
		   if(getSrobj().getChemistry() < 40) {
			   count++;
		   }
		   if(getSrobj().getHindi() < 40) {
			   count++;
		   }
		   if(getSrobj().getEnglish() < 40) {
			   count++;
		   }
		   if(count > 1) {
			   throw new ResultException("Student is failed in two subjects");
		   }else { 
			   
			   if(result < 40) {
				   throw new ResultException("Student couldn't score more than 40%" + result+"%");
			   }else {
				  
				   System.out.println(count);
					  return "Student Details: [ Student Name: "+getSname()+", Address: "+getSaddress()+", Roll no: "
				   +getRollno()+", Result "+result+"% ]";
			   } 
		   }
		   
		   }catch (ResultException e) {
			   System.out.println(e.getMessage());
		   }
	return "";
	 
	}
}	

