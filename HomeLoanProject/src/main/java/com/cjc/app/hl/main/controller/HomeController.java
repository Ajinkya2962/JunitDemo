package com.cjc.app.hl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.hl.main.model.Address;
import com.cjc.app.hl.main.model.CustomerDetails;
import com.cjc.app.hl.main.model.Local;
import com.cjc.app.hl.main.model.Permanent;
import com.cjc.app.hl.main.model.PropertyAddress;
import com.cjc.app.hl.main.model.PropertyInfo;
import com.cjc.app.hl.main.responseclass.ResponseMessage;
import com.cjc.app.hl.main.service.HomeService;


@CrossOrigin("*")
@RestController
public class HomeController 
{
	 
		@Autowired
		HomeService hs;
		@Autowired
		JavaMailSender js;
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody List<CustomerDetails> cd)
//		{
//			hs.insert(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		
		@PostMapping("/post")
		public ResponseEntity<ResponseMessage> postData(@RequestBody CustomerDetails cd)
		{
//			System.out.println(cd);
			hs.insertData(cd);
			
			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
		}
		@GetMapping("/get")
		public List<CustomerDetails> getAll()
		{
			List<CustomerDetails> list =hs.getData();			
		     return list;			
		}
		@GetMapping("/get/{cusId}")
		public CustomerDetails getsingle(@PathVariable("cusId") int id)
		{
			 CustomerDetails cd=hs.getSingleData(id);			
		     return cd;			
		}

		@DeleteMapping("/delete/{cusId}")
		public ResponseEntity<ResponseMessage>delete(@PathVariable("cusId")int id)
		{
				hs.deleteData(id);
			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data deleted successfully"),HttpStatus.NO_CONTENT);
			
		}
		@PutMapping("/put/{cusId}")
		public CustomerDetails putData(@RequestBody CustomerDetails cd,@PathVariable("cusId")int id)
		{
			CustomerDetails cdd=hs.insert(cd);
			return cdd;
		}
		
//		@GetMapping("/getemail")
//		public String postemail()
//		{
//			SimpleMailMessage m =new SimpleMailMessage();
//			m.setTo("poojakherdikar@gmail.com");
//			m.setCc("javaangularcjc@gmail.com");
//			m.setSubject("Test mail");
//			m.setText("CJC mail sender check");
//			js.send(m);
//			return " mail sent successfully";
//		}

		
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody PropertyInfo cd)
//		{
//			hs.insertData(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		@GetMapping("/get")
//		public ResponseEntity<ResponseMessage>getAll()
//		{
//			List <PropertyInfo> ld=hs.getData();
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data fetched successfully"),HttpStatus.OK);
//			
//		}
		
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody PropertyAddress cd)
//		{
//			hs.insertData(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		@GetMapping("/get")
//		public ResponseEntity<ResponseMessage>getAll()
//		{
//			List <PropertyAddress> ld=hs.getData();
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data fetched successfully"),HttpStatus.OK);
//			
//		}
		
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody   Address cd)
//		{
//			hs.insertData(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		@GetMapping("/get")
//		public ResponseEntity<ResponseMessage>getAll()
//		{
//			List <Address> ld=hs.getData();
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data fetched successfully"),HttpStatus.OK);
//			
//		}
		
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody   Permanent cd)
//		{
//			hs.insertData(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		@GetMapping("/get")
//		public ResponseEntity<ResponseMessage>getAll()
//		{
//			List <Permanent> ld=hs.getData();
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data fetched successfully"),HttpStatus.OK);
//			
//		}
		
//		@PostMapping("/post")
//		public ResponseEntity<ResponseMessage> postData(@RequestBody   Local cd)
//		{
//			hs.insertData(cd);
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data saved successfully"),HttpStatus.CREATED);
//		}
//		@GetMapping("/get")
//		public ResponseEntity<ResponseMessage>getAll()
//		{
//			List <Local> ld=hs.getData();
//			return new ResponseEntity<ResponseMessage>(new ResponseMessage("Data fetched successfully"),HttpStatus.OK);
//			
//		}
//





		
		
}
