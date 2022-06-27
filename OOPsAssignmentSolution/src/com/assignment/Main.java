/**
 * 
 */
package com.assignment;

import com.assignment.models.AdminDepartment;
import com.assignment.models.HrDepartment;
import com.assignment.models.TechDepartment;

/**
 * @author nishthapradhan
 *
 */
public class Main {

	public static void main(String[] arg) {
		
		//Object declaration for HrDepartment, TechDepartment, AdminDepartment
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		//AdminDepartment functionalities:
		System.out.println("Welcome to " + admin.departmentName() + "\n" 
				+ admin.getTodaysWork() + "\n" 
				+ admin.getWorkDeadline() + "\n"
				+ admin.isTodayAHoliday() + "\n");
		
		//HrDepartment functionalities:
		System.out.println("Welcome to " + hr.departmentName() + "\n" 
				+ hr.doActivity() + "\n"
				+ hr.getTodaysWork() + "\n" 
				+ hr.getWorkDeadline() + "\n"
				+ hr.isTodayAHoliday() + "\n");
		
		//TechDepartment functionalities:
		System.out.println("Welcome to " + tech.departmentName() + "\n" 
				+ tech.getTodaysWork() + "\n" 
				+ tech.getWorkDeadline() + "\n"
				+ tech.getTechStackInformation() + "\n"
				+ tech.isTodayAHoliday() + "\n");
				
	}
}
