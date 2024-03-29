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

import com.cybage.Job_Quest.Service.JobDetailsService;
import com.cybage.Job_Quest.model.JobDetail;

@Controller
public class JobDetailController {

	@Autowired
	private JobDetailsService jobDetailsService;

//	@RequestMapping(value = "/JobDetailsController")
//	public ModelAndView appliedJob(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws IOException {
//		JobDetail jobDetail = new JobDetail();
//
//		model.addAttribute("jobDetailinfo", jobDetail);
//		return new ModelAndView("JobDetailsForm");
//	}
//
//	@RequestMapping(value = "/processJobForm")
//	public ModelAndView hkuhuih(@ModelAttribute("jobDetailinfo")JobDetail jobDetail) {
//		jobDetailsService.saveJobDetails(jobDetail);		
//		return new ModelAndView("home");
//		
//	}

	@RequestMapping(value = "/JOBAddButton")
	public ModelAndView addJobs() {

		JobDetail jobDetail1 = new JobDetail("Store Manager", "4 to 8",
				"Thane,Maharashtra, Pune,Maharashtra, Mumbai (All Areas)", "2 days ago", 37,
				"Title: Store Manager-Retail-Exp(4-8 years)-MaharashtraReporting to: Area Operations ManagerSkip Level: City/Zonal Manager Location: Mumbai,Pune,Thane",
				"Territory Sales Manager", "Film / Music / Entertainment", "Sales & Business Development",
				"Full Time, Permanent", "Retail & B2C Sales", "Any Graduate",
				"Revenue Generation, Leadership, Customer Satisfaction", 4, 5, "WFO", "Remote", 8);

		JobDetail jobDetail2 = new JobDetail("Customer Care Executive", "0 to 5", "Delhi/NCR", "2 days ago", 665,
				"Founded in 2010, By an ex-Microsoft 'techie' with no money but truckloads of relentless passion to make a difference in this world, Lenskart is one of the fastest growing eyewear businesses today.Peyush along with his two co-founders Amit Chaudhary and Sumeet Kapahi founded 'VALYOO technologies'. The aim was to truly add 'valyoo' in customers' lives by eliminating the retailers, setting up our own high quality manufacturing and supplying directly to the consumer. With this, they not only cut costs, but also delivered high quality standards, supported with in house robotic lens manufacturing and assembly ensuring 100% precision and top quality control.With a rapidly growing business reaching out to over 1,00,000 customers a month via a unique combination of a strong online business and uniquely designed physical stores, Lenskart is revolutionizing the eyewear industry.With a rapidly growing business reaching out to over 1,00,000 customers a month via a unique combination of a strong online business and uniquely designed physical stores, Lenskart is revolutionizing the eyewear industry.",
				"Customer Retention - Voice / Blended", "BPO / Call Centre", "Customer Success, Service & Operations",
				"Full Time, Permanent", "Voice / Blended", "Any Graduate",
				"Inbound Process, Customer Service, Voice Process, Customer Complaints, Customer Queries", 3, 4, "WFO",
				"MNC", 8);

		JobDetail jobDetail3 = new JobDetail("SDE", "3 to 6",
				"Hyderabad/Secunderabad, Gurgaon/Gurugram, Bangalore/Bengaluru", "30+ days ago", 77,
				"Translation of complex functional requirements into technical requirements, implementing and maintaining a coherent and progressive development strategy for our product line Design, develop and maintain complex systems using best of the breed development practices and technology.Responsible for the over-all software development life cycle. Delivery of High Quality, Scalable and Extensible systems and applications on-time and on-budget.Adoption and Evolution of the software engineering practices and tools within the organization Keep in sync with the latest technology developments and open source offerings. Evaluate and adopt them for solving business problem of organization.",
				"Back End Developer", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Software Development", "Any Graduate", "Software design, SOA, Database design, MySQL, Debugging", 10,
				15, "Hybrid", "HR", 8);

		JobDetail jobDetail4 = new JobDetail("Business Development", " 2 to 5",
				"Srinagar, Kolkata, Mumbai, Vijayawada, Visakhapatnam, Dehradun, Hyderabad/Secunderabad, Haldwani, Pune, Agra, Coimbatore, Bangalore/Bengaluru",
				"30+ days ago", 682,
				"Responsible for identifying suitable commercial retail properties for opening new Lenskart stores intheir respective region.Retail property search management, coordinating with key partners like property developers,landlords, project consultants, property brokers.Location Catchment Analysis of New Store Locations Negotiating, acquiring and finalizing new properties. Negotiating final rentals, Landlord Scope of Works etc.Liaising legal due diligence and paperwork involved in signing acquiring.Coordination with various department internally till store launch.Develop and maintain a pipeline of growth opportunities, both organic growth and acquisitions.",
				": Real Estate Consultant / Agent", "Internet", "Sales & Business Development", "Full Time, Permanent",
				"Retail & B2C Sales", "Any Graduate",
				"Retail, Due diligence, Business Development, ManagerAnalytical,Legal,Management, Powerpoint", 7, 10,
				"Hybrid", "Project Management", 8);

		JobDetail jobDetail5 = new JobDetail("SDE", "1 to 4", "Bangalore/Bengaluru", "30+ days ago", 338,
				"Uber is looking for Senior Software Engineer to join our dynamic team and embark on a rewarding career journey. Develop high-quality software design and architecture Identify, prioritize and execute tasks in the software development life cycle Develop tools and applications by producing clean, efficient code Automate tasks through appropriate tools and scripting Review and debug code Perform validation and verification testing Collaborate with internal teams and vendors to fix and improve products Document development phases and monitor systems Ensure software is up-to-date with latest technologies Serve as a technical lead contributing to and directing the efforts of development teams, including internal and external team members.",
				"Software Development - Other", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Software Development", "Any Graduate",
				"Training, Software design, Staffing, Software development, life cycle, Packaging", 8, 16, "Hybrid",
				"Fortune 500", 9);

		JobDetail jobDetail6 = new JobDetail("Senior Data Engineer", "1 to 5", "Bangalore/Bengaluru", "4 days ago", 145,
				"We are looking for a Senior Data Engineer to join our Platform Team. The team is responsible for ensuring all access is monitored, governed, and compliant with regulatory mandates, managing security risk while enabling business agility. Youll work on advancing our foundational data security capabilities by building easily portable systems to reduce security and regulatory risk and develop systems to enforce the least privilege principle.",
				"Data Engineer", "Internet", "Data Science & Analytics", "Full Time, Permanent",
				"Data Science & Machine Learning", "Any Graduate",
				"C++, Backend, data science, data security, Business strategy, Operations, Object oriented programming",
				10, 12, "Hybrid", "Engineering", 9);

		JobDetail jobDetail7 = new JobDetail("Automation Analyst", "2 to 3", "Hyderabad/Secunderabad", "17 days ago",
				368,
				"The candidate will work with a team of developers to create, maintain, and automate processes to assist regional, and global operationsThe role would require large collaboration with other team members and stakeholders The candidate needs to be a big-picture thinker and strategic partner They also need to demonstrate analytical thinking through data-driven decisions and possess the technical know-how, fascination, and ability to work with your team to make a big impact",
				"Test Analyst", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Quality Assurance and Testing", "Any Graduate",
				"GIT, Coding, data manipulation, Analytical, Postgresql, Javascript, JSON, JIRA, SQL", 6, 8, "Hybrid",
				"MNC", 9);

		JobDetail jobDetail8 = new JobDetail("Senior Manager", "5 to 10 ", "Bangalore/Bengaluru", "30+ days ago", 66,
				"Leads, mentors, and manages engineering teams to continually improve the security posture of Uber s services and infrastructure Sets organizational direction by identifying technical priorities and opportunities, managing expectations, and considering tradeoffs Models relationship-building and encourages trust across organizations, and consults with relevant stakeholders when making decisions in ambiguous environments Empowers delivery by forming actionable plans, allocating responsibilities, and maintaining productivity across engineering teams with well-defined goals and metrics",
				"Principal Program Manager", "Internet", "Project & Program Management", "Full Time, Permanent",
				"Technology / IT", "Any Graduate",
				"Interpersonal skills, Operational excellence, Performance management, Engineering management", 20, 24,
				"WFO", "Remote", 9);

		JobDetail jobDetail9 = new JobDetail("SDE", "0 to 2 ", "Gurgaon/Gurugram", "30+ days ago", 123243,
				"Prior experience with a significant consumer-facing website or service Full-cycle PHP code development experience including debugging and performance analysis Experience in working with MySQL database and analyzing the efficiency of queries Worked with real time web applications and event driven architectures like Node.js or jQuery Experience with NoSQL and distributed database like Cassandra or Redis Building scalable and performance oriented services with caching techniques and systems like Memcache",
				"Full Stack Developer", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Software Development", "Any Graduate",
				"Backend, jQuery, Database design, MySQL, Debugging, PHP, Data structures, Apache", 13, 15, "WFH",
				"Software & Development", 10);

		JobDetail jobDetail10 = new JobDetail("Store Manager", "1 to 5",
				"Hyderabad,Telangana( Somajiguda, Malkajgiri, Zamistanpur, Shaikpet, Banjara hills, Sainikpuri, Padma Rao nagar, Kothaguda, Kokapet, Bowenpally )",
				"18 days ago", 1239,
				"Manage all operations related to ES (Express Stores) for Blinkit in the designated region/location - full ownership of the express stores operational SLA and metrics. Lead all aspects of express stores operations including but not limited to inbound, inventory, last mile operations, manpower management, rostering and training. Ensure implementation and adherence to all SOPs as part of express stores operations.Performance monitoring and collaborating with operation teams on operational/customer experience metrics, including root cause analysis of problems and planning corrective actions.Lead, manage, and motivate a full express stores team within a time-sensitive and demanding operational environment.",
				"SCM & Logistics - Other", "Internet (E-Commerce)", "Procurement & Supply Chain",
				"Full Time, Permanent", "SCM & Logistics", "Any Graduate",
				"Inventory Management, Inbound Logistics, Store Operations, Outbound Logistics", 2.75, 5, "WFO",
				"Engineering", 10);

		JobDetail jobDetail11 = new JobDetail("Customer Care Executive", " 0 to 5", "Gurgaon/Gurugram", "Few Hours Ago",
				10,
				"Hiring For Telecom Chat Process Grad Fresher 20K U/G & BE, Btech 6 Months exp with International BpO Must 20K & UG /BE/Btech/ Grad with 1 year Exp Customer Service Any Domain 24K 5 Day Call-Dipankar@9650094552 Email@ jobsatsmartsource@gmail.com",
				"Non Voice - Other", "BPO / Call Centre", "Customer Success, Service & Operations",
				"Full Time, Permanent", "Non Voice", "Graduation Not Required",
				"Content Writer, Outbound, Voice Support, Creative Writing, Convergys", 1, 3.5, "WFO", "Analytics", 10);

		JobDetail jobDetail12 = new JobDetail("Accounts Manager", "0 to 4",
				"Jalandhar,Punjab, Ludhiana,Punjab, Amritsar,Punjab", "18 days ago", 133,
				"As a Key Accounts Manager, you will work with a portfolio of our restaurant partners and help create a healthy long term food delivery ecosystem in India.What purpose would you 'serve' Onboard new eateries on Zomato. Could be anything - from a high-end restaurant to a neighbourhood joint. This would involve excellent sales, negotiation and revenue generation skills Engage with a set of restaurant partners on field and help them with any & everything that involves running a restaurant. This would require good relationship management and communication skills Take a data-driven approach to assist your restaurant partners in their growth journey Work with cross-functional teams to ensure our restaurant partners have the best possible experiences",
				"Key Account Manager", "Internet (E-Commerce)", "Sales & Business Development", "Full Time, Permanent",
				"Enterprise & B2B Sales", "Any Graduate",
				"Sales, Relationship Management, Data Management, Business Development, Data Analytics", 2, 4, "WFH",
				"MNC", 10);

		JobDetail jobDetail13 = new JobDetail("Store Manager", "1 to 6", "Bengaluru,Karnataka", "5 days ago", 864,
				"Recommend and advise on best practices of picking and packing to improve Cx experience. Advise partner stores on mechanisms/ processes leading to correct picking/ packing/ billing of Cx orders using appropriate tools and dashboards. Guide partners on proper usage of dashboards and other portals to prevent any inaccuracies leading to Cx impact.Assess the quality of Pods on cleanliness, hygiene and DE issues and suggest measures to enhance smooth Ops leading to better Cx experience.",
				"Retail Store Manager", "Retail", "Merchandising, Retail & eCommerce", "Full Time, Permanent",
				"Retail Store Operations", "Any Graduate",
				"Team Handling , FMCG,  Sales, Branch Handling, FMCG Operations", 3.5, 5, "WFO", "Fortune 500", 11);

		JobDetail jobDetail14 = new JobDetail("Product Manager", "3 to 7", "Bengaluru,Karnataka", "20 days ago", 192,
				"As the Product Manager 2 at Lynk, you play a pivotal role in overseeing the entire product development life cycle This encompasses a comprehensive array of responsibilities, including user behavior analysis, ideation of impactful features, collaboration with designers to enhance UI/UX, meticulous prioritization of the development pipeline, coordination with QA for rigorous testing, and adept management of product releases Your primary mandate is to translate the companys overarching business vision into a dynamic and finely-tuned product roadmap",
				"Product Manager - Other", "Software Product", "Product Management", "Full Time, Permanent",
				"Product Management - Other", "Any Graduate",
				"Product management, Customer life cycle management, Supply chain management, Google Analytics", 4, 7,
				"Hybrid", "Sales", 11);

		JobDetail jobDetail15 = new JobDetail("Business Development", "0 to 2", "Pune", "Few Hours Ago", 1706,
				"Looking for fresh Technical sales representatives to be responsible for Sales of Electronic security systems/Access Control systems/Biometric systems. To achieve revenue targets as well as other KRA targets are given...",
				"Business Development Executive (BDE)", "IT Services & Consulting", "Sales & Business Development",
				"Full Time, Permanent", "BD / Pre Sales",
				"B.Tech/B.E. in Electronics/Telecommunication, Computers, B.Sc in Computers, Electronics",
				"Marketing Management, Channel Sales, Sales Lead Generation, Presentation Skills", 2.5, 4, "Hybrid",
				"MNC", 11);

		JobDetail jobDetail16 = new JobDetail("Customer Care Executive", " 5 to 10",
				"Kolkata, Mumbai, New Delhi, Hyderabad/Secunderabad, Pune, Chennai, Bangalore/Bengaluru",
				"30+ days ago", 171,
				"Work closely with sales, marketing, product management and others on product messaging and positioningLead cross-functional teams to launch and promote our ITSM products and solutions Define ideal customer profiles, target personas and value propositions for relevant market segments Develop and execute GTM programs and integrated marketing campaigns that drive demand Create thought leadership content, including web sites, white papers, webinars, emails, presentations, press releases, customer case studies and product videos Develop sales enablement tools, including training, battle cards, playbooks and value messaging guides",
				"Brand Management", "IT Services & Consulting", "Marketing & Communication", "Full Time, Permanent",
				"Marketing", "Any Graduate", "Product management, Integrated marketing, GIT, PDF, Web technologies", 3,
				5, "Hybrid", "Engineering", 11);

		JobDetail jobDetail17 = new JobDetail("Sales Manager", "2 to 6", "New Delhi, Mandi", "25 days ago", 401,
				"* Fulfilling sales charters for cities based upon agreed targets, andpromoting the organizations presence * Sign Contracts with restaurants and handle inquiries from existing and new clients * Gather sales lead from the market and approach restaurants actively for conversion",
				"Zonal Sales Manager (B2C)", "Software Product", "Sales & Business Development", "Full Time, Permanent",
				"Retail & B2C Sales", "Any Graduate",
				"Basic, SalesLead, Relationship, E-commerce, MS Office, Investment", 4, 7, "WFO", "Remote", 11);

		JobDetail jobDetail18 = new JobDetail("SDE", "7 to 12",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "5 days ago", 37,
				"A bachelor's degree in computer science, software engineering, a related field or equivalent relevant experience.Hands-on experience in front end application development using Angular, Type Script, Bootstrap, JSF, JavaScript and back end application development using Core Java, Java EE, Spring, REST Webservices, Microservices. Have strong understanding of Microservices, SOLID principles and software development lifecycle (SDLC).In-Depth knowledge of various Enterprise Integration patterns.Hand-on experience with AWS Cloud Infrastructure in code services Cloudformation, CDK, SAM etc.",
				"Software Development - Other", "Software Product", "Engineering - Software & QA",
				"Full Time, Permanent", "Software Development", "B.Tech/B.E. in Any Specialization",
				"core java, aws, Api Gateway, Aws Cloud, Design Patterns", 9, 19, " Hybrid", "Project Management", 12);

		JobDetail jobDetail19 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach.Generate HL/BL/LAP leads from open market and through different channels Maintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				1, 5, " Hybrid", "HR", 12);

