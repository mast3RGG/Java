package in.morgoci.persistence;

import in.morgoci.dto.Student;

public interface IStudentDao {
	
	public String addStudent(String sname,Integer sage , String adress);
	
	public Student searchStudent(Integer sid);
	
	public String updateStudent(Integer sid,String sname,Integer sage , String adress);
	
	public String deleteStudent(Integer sid);
}
