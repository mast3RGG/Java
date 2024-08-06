package in.morgoci.service;

import in.morgoci.dto.Student;

public interface IStudentService {

	public String addStudent(String sname, Integer sage, String adress);

	public Student searchStudent(Integer sid);

	public String updateStudent(Integer sid, String sname, Integer sage, String adress);

	public String deleteStudent(Integer sid);
}
