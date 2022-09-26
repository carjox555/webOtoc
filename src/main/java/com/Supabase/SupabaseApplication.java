package com.Supabase;

import com.Supabase.Entity.Empleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupabaseApplication.class, args);

		Empleado emp1 =new Empleado("carlos","jox@dd","joxEntresprise","administrador",null);

	}
}