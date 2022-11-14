package variables;
class SubjectMarks
{
	//these variables are instance variable defined in the class
	int ScienceMark;
	int MathMark;
	int GKMark;	
}
public class instanceclass {
	
	public static void main(String[] args) {
	//student
	SubjectMarks subj1=new SubjectMarks();
	subj1.ScienceMark=65;
	subj1.MathMark=80;
	subj1.GKMark=75;
	//student2
	SubjectMarks subj2=new SubjectMarks();
	subj2.ScienceMark=70;
	subj2.MathMark=85;
	subj2.GKMark=90;
	//display mark for student1
	System.out.println("Mark for the first student");
	System.out.println(subj1.ScienceMark);
	System.out.println(subj1.MathMark);
	System.out.println(subj1.GKMark);
	//display mark for student2
	System.out.println("Mark for the second student");
	System.out.println(subj2.ScienceMark);
	System.out.println(subj2.MathMark);
	System.out.println(subj2.GKMark); 
	
	
	}
}
