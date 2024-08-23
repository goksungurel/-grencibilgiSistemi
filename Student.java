package öğrencibilgisistemi;

public class Student {
	Course c1;
	Course c2;
	Course c3;
String name;
String stuNo;
String classes;
int avarage;
boolean isPass; 

Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
	this.name=name;
	this.stuNo=stuNo;
	this.classes=classes;
this.c1=c1;
this.c2=c2;
this.c3=c3;
this.avarage=0;
this.isPass=false;
	
}
void addBulkExamNote(int note1,int verbalNote1,int note2,int verbalNote2,int note3,int verbalNote3) {
	if(note1>=0 && note1<=100) {
		this.c1.note=note1;
	}
	if(verbalNote1>=0 && verbalNote1<=100) {
		this.c1.verbalNote=verbalNote1;
	}
	if(note2>=0 && note2<=100) {
		this.c2.note=note2;
	}
	if(verbalNote2>=0 && verbalNote1<=100) {
		this.c2.verbalNote=verbalNote2;
	}
	if(note3>=0 && note3<=100) {
		this.c3.note=note3;
	}
	if(verbalNote3>=0 && verbalNote3<=100) {
		this.c3.verbalNote=verbalNote3;
	}
}

void isPass() {
	this.avarage= (this.c1.note+this.c2.note+this.c3.note) / 3;
	if(this.avarage>55) {
		System.out.println("Sınıfı başarılı bir şekilde geçtiniz");
		this.isPass=true;
	}else {
		System.out.println("sınıfta kaldınız");
		this.isPass=false;
	}
	
}

void printNote() {

	System.out.println(c1.name+" Notu: " +this.c1.note);
	System.out.println(c1.name + " Sözlü Notu: " + this.c1.verbalNote);
    System.out.println(c1.name + " Ortalaması: " + this.c1.calculateAverage());
    
	System.out.println(c2.name+" Notu: " +this.c2.note);
	System.out.println(c2.name + " Sözlü Notu: " + this.c2.verbalNote);
    System.out.println(c2.name + " Ortalaması: " + this.c2.calculateAverage());
	
	System.out.println(c3.name+" Notu: " +this.c3.note);
	System.out.println(c3.name + " Sözlü Notu: " + this.c3.verbalNote);
    System.out.println(c3.name + " Ortalaması: " + this.c3.calculateAverage());
	
	
	System.out.println("Ortalamamız: "+ this.avarage);
	System.out.println("====================");
}



}
