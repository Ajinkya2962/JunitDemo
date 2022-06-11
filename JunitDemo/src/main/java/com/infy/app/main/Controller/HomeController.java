package com.infy.app.main.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public List<?> getData()
	{
		return new ArrayList<>();
	}
	public String postData()	
	{
		return "Pooja";
	}
	
	
}
