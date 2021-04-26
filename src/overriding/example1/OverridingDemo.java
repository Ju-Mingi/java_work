package overriding.example1;
import java.util.Scanner;

class Man{
	public String name;
	public int age;
	
	public void info() {
		System.out.println("남자의 이름은 "+name+", 나이는 "+age+"입니다.");
	}
}

class Job extends Man{
	String job;
	
	public void info() {
		super.info();
		System.out.println("남자의 직업은 "+job+"입니다.");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Job job = new Job();
		
		job.name = sc.next();
		job.age = sc.nextInt();
		job.job = sc.next();
		
		job.info();
		

	}

}
