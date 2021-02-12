package exercicioSet;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Course> course = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}
		
		System.out.println("");
		System.out.print("How many students for course B? ");
			n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}
		
		System.out.println("");
		System.out.print("How many students for course C? ");
			n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}
		
		System.out.println("");
		System.out.println("Total student: " + course.size());
		
		sc.close();
	}

}