		JobDetail jobDetail20 = new JobDetail("Mean Stack Developer", "4 to 9", "Pune, Chennai, Remote", "5 days ago",
				362,
				"3+ Years of designing and developing responsive, web application using Angular.Design and implement responsive, user-friendly web interfaces using modern HTML, CSS, andJavaScript frameworks (e.g., Angular).",
				"Other", "IT Services & Consulting", "Software Product", "Full Time, Permanent", "Software Development",
				"Any Graduate", "node js, Healthcare Domain, Angular", 14, 25, " Hybrid", "MNC", 12);

		JobDetail jobDetail21 = new JobDetail("SDE", "5 to 10", "Bangalore/Bengaluru", "7 days ago", 10,
				"We are on a Digital transformation journey at the iconic IKEATo support the digital transformation, operations and monitoring data is core in ensuring transparency and availability of our solutions used by our customers We need a passionate and innovative engineer who loves working in an agile environment, enabling our application performance and synthetic monitoring for integration in our CI/CD tool chain both on-prem, private and public cloudIf you look for a possibility to grow, influence our transition, work in an entrepreneurial and innovative environment, this is your chance",
				"Software Development - Other", "Retail", "Engineering - Software & QA", "Full Time, Permanent",
				"Software Development", "Any Graduate",
				"Automation, Team management, Agile, Business applications, Operations", 6, 8, "WFH", "Analytics", 13);

