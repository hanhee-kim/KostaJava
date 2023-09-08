package ex11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Student o) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
	}

} // class Student

public class Ex6 {							// from~to까지
	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
//		int count=0;
//		float avg;
//		
//		for(Student stu : tset) {
//			if (stu.getAverage() >= from && stu.getAverage()< to) {
//				count++;
//			}
//		}
//		return count;
		
		return (tset.subSet(new Student("",0,0,from,from,from),new Student("",0,0,to,to,to))).size();
		//TreeSet이 기본적으로 비교할때 compare을 사용하여 비교하기 때문에 평균이 기준이 됨
	}

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
//				if(s1.getAverage() > s2.getAverage()) {
//					return 1;
//				}
//				else if ( s1.getAverage() == s2.getAverage() ) {
//					return 0;
//				}
//				else {
//					return -1;
//				}
				return s1.getTotal()-s2.getTotal();
				
			}
		});
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
//		set.add(new Student("안자바", 1, 5, 59, 50, 75));  //평균이 60이라 들어감
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			}
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
