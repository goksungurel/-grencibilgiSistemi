package öğrencibilgisistemi;

public class Course {
	Teacher teacher;
String name;
String code;
String prefix;
int note;
int verbalNote;
double verbalEffect;

Course(String name,String code,String prefix,double verbalEffect){
	this.name=name;
	this.code=code;
	this.prefix=prefix;
	int note=0;
	this.verbalNote=0;
	this.verbalEffect=verbalEffect;
}
void addTeacher(Teacher teacher) {
	if(teacher.branch.equals(this.prefix)){
		this.teacher=teacher;
	}else {
		System.out.println("Öğretmen ve öğrenci bölümleri uyuşmuyor");
	}
		
}

void printTeacherInfo() {
	this.teacher.print();
}

double calculateAverage() {
	return(this.verbalNote*this.verbalEffect)+(this.note*(1-this.verbalEffect));
}
}
