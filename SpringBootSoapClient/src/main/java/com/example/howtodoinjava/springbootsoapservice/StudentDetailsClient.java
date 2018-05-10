package com.example.howtodoinjava.springbootsoapservice;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.howtodoinjava.schemas.school.StudentDetailsRequest;
import com.example.howtodoinjava.schemas.school.StudentDetailsResponse;

public class StudentDetailsClient extends WebServiceGatewaySupport {

	public StudentDetailsResponse getStudentDetails(String name) {
		StudentDetailsRequest request = new StudentDetailsRequest();
		request.setName(name);
		StudentDetailsResponse response = (StudentDetailsResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/service/student-details", request);
		return response;
	}
}
