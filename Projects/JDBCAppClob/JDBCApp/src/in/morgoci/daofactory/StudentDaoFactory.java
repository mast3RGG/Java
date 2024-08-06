package in.morgoci.daofactory;

import in.morgoci.persistence.IStudentDao;
import in.morgoci.persistence.StudentDaoImp;

public class StudentDaoFactory {
	
	private StudentDaoFactory(){		
	
	}
	
	private static  IStudentDao studentDao = null;
	
	public static IStudentDao getStudentDao()
	{
		if(studentDao ==null)
		{
			studentDao = new StudentDaoImp();
		}
		
		return studentDao;
	}
}
