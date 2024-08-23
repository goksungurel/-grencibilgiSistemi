package öğrencibilgisistemi;

public class Main {

	public static void main(String[] args) {
	Teacher t1= new Teacher("Mahmut Hoca","3500","TRH");
	Teacher t2= new Teacher("Nil Hoca","2000","Math");
	Teacher t3= new Teacher("Göktuğ Hoca","1223","PHYS");
	
Course tarih= new Course("Tarih", "101" , "TRH",0.20);
tarih.addTeacher(t1);
Course matematik= new Course("Matemetik","154","Math",0.30);
matematik.addTeacher(t2);
Course fizik= new Course("Fizik","100","PHYS",0.25);
fizik.addTeacher(t3);



Student s1= new Student("inek şaban","234","4",tarih,fizik,matematik);
s1.addBulkExamNote(100, 45,90,70,80,90 );
s1.isPass();
s1.printNote();

Student s2=new Student("Göksun Gürel","879","2",tarih,fizik,matematik);
s2.addBulkExamNote(98,99,100,99,78,99);
s2.isPass();
s2.printNote();

Student s3=new Student("Berkan Hoşgül","156","2", tarih,fizik,matematik);
s3.addBulkExamNote(90,87,100,89,78,99);
s3.isPass();
s3.printNote();
	}
}
