
public class Student {
	boolean present,absent;
	
	function compareAge(a, b) {

	    return a.age - b.age;
	}

	const students = [{name: 'Sara', age:24},{name: 'John', age:22}, {name: 'Jack', age:27}];

	console.log(students.sort(compareAge));
	void present()
	{
		present = true;
		System.out.println("Student is Present:-\t" +  present);
	}
     void Absent() 
     {
    	 absent = false;
    	 System.out.println("Student is absent:-\t " + absent);
    	 
     }


	public static void main(String[] args) {
		
Student s1=new Student();
Student s2=new Student();

s1.present();
s2.Absent();
	}
	void compareName(a,b) {
		const name1 = a.name
	}
	
	
}
	