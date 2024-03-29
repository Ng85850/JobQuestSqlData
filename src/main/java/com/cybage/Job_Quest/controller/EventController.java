package com.cybage.Job_Quest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.Job_Quest.Service.EventService;
import com.cybage.Job_Quest.model.Event;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;



	@RequestMapping(value = "/EventsAddButton")
	public ModelAndView addEventsToSql() {

		Event event1 = new Event("#DS Code Quest ", null, "3D_Quest_Banner.jpg", "Dassault", "JS", "6 Feb, 12:00", 462,
				"You have dreams? You enjoy a challenge? Here at Dassault Systèmes, we empower people and energize passion to change the world and create the future. Let’s open new horizons together with the power of 3DEXPERIENCE virtual universes!Give power to your passion! Find the job you love at 3DS! Shape your career with 3DS!",
				"You need to attempt and submit the contest within 90 minutes.In the case of any code plagiarism, both the contestants will be disqualified from the contest.Dassault Systemes decision will be final.",
				"Title: ENOVA Application Developer (JavaScript)In our ENOVIA India organization, we are looking for a strongly motivated Application Developer who will have a fundamental role in enabling business and industry innovators to collaboratively build and execute a successful plan, transforming market opportunities into marketplace advantages. You will work closely with the Product Development Managers taking an active role in defining specifications, software architecture and design. You will also collaborate with stakeholders to resolve dependencies, breakdown work, develop and contribute to functional and performance tests. ENOVIA is the World's leading solution for product development and social Collaboration. It is used by leading organizations in multiple industries to develop the products we see and use in our everyday lives.",
				"Our business is innovation. Thanks to the 3DEXPERIENCE platform, we provide software solutions that allow customers to create innovative new products and services using virtual experiences. Our aim is to build a new development model to address the major challenges facing the world today. We have 290,000 customers and 25 million users across 11 industries worldwide. Our customers range from major accounts to startups and governments, as well as individual users. We provide solutions for all sectors of the economy, from mass retail to high-tech.",
				4.1, "8047106630", "1981 (43 yrs old)", "10001-50000", "Software Product");

		Event event2 = new Event("How to command high salaries as a software engineer.", null,
				"How_to_command_high_salaries_as_a_software_engineer_Banner.png", "Coding Ninjas",
				"Microsoft, Oracle, PayPal.", "23 Feb, 19:00", 29,
				"If you aspire to command high salaries as a Software Engineer, you're in the right place! We're thrilled to extend an invitation to our upcoming masterclass where you can gain invaluable insights from seasoned professionals. Pranav Malik, will share expertise gained from his roles at Microsoft, Oracle, PayPal. He'll guide you on choosing winning project ideas to confirm your SDE interview shortlist and enhance your overall career prospects. ",
				"Pranav is an SDE-2 at Microsoft. As a devoted mentor, he empowers students with data structures, algorithms, and tech insights, fostering supportive learning environments. With his wealth of experience in the tech industry, he will provide expert guidance, practical tips, and strategies to help you navigate the challenging interview process with confidence.",
				"- What skills do top companies like Microsoft seek? - How to prepare and excel in these sought-after skills?- Strategies to demonstrate your expertise effectively Don't miss out on this invaluable opportunity. Join us on 23rd February, 2024, Friday from 7-8 PM !Register now to secure your spot. Limited availability.We look forward to seeing you ",
				"Coding Ninjas is one of the largest online coding EdTech companies in India, founded in 2016. Founded by Ankush Singla, Kannu Mittal, and Dhawal Parate, with IIT and Stanford background, and experience working in Amazon, Facebook, Cars24, and other top startups in India. As pioneers in EdTech, Coding Ninjas is on its path to becoming the de facto coding education company in India for college students. With a focus on teaching programming courses to college students. At Coding Ninjas, our focus is on creating industry-relevant programs and crafting learning experiences that help candidates learn, apply, and demonstrate capabilities in the software development areas. The company has raised more than 22 Million to date and is a subsidiary of Info Edge (naukri.com, iimjobs.com, and others).",
				4.2, "8678578669", "2016(8 yrs)", "51-200", "e-Learning / EdTech");

		Event event3 = new Event("3DS Code Quest - Development Engineer (C++)", null, "3DS_Code_Quest_1_banner.jpg",
				"DASSAULT SYSTEMES", "C++ ", "26 Feb, 12:00", 119,
				"You have dreams? You enjoy a challenge? Here at Dassault Systèmes, we empower people and energize passion to change the world and create the future. Let’s open new horizons together with the power of 3DEXPERIENCE virtual universes! Give power to your passion! Find the job you love at 3DS! Shape your career with 3DS!",
				"You need to attempt and submit the contest within 90 minutes.In the case of any code plagiarism, both the contestants will be disqualified from the contest.Dassault Systemes decision will be final.",
				"On the basis of your performance in this 3DS Code Quest - Development Engineer (C++) Contest, you will be shortlisted for the Technical Interview Round with DASSAULT SYSTEMES for the following role:				Title: R&D Development Engineer (C++)We are seeking an experienced resource with C++ Development experience Join us in developing the world’s leading solution provider for Product Design and experience across Industries",
				"Our business is innovation. Thanks to the 3DEXPERIENCE platform, we provide software solutions that allow customers to create innovative new products and services using virtual experiences. Our aim is to build a new development model to address the major challenges facing the world today. We have 290,000 customers and 25 million users across 11 industries worldwide. Our customers range from major accounts to startups and governments, as well as individual users. We provide solutions for all sectors of the economy, from mass retail to high-tech.",
				4.1, "8047106630", "1981 (43 yrs old)", "10001-50000", "Software Product");

		Event event4 = new Event("CodeQuest: SQL and .Net Hiring Challenge", null,
				"CodeQuest_SQL_and _Net_Hiring_Challenge_Banner.png", "NOTIFIED DM INDIA", ".NET", "17 Feb, 08:00", 86,
				"Exciting job opportunity in Bangalore, India for a .Net Software Engineer to work on our Public Relations platform. If you have a passion for coding, strong communication skills and a track record of developing multi-user applications than this is a great role for you. Role is hybrid and will require in-person collaboration in the Bangalore office 3 days a week and 2 remote days. Hiring process: 1. Register on DoSelect for CodeQuest: SQL and .Net Hiring Challenge. 2. Take an Online assessment 3. Interview",
				"This is an online contest. You'll get 60 minutes to complete this.Please make sure that you are using the latest version of the browser. We recommend using Google Chrome. It's mandatory to disable all the browser extensions and enabled Add-ons or open the assessment in incognito mode.If you are solving a coding problem, you will either be required to choose a programming language from the options that have been enabled by the administrator or choose your preferred programming language in case no options have been enabled by the administrator. Note: In case you're solving coding problems: All inputs are from STDIN and output to STDOUT. Best wishes from Notified!",
				"Experience in developing enterprise scale, multi-user applications. Solid understanding of designing and optimizing WebAPIs for large usage Experience in MVC.Net web-based application development using.NET Framework and C# Dependency Injection Object-Relational Mapping IIS hosting SQL Server, schema creation, query optimization Experience in serverless architecture, design and development using AWS services.Nice to have experience in SOLR.",
				"Notified is the world&rsquo;s only communications platform for public relations, investor relations, and event experiences to drive meaningful insights and outcomes.<br /><br />We work with more than 10,000+ global customers, from growing businesses and new IPOs to some of the world&rsquo;s most recognizable brands. With our suite of world-class, award-winning communications solutions, we provide everything you need to effectively reach and engage your customers, investors, employees, and the media.",
				3.9, "8775468945", "1991 (33 yrs) ", "500-1000", "Engineering & Construction");

		Event event5 = new Event("Gain skills to break into Data/Business Analytic roles.", null,
				"Gain_skills_to_break_into_Business_Analytic_roles_Banner.png", "Coding Ninjas", "business analysis",
				"21 Feb, 19:00", 123,
				"Are you eager to embark on an exciting journey into the dynamic world of data and business analysis, but unsure of skills required? If so, we have an incredible opportunity for you!Session by Alka Pandey, Manager Data Scientist at leading FMCG 'Unilever'. She will share key strategies & tips and invaluable insights on transitioning into the world of Data or Business Analysis for Non-technical professionals.",
				"Alka Pandey is one of India's Top 10 Data Scientists, a renowned speaker, mentor, analytics trainer, coach, and published author. With over 9 years of experience and a postgraduate degree from the prestigious IIM Bangalore, Alka is a true expert.",
				"Understand the essential skills and competencies required for a successful transition.Learn how to leverage your existing experience and expertise to excel in a data or business analysis role.Gain insights into the latest trends, technologies, and best practices in the field of data analysis.Receive personalised guidance and advice from the speaker .Live Q&A with the expert.Don't miss out on this invaluable opportunity. Join us on 21st February, 2024, Wednesday from 7-8 PM ! Register now to secure your spot. Limited availability.We look forward to seeing you",
				"Coding Ninjas is one of the largest online coding EdTech companies in India, founded in 2016. Founded by Ankush Singla, Kannu Mittal, and Dhawal Parate, with IIT and Stanford background, and experience working in Amazon, Facebook, Cars24, and other top startups in India. As pioneers in EdTech, Coding Ninjas is on its path to becoming the de facto coding education company in India for college students. With a focus on teaching programming courses to college students. At Coding Ninjas, our focus is on creating industry-relevant programs and crafting learning experiences that help candidates learn, apply, and demonstrate capabilities in the software development areas. The company has raised more than 22 Million to date and is a subsidiary of Info Edge (naukri.com, iimjobs.com, and others).",
				4.2, "8678578669", "2016 (8 yrs)", "51-200", "e-Learning / EdTech");

		Event event6 = new Event("How google map predicts shortest path? Learn from a Google SDE", null,
				"How_google_map_predicts_Banner.png", "Coding Ninjas", "Google Maps' shortest path prediction",
				"19 Feb, 19:00", 83,
				"Discover the magic behind Google Maps' shortest path predictions with seasoned Google Software Engineer, Saurav Prateek. Uncover the world of global navigation in a captivating masterclass.",
				"Saurav, is an SDE 2 at Google. He has been has developing cutting-edge solutions for Google. He is a seasoned mentor, whose guidance has helped several individuals land their dream tech job. His insights on shortest path prediction will be invaluable to all attendees.",
				"Introduction to Google Maps: Understanding the importance of navigation and mapping in the modern world.- The Science Behind Routing: Explore the algorithms and techniques that power Google Maps' route calculations.- Real-World Applications: Discover how these routing algorithms are used in various everyday scenarios.- Challenges and Innovations: Learn about the challenges faced by Google Maps and how they are",
				"Coding Ninjas is one of the largest online coding EdTech companies in India, founded in 2016. Founded by Ankush Singla, Kannu Mittal, and Dhawal Parate, with IIT and Stanford background, and experience working in Amazon, Facebook, Cars24, and other top startups in India. As pioneers in EdTech, Coding Ninjas is on its path to becoming the de facto coding education company in India for college students. With a focus on teaching programming courses to college students. At Coding Ninjas, our focus is on creating industry-relevant programs and crafting learning experiences that help candidates learn, apply, and demonstrate capabilities in the software development areas. The company has raised more than 22 Million to date and is a subsidiary of Info Edge (naukri.com, iimjobs.com, and others).",
				4.2, "8678578669", "2016 (8 yrs)", "51-200", "e-Learning / EdTech");

		Event event7 = new Event("3DS Code Quest - Development Engineer (Java)", null, "3DS_Code_Quest_banner.jpg",
				"DASSAULT SYSTEMES", "java", "26 Feb, 12:00", 575,
				"You have dreams? You enjoy a challenge? Here at Dassault Systèmes, we empower people and energize passion to change the world and create the future. Let’s open new horizons together with the power of 3DEXPERIENCE virtual universes!Give power to your passion! Find the job you love at 3DS! Shape your career with 3DS!",
				"You need to attempt and submit the contest within 90 minutes.In the case of any code plagiarism, both the contestants will be disqualified from the contest.Dassault Systemes decision will be final.",
				"On the basis of your performance in this [HAKCATHON NAME] activity, you will be shortlisted for the Technical Interview Round with DASSAULT SYSTEMES for the following role:Title: ENOVA Application Developer (Java) In our ENOVIA India organization, we are looking for a strongly motivated Application Developer who will have a fundamental role in enabling business and industry innovators to collaboratively build and execute a successful plan, transforming market opportunities into marketplace advantages. You will work closely with the Product Development Managers taking an active role in defining specifications, software architecture and design",
				"Our business is innovation. Thanks to the 3DEXPERIENCE platform, we provide software solutions that allow customers to create innovative new products and services using virtual experiences. Our aim is to build a new development model to address the major challenges facing the world today. We have 290,000 customers and 25 million users across 11 industries worldwide. Our customers range from major accounts to startups and governments, as well as individual users. We provide solutions for all sectors of the economy, from mass retail to high-tech.",
				4.1, "8047106630", "1981 (43 yrs)", "10001- 50000", "Software Product");


		List<Event> eventList = new ArrayList<>();
		eventList.add(event1);
		eventList.add(event2);
		eventList.add(event3);
		eventList.add(event4);
		eventList.add(event5);
		eventList.add(event6);
		eventList.add(event7);
		

		for (Event eve : eventList) {
			eventService.saveEvents(eve);
		}

		return new ModelAndView("SingleJob");

	}

}