		JobDetail jobDetail22 = new JobDetail("Customer Care Executive", "5 to 10", "Bangalore/Bengaluru", "7 days ago",
				87,
				"As a person you are passionate about people, business, IKEAs purpose and continuously driving better performance.You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people.For this role we believe you have relevant",
				"Analyst Relations", "Retail", "Marketing & Communication", "Full Time, Permanent",
				"Corporate Communication", "Any Graduate",
				"Online sales, Sales analytics, Business management, SEM, Customer experience", 10, 15, "Hybrid",
				"Remote", 13);

		JobDetail jobDetail23 = new JobDetail("Business Development", "6 to 8", "Hyderabad/Secunderabad", "10 days ago",
				137,
				"As a person you are passionate about people, business, IKEA s purpose and continuously driving better performance. You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have Human Resources background with 6-8 years experience as a Generalist and proven record of developing people and organisations. Experience from a global matrix organisation and/or participating on global projects.",
				"Diversity & Inclusion", "Retail", "Human Resources", "Full Time, Permanent", "HR Operations",
				"Any Graduate", "Relationship management, Trade, Matrix, Relationship, Agile, HR", 7, 9, "WFO ",
				"Sales", 13);

		JobDetail jobDetail24 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach.Generate HL/BL/LAP leads from open market and through different channels Maintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				4, 5, "Hybrid", "MNC", 13);

		JobDetail jobDetail25 = new JobDetail("Product Manager", "3 to 7", "Bengaluru,Karnataka", "20 days ago", 192,
				"As the Product Manager 2 at Lynk, you play a pivotal role in overseeing the entire product development life cycleThis encompasses a comprehensive array of responsibilities, including user behavior analysis, ideation of impactful features, collaboration with designers to enhance UI/UX, meticulous prioritization of the development pipeline, coordination with QA for rigorous testing, and adept management of product releasesYour primary mandate is to translate the companys overarching business vision into a dynamic and finely-tuned product roadmap",
				"Product Manager - Other", "Software Product", "Product Management", "Full Time, Permanent",
				"Product Management - Other", "Any Graduate",
				"Product management, Customer life cycle management, Supply chain management, Google Analytics", 4, 7,
				"Hybrid", "Sales", 13);

		JobDetail jobDetail26 = new JobDetail("Senior Manager", "5 to 10 ", "Bangalore/Bengaluru", "30+ days ago", 66,
				"Leads, mentors, and manages engineering teams to continually improve the security posture of Uber s services and infrastructureSets organizational direction by identifying technical priorities and opportunities, managing expectations, and considering tradeoffsModels relationship-building and encourages trust across organizations, and consults with relevant stakeholders when making decisions in ambiguous environmentsEmpowers delivery by forming actionable plans, allocating responsibilities, and maintaining productivity across engineering teams with well-defined goals and metrics",
				"Principal Program Manager", "Internet", "Project & Program Management", "Full Time, Permanent",
				"Technology / IT", "Any Graduate",
				"Interpersonal skills, Operational excellence, Performance management, Engineering management", 20, 24,
				"WFO", "Software & Development", 14);

		JobDetail jobDetail27 = new JobDetail("Business Development", "6 to 8", "Hyderabad/Secunderabad", "10 days ago",
				137,
				"As a person you are passionate about people, business, IKEA s purpose and continuously driving better performance. You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have Human Resources background with 6-8 years experience as a Generalist and proven record of developing people and organisations. Experience from a global matrix organisation and/or participating on global projects.",
				"Diversity & Inclusion", "Retail", "Human Resources", "Full Time, Permanent", "HR Operations",
				"Any Graduate", "Relationship management, Trade, Matrix, Relationship, Agile, HR", 7, 9, "WFO ",
				"Engineering", 14);

		JobDetail jobDetail28 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach.Generate HL/BL/LAP leads from open market and through different channelsMaintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				4, 5, " Hybrid", "MNC", 14);

		JobDetail jobDetail29 = new JobDetail("Customer Care Executive", " 5 to 10",
				"Kolkata, Mumbai, New Delhi, Hyderabad/Secunderabad, Pune, Chennai, Bangalore/Bengaluru",
				"30+ days ago", 171,
				"Work closely with sales, marketing, product management and others on product messaging and positioningLead cross-functional teams to launch and promote our ITSM products and solutions Define ideal customer profiles, target personas and value propositions for relevant market segmentsDevelop and execute GTM programs and integrated marketing campaigns that drive demandCreate thought leadership content, including web sites, white papers, webinars, emails, presentations, press releases, customer case studies and product videosDevelop sales enablement tools, including training, battle cards, playbooks and value messaging guides",
				"Brand Management", "IT Services & Consulting", "Marketing & Communication", "Full Time, Permanent",
				"Marketing", "Any Graduate", "Product management, Integrated marketing, GIT, PDF, Web technologies", 3,
				5, "Hybrid", "Remote", 14);

		JobDetail jobDetail30 = new JobDetail("Automation Analyst", "2 to 3", "Hyderabad/Secunderabad", "17 days ago",
				368,
				"The candidate will work with a team of developers to create, maintain, and automate processes to assist regional, and global operationsThe role would require large collaboration with other team members and stakeholders The candidate needs to be a big-picture thinker and strategic partner They also need to demonstrate analytical thinking through data-driven decisions and possess the technical know-how, fascination, and ability to work with your team to make a big impact",
				"Test Analyst", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Quality Assurance and Testing", "Any Graduate",
				"GIT, Coding, data manipulation, Analytical, Postgresql, Javascript, JSON, JIRA, SQL", 6, 8, "Hybrid",
				"Project Management", 14);

		JobDetail jobDetail31 = new JobDetail("SDE", "7 to 12",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "5 days ago", 37,
				"A bachelor's degree in computer science, software engineering, a related field or equivalent relevant experience.Hands-on experience in front end application development using Angular, Type Script, Bootstrap, JSF, JavaScript and back end application development using Core Java, Java EE, Spring, REST Webservices, Microservices.Have strong understanding of Microservices, SOLID principles and software development lifecycle (SDLC).In-Depth knowledge of various Enterprise Integration patterns. Hand-on experience with AWS Cloud Infrastructure in code services Cloudformation, CDK, SAM etc.",
				"Software Development - Other", "Software Product", "Engineering - Software & QA",
				"Full Time, Permanent", "Software Development", "B.Tech/B.E. in Any Specialization",
				"core java, aws, Api Gateway, Aws Cloud, Design Patterns", 9, 19, "Hybrid", "MNC", 15);

		JobDetail jobDetail32 = new JobDetail("Store Manager", "1 to 5",
				"Hyderabad,Telangana( Somajiguda, Malkajgiri, Zamistanpur, Shaikpet, Banjara hills, Sainikpuri, Padma Rao nagar, Kothaguda, Kokapet, Bowenpally )",
				"18 days ago", 1239,
				"Manage all operations related to ES (Express Stores) for Blinkit in the designated region/location - full ownership of the express stores operational SLA and metrics.Lead all aspects of express stores operations including but not limited to inbound, inventory, last mile operations, manpower management, rostering and training.Ensure implementation and adherence to all SOPs as part of express stores operations.Performance monitoring and collaborating with operation teams on operational/customer experience metrics, including root cause analysis of problems and planning corrective actions.Lead, manage, and motivate a full express stores team within a time-sensitive and demanding operational environment.",
				"SCM & Logistics - Other", "Internet (E-Commerce)", "Procurement & Supply Chain",
				"Full Time, Permanent", "SCM & Logistics", "Any Graduate",
				"Inventory Management, Inbound Logistics, Store Operations, Outbound Logistics", 2.75, 5, "WFO", "HR",
				15);

		JobDetail jobDetail33 = new JobDetail("Customer Care Executive", " 5 to 10",
				"Kolkata, Mumbai, New Delhi, Hyderabad/Secunderabad, Pune, Chennai, Bangalore/Bengaluru",
				"30+ days ago", 171,
				"Work closely with sales, marketing, product management and others on product messaging and positioningLead cross-functional teams to launch and promote our ITSM products and solutions Define ideal customer profiles, target personas and value propositions for relevant market segments Develop and execute GTM programs and integrated marketing campaigns that drive demand Create thought leadership content, including web sites, white papers, webinars, emails, presentations, press releases, customer case studies and product videos Develop sales enablement tools, including training, battle cards, playbooks and value messaging guides",
				"Brand Management", "IT Services & Consulting", "Marketing & Communication", "Full Time, Permanent",
				"Marketing", "Any Graduate", "Product management, Integrated marketing, GIT, PDF, Web technologies", 3,
				5, "Hybrid", "MNC", 15);

		JobDetail jobDetail34 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach. Generate HL/BL/LAP leads from open market and through different channels Maintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				1, 5, " Hybrid", "Fortune 500", 15);

		JobDetail jobDetail35 = new JobDetail("Senior Data Engineer", "1 to 5", "Bangalore/Bengaluru", "4 days ago",
				145,
				"We are looking for a Senior Data Engineer to join our Platform Team. The team is responsible for ensuring all access is monitored, governed, and compliant with regulatory mandates, managing security risk while enabling business agility. Youll work on advancing our foundational data security capabilities by building easily portable systems to reduce security and regulatory risk and develop systems to enforce the least privilege principle.",
				"Data Engineer", "Internet", "Data Science & Analytics", "Full Time, Permanent",
				"Data Science & Machine Learning", "Any Graduate",
				"C++, Backend, data science, data security, Business strategy, Operations, Object oriented programming",
				10, 12, "Hybrid", "Project Management", 15);

		JobDetail jobDetail36 = new JobDetail("Mean Stack Developer", "4 to 9", "Pune, Chennai, Remote", "5 days ago",
				362,
				"3+ Years of designing and developing responsive, web application using Angular.Design and implement responsive, user-friendly web interfaces using modern HTML, CSS, and JavaScript frameworks (e.g., Angular).",
				"Other", "IT Services & Consulting", "Software Product", "Full Time, Permanent", "Software Development",
				"Any Graduate", "node js, Healthcare Domain, Angular", 14, 25, " Hybrid", "Engineering", 16);

		JobDetail jobDetail37 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach. Generate HL/BL/LAP leads from open market and through different channels Maintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				1, 5, " Hybrid", "Sales", 16);

		JobDetail jobDetail38 = new JobDetail("SDE", "7 to 12",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "5 days ago", 37,
				"A bachelor's degree in computer science, software engineering, a related field or equivalent relevant experience.Hands-on experience in front end application development using Angular, Type Script, Bootstrap, JSF, JavaScript and back end application development using Core Java, Java EE, Spring, REST Webservices, Microservices. Have strong understanding of Microservices, SOLID principles and software development lifecycle (SDLC). In-Depth knowledge of various Enterprise Integration patterns. Hand-on experience with AWS Cloud Infrastructure in code services Cloudformation, CDK, SAM etc.",
				"Software Development - Other", "Software Product", "Sales & Business Development",
				"Full Time, Permanent", "Software Development", "B.Tech/B.E. in Any Specialization",
				"core java, aws, Api Gateway, Aws Cloud, Design Patterns", 9, 19, " Hybrid", "MNC", 16);

		JobDetail jobDetail39 = new JobDetail("Senior Manager", "5 to 10", "Bangalore/Bengaluru", "30+ days ago", 66,
				"Leads, mentors, and manages engineering teams to continually improve the security posture of Uber s services and infrastructure Sets organizational direction by identifying technical priorities and opportunities, managing expectations, and considering tradeoffs Models relationship-building and encourages trust across organizations, and consults with relevant stakeholders when making decisions in ambiguous environments Empowers delivery by forming actionable plans, allocating responsibilities, and maintaining productivity across engineering teams with well-defined goals and metrics",
				"Principal Program Manager", "Internet", "Project & Program Management", "Full Time, Permanent",
				"Technology / IT", "Any Graduate",
				"Interpersonal skills, Operational excellence, Performance management, Engineering management", 20, 24,
				"WFO", "Project Management", 16);

		JobDetail jobDetail40 = new JobDetail("Automation Analyst", "2 to 3", "Hyderabad/Secunderabad", "17 days ago",
				368,
				"The candidate will work with a team of developers to create, maintain, and automate processes to assist regional, and global operationsThe role would require large collaboration with other team members and stakeholders The candidate needs to be a big-picture thinker and strategic partner They also need to demonstrate analytical thinking through data-driven decisions and possess the technical know-how, fascination, and ability to work with your team to make a big impact",
				"Test Analyst", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Quality Assurance and Testing", "Any Graduate",
				"GIT, Coding, data manipulation, Analytical, Postgresql, Javascript, JSON, JIRA, SQL", 6, 8, "Hybrid",
				"Software & Development", 16);

		JobDetail jobDetail41 = new JobDetail("Business Development", "6 to 8", "Hyderabad/Secunderabad", "10 days ago",
				137,
				"As a person you are passionate about people, business, IKEA s purpose and continuously driving better performance. You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have Human Resources background with 6-8 years experience as a Generalist and proven record of developing people and organisations. Experience from a global matrix organisation and/or participating on global projects.",
				"Diversity & Inclusion", "Retail", "Human Resources", "Full Time, Permanent", "HR Operations",
				"Any Graduate", "Relationship management, Trade, Matrix, Relationship, Agile, HR", 7, 9, "WFO ",
				"Engineering", 16);

		JobDetail jobDetail42 = new JobDetail("Customer Care Executive", "5 to 10", "Bangalore/Bengaluru", "7 days ago",
				87,
				"As a person you are passionate about people, business, IKEAs purpose and continuously driving better performance.You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have relevant",
				"Analyst Relations", "Retail", "Marketing & Communication", "Full Time, Permanent",
				"Corporate Communication", "Any Graduate",
				"Online sales, Sales analytics, Business management, SEM, Customer experience", 10, 15, "Hybrid",
				"Analytics", 16);

		JobDetail jobDetail43 = new JobDetail("Store Manager", "4 to 8",
				"Thane,Maharashtra, Pune,Maharashtra, Mumbai (All Areas)", "2 days ago", 37,
				"Title: Store Manager-Retail-Exp(4-8 years)-MaharashtraReporting to: Area Operations Manager Skip Level: City/Zonal Manager Location: Mumbai,Pune,Thane",
				"Territory Sales Manager", "Film / Music / Entertainment", "Sales & Business Development",
				"Full Time, Permanent", "Retail & B2C Sales", "Any Graduate",
				"Revenue Generation, Leadership, Customer Satisfaction", 4, 5, "WFO", "Sales", 16);

		JobDetail jobDetail44 = new JobDetail("Store Manager", "4 to 8",
				"Thane,Maharashtra, Pune,Maharashtra, Mumbai (All Areas)", "2 days ago", 37,
				"Title: Store Manager-Retail-Exp(4-8 years)-MaharashtraReporting to: Area Operations Manager Skip Level: City/Zonal Manager Location: Mumbai,Pune,Thane",
				"Territory Sales Manager", "Film / Music / Entertainment", "Sales & Business Development",
				"Full Time, Permanent", "Retail & B2C Sales", "Any Graduate",
				"Revenue Generation, Leadership, Customer Satisfaction", 4, 7, "WFO", "Sales", 17);

		JobDetail jobDetail45 = new JobDetail("SDE", "7 to 12",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "5 days ago", 37,
				"A bachelor's degree in computer science, software engineering, a related field or equivalent relevant experience.Hands-on experience in front end application development using Angular, Type Script, Bootstrap, JSF, JavaScript and back end application development using Core Java, Java EE, Spring, REST Webservices, Microservices.Have strong understanding of Microservices, SOLID principles and software development lifecycle (SDLC). In-Depth knowledge of various Enterprise Integration patterns.Hand-on experience with AWS Cloud Infrastructure in code services Cloudformation, CDK, SAM etc.",
				"Software Development - Other", "Software Product", "Engineering - Software & QA",
				"Full Time, Permanent", "Software Development", "B.Tech/B.E. in Any Specialization",
				"core java, aws, Api Gateway, Aws Cloud, Design Patterns", 9, 19, " Hybrid", "Engineering", 17);

		JobDetail jobDetail46 = new JobDetail("Business Development", "6 to 8", "Hyderabad/Secunderabad", "10 days ago",
				137,
				"As a person you are passionate about people, business, IKEA s purpose and continuously driving better performance. You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have Human Resources background with 6-8 years experience as a Generalist and proven record of developing people and organisations. Experience from a global matrix organisation and/or participating on global projects.",
				"Diversity & Inclusion", "Retail", "Human Resources", "Full Time, Permanent", "HR Operations",
				"Any Graduate", "Relationship management, Trade, Matrix, Relationship, Agile, HR", 7, 9, "WFO",
				"Fortune 500", 17);

		JobDetail jobDetail47 = new JobDetail("Accounts Manager", "0 to 4",
				"Jalandhar,Punjab, Ludhiana,Punjab, Amritsar,Punjab", "18 days ago", 133,
				"As a Key Accounts Manager, you will work with a portfolio of our restaurant partners and help create a healthy long term food delivery ecosystem in India. What purpose would you 'serve' Onboard new eateries on Zomato. Could be anything - from a high-end restaurant to a neighbourhood joint. This would involve excellent sales, negotiation and revenue generation skills Engage with a set of restaurant partners on field and help them with any & everything that involves running a restaurant. This would require good relationship management and communication skills Take a data-driven approach to assist your restaurant partners in their growth journey Work with cross-functional teams to ensure our restaurant partners have the best possible experiences",
				"Key Account Manager", "Internet (E-Commerce)", "Sales & Business Development", "Full Time, Permanent",
				"Enterprise & B2B Sales", "Any Graduate",
				"Sales,Relationship Management, Data Management, Business Development, Data Analytics", 2, 4, "WFH",
				"Software & Development", 17);

		JobDetail jobDetail48 = new JobDetail("Senior Data Engineer", "1 to 5", "Bangalore/Bengaluru", "4 days ago",
				145,
				"We are looking for a Senior Data Engineer to join our Platform Team. The team is responsible for ensuring all access is monitored, governed, and compliant with regulatory mandates, managing security risk while enabling business agility. Youll work on advancing our foundational data security capabilities by building easily portable systems to reduce security and regulatory risk and develop systems to enforce the least privilege principle.",
				"Data Engineer", "Internet", "Data Science & Analytics", "Full Time, Permanent",
				"Data Science & Machine Learning", "Any Graduate",
				"C++, Backend, data science, data security, Business strategy, Operations, Object oriented programming",
				10, 12, "Hybrid", "Analytics", 17);

		JobDetail jobDetail49 = new JobDetail("Sales Manager", "1 to 6",
				"Pune,Maharashtra, Gurugram,Haryana, Bengaluru,Karnataka", "3 days ago", 10,
				"Driving business through acquiring new customers in the allocated region with focus to improve the affordable reach.Generate HL/BL/LAP leads from open market and through different channelsMaintain productive relationships with customers",
				"Business Development Executive (BDE)", "NBFC", "Sales & Business Development", "Full Time, Permanent",
				"BD / Pre Sales", "Any Graduate", "Loan Against Property, Housing Finance, Lap Loans, Home Loan Sales",
				1, 5, " Hybrid", "Analytics", 17);

		JobDetail jobDetail50 = new JobDetail("SDE", "3 TO 6",
				"Hyderabad/Secunderabad, Gurgaon/Gurugram, Bangalore/Bengaluru", "30+ days ago", 77,
				"Translation of complex functional requirements into technical requirements, implementing and maintaining a coherent and progressive development strategy for our product line Design, develop and maintain complex systems using best of the breed development practices and technology. Responsible for the over-all software development life cycle. Delivery of High Quality, Scalable and Extensible systems and applications on-time and on-budget. Adoption and Evolution of the software engineering practices and tools within the organization Keep in sync with the latest technology developments and open source offerings. Evaluate and adopt them for solving business problem of organization.",
				"Back End Developer", "Internet", "Engineering - Software & QA", "Full Time, Permanent",
				"Software Development", "Any Graduate", "Software design, SOA, Database design, MySQL, Debugging", 10,
				15, "Hybrid", "Software & Development", 18);

		JobDetail jobDetail51 = new JobDetail("Senior Data Engineer", "1 to 5", "Bangalore/Bengaluru", "4 days ago",
				145,
				"We are looking for a Senior Data Engineer to join our Platform Team. The team is responsible for ensuring all access is monitored, governed, and compliant with regulatory mandates, managing security risk while enabling business agility. Youll work on advancing our foundational data security capabilities by building easily portable systems to reduce security and regulatory risk and develop systems to enforce the least privilege principle.",
				"Data Engineer", "Internet", "Data Science & Analytics", "Full Time, Permanent",
				"Data Science & Machine Learning", "Any Graduate",
				"C++, Backend, data science, data security, Business strategy, Operations, Object oriented programming",
				10, 12, "Hybrid", "Engineering", 18);

		JobDetail jobDetail52 = new JobDetail("Customer Care Executive", " 0 to 5", "Gurgaon/Gurugram", "Few Hours Ago",
				10,
				"Hiring For Telecom Chat Process Grad Fresher 20K U/G & BE, Btech 6 Months exp with International BpO Must 20K & UG /BE/Btech/ Grad with 1 year Exp Customer Service Any Domain 24K 5 Day Call-Dipankar@9650094552 Email@ jobsatsmartsource@gmail.com",
				"Non Voice - Other", "BPO / Call Centre", "Customer Success, Service & Operations",
				"Full Time, Permanent", "Non Voice", "Graduation Not Required",
				"Content Writer, Outbound, Voice Support, Creative Writing, Convergys", 1, 3.5, "WFO", "HR", 18);

		JobDetail jobDetail53 = new JobDetail("Business Development", "6 to 8", "Hyderabad/Secunderabad", "10 days ago",
				137,
				"As a person you are passionate about people, business, IKEA s purpose and continuously driving better performance. You are energized by increasing customer value, driving business growth and contributing to overall success and results through people as well as motivated by leading and developing people. For this role we believe you have Human Resources background with 6-8 years experience as a Generalist and proven record of developing people and organisations. Experience from a global matrix organisation and/or participating on global projects.",
				"Diversity & Inclusion", "Retail", "Human Resources", "Full Time, Permanent", "HR Operations",
				"Any Graduate", "Relationship management, Trade, Matrix, Relationship, Agile, HR", 7, 9, "WFO",
				"Fortune 500", 18);

		JobDetail jobDetail54 = new JobDetail("Mean Stack Developer", "4 to 9", "Pune, Chennai, Remote", "5 days ago",
				362,
				"3+ Years of designing and developing responsive, web application using Angular.Design and implement responsive, user-friendly web interfaces using modern HTML, CSS, and JavaScript frameworks (e.g., Angular).",
				"Other", "IT Services & Consulting", "Software Product", "Full Time, Permanent", "Software Development",
				"Any Graduate", "node js, Healthcare Domain, Angular", 14, 25, " Hybrid", "Project Management", 18);

		List<JobDetail> details = new ArrayList<>();

		details.add(jobDetail1);
		details.add(jobDetail2);
		details.add(jobDetail3);
		details.add(jobDetail4);
		details.add(jobDetail5);
		details.add(jobDetail6);
		details.add(jobDetail7);
		details.add(jobDetail8);
		details.add(jobDetail9);
		details.add(jobDetail10);
		details.add(jobDetail11);
		details.add(jobDetail12);
		details.add(jobDetail13);
		details.add(jobDetail14);
		details.add(jobDetail15);
		details.add(jobDetail16);
		details.add(jobDetail17);
		details.add(jobDetail18);
		details.add(jobDetail19);
		details.add(jobDetail20);
		details.add(jobDetail21);
		details.add(jobDetail22);
		details.add(jobDetail23);
		details.add(jobDetail24);
		details.add(jobDetail25);
		details.add(jobDetail26);
		details.add(jobDetail27);
		details.add(jobDetail28);
		details.add(jobDetail29);
		details.add(jobDetail30);
		details.add(jobDetail31);
		details.add(jobDetail32);
		details.add(jobDetail33);
		details.add(jobDetail34);
		details.add(jobDetail35);
		details.add(jobDetail36);
		details.add(jobDetail37);
		details.add(jobDetail38);
		details.add(jobDetail39);
		details.add(jobDetail40);
		details.add(jobDetail41);
		details.add(jobDetail42);
		details.add(jobDetail43);
		details.add(jobDetail44);
		details.add(jobDetail45);
		details.add(jobDetail46);
		details.add(jobDetail47);
		details.add(jobDetail48);
		details.add(jobDetail49);
		details.add(jobDetail50);
		details.add(jobDetail51);
		details.add(jobDetail52);
		details.add(jobDetail53);
		details.add(jobDetail54);

		for (JobDetail job : details) {
			jobDetailsService.saveJobDetails(job);
		}
		return new ModelAndView("SingleJob");

	}

}
