package com.example.studentsconnect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsConnectApplication
{
	@Value(
			"server_value"
	)
	static String serverValue;

	public static void main(String[] args)
	{
		SpringApplication.run(StudentsConnectApplication.class, args);
//		System.out.println(serverValue);
	}

}
