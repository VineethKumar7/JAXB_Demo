package jaxb;
import javax.xml.bind.*;
import javax.xml.transform.Result;

import java.io.*;

public class EmployeeJAXB {
	public void marshall() {
		try {
			Employee emp = new Employee("A001", "Vineeth", "Palakkad", 100000);
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp, System.out);
			ms.marshal(emp, new File("src\\data\\Employee.xml"));
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
		}
	}
}
