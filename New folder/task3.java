package hello;

public class task3 {

	public static void main(String[] args) {
		EngStudent s1=new EngStudent();
		s1.setName("Kholoud");
		s1.setUniversityName("Al-Azhar");
		s1.setAge(20);
		System.out.println("studet's name : "+s1.getName());
		System.out.println("studet's university : "+s1.getUniversityName());
		System.out.println("studet's age : "+s1.getAge());
		
		  System.out.println(" ");
		
		EngStudent s2=new EngStudent();
		s2.setName("Abd El-Wahab");
		s2.setUniversityName("Al-Azhar");
		s2.setAge(25);
		System.out.println("studet's name : "+s2.getName());
		System.out.println("studet's university : "+s2.getUniversityName());
		System.out.println("studet's age : "+s2.getAge());
		

	}

}
