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

import com.cybage.Job_Quest.Service.CompanyService;
import com.cybage.Job_Quest.Service.EventService;
import com.cybage.Job_Quest.model.Company;
import com.cybage.Job_Quest.model.Event;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

//	@RequestMapping(value = "/companyDetailController")
//	public ModelAndView appliedJob(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws IOException {
//		Company company = new Company();
//
//		model.addAttribute("companyinfo", company);
//		return new ModelAndView("companyForm");
//	}
//
//	@RequestMapping(value = "/CompanyRegistrationServlet")
//	public ModelAndView hkuhuih(@ModelAttribute("companyinfo") Company company) {
//		companyService.saveCompany(company);
//
//		return new ModelAndView("home");
//
//	}

	@RequestMapping(value = "/CompanyAddButton")
	public ModelAndView addCompanyToSql() {

		Company company1 = new Company("Lenskart",
				"Founded in 2010, By an ex-Microsoft 'techie' with no money but truckloads of relentless passion to make a difference in this world, Lenskart is India's fastest-growing eyewear business today.With a rapidly growing business reaching out to over 1,00,000 customers a month via a unique combination of a strong online business as www.lenskart.com, uniquely designed physical stores, as well as a first-of-its-kind home eye check up' service, Lenskart is revolutionizing the eyewear industry in India.",
				"Internet", "B2B", "Unicorn", "B2C", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Do More. Be More.", "https://www.lenskart.com/", "2010 (14 yrs old)", "Private", "Faridabad, India",
				3.3, "42.9k", "lenskart_banner.jpg", "lenskart_Poster.gif");

		Company company2 = new Company("Uber",
				"Movement is what we power. It’s our lifeblood. It runs through our veins. It’s what gets us out of bed each morning. It pushes us to constantly reimagine how we can move better. For you. For all the places you want to go. For all the things you want to get. For all the ways you want to earn. Across the entire world. In real-time. At the incredible speed of now.",
				"Foreign MNC", "E-commerce", "Urban Transport", "B2C",
				"https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"We reimagine the way the world moves for the better.", "https://www.uber.com/in/en/careers/",
				"2009 (15 yrs old)", "Public", "San Francisco, United States (USA)", 4.2, "24.7k",
				"lenskart_banner.jpg", "Uber_Poster.gif");

		Company company3 = new Company("Zomato",
				"Launched in Delhi 16 years ago, Zomato has grown from a home project to one of the largest food aggregators in the world. We not only connect people to food in every context but also work closely with restaurants to enable a sustainable ecosystem. Back in 2008, all it took was an idea to enable digital access to thousands of restaurant menus. Three passionate foodies who hated waiting in lines, drove around Delhi to collect menus from restaurants, scan them and put them online. Their idea has now grown into the vision that drives our team of 5000+ people every day.",
				"Hotels & Restaurants", "Internet", "B2B", "B2C", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Never have a bad meal", "https://www.zomato.com/", "2008 (16 yrs old)", "Public", "Gurugram", 3.8,
				"10.2k", "lenskart_banner.jpg", "Zomato_Poster.gif");

		Company company4 = new Company("Swiggy",
				"We build innovative products & solutions that deliver unparalleled convenience to urban consumers.The best part? Every bit of your work at Swiggy will help elevate the lives of our users across India.",
				"Internet", "B2C", "Hotels & Restaurants", "Unicorn",
				"https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s", "Restaurant aggregator and food delivery platform",
				"https://www.swiggy.com/", "2014 (10 yrs old)", "Private", "Bengaluru", 3.9, "33.9k",
				"lenskart_banner.jpg", "Swiggy_Poster.gif");

		Company company5 = new Company("nearbuy",
				"Nearbuy India Private Limited is India’s first hyper-local online platform that enables customers and local merchants to discover and engage with each other. We at nearbuy.com, work hard to bring your world, closer to you. Whether it’s fine dining, relaxing at the top spas, or just discovering your city intimately, nearbuy.com makes it happen for you.nearbuy.com also offers its merchants a strong branding and visibility-led platform that enables customers, in and around their establishments, to easily discover their businesses. We are present in 35+ cities, 18+ categories and have over 50,000 merchants across 100,000+ unique locations.",
				"Internet", "Private", "B2C", "E-commerce", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"work hard to bring your world, closer to you.", "https://www.nearbuy.com/", "2010 (14 yrs old)",
				"Private", "Gurgaon, India", 4.7, "55.4k", "lenskart_banner.jpg", "nearbuy_Poster.gif");

		Company company6 = new Company("IKEA",
				"IKEA is a global leader in life at home. Founded in Sweden in 1943, IKEA is now a worldwide retailer of affordable, well-designed products and solutions for every room in your home. Our values and optimism are shared with millions of co-workers and customers around the world. Along with our desire to champion sustainable living, responsible sourcing, and communities in need of support.",
				"Private", "Foreign MNC", "B2C", "B2B", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Home is where it all begins",
				"https://www.ikea.com/in/en/?gad_source=1&gclid=CjwKCAiA8sauBhB3EiwAruTRJhglqH5IPecFBC0jlvvUYHV0Phnh-YOwBFi8smkY2v3cgpvng-96yxoCh3kQAvD_BwE",
				"1943 (81 yrs old)", "Private", "Gurgaon, India", 4.1, "5.6k", "lenskart_banner.jpg",
				"Ikea_Poster.gif");

		Company company7 = new Company("Mahindra",
				"A federation of companies, bound by one purpose – to Rise. Inspired by this spirit, our legacy, and values, our goal to always positively impact our partners, stakeholders, communities, and the world at large, remains unshakeable. What began as a steel-trading venture seven decades ago, steadily turned into a global brand, spanning nations and industries. This is a story with an upward curve, narrating how an Indian company paved its way to become a global powerhouse. We have come a long way since 1945 and as we accelerate into the 21st century, we aim at achieving even more.",
				"Internet", "Indian MNC", "B2C", "B2B", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Planet, People, Trust", "https://www.mahindra.com/", "1945 (79 yrs old)", "Public", "Mumbai, India",
				4.2, "9.5k", "lenskart_banner.jpg", "Mahindra_Poster.gif");

		Company company8 = new Company("OPPO",
				"The OPPO brand was first registered in 2001 and OPPO was officially incorporated in 2004. To date,OPPO has expanded its business presence to more than 40 countries and regions, with over 400,000 sales outlets worldwide. With nine Intelligent Manufacturing Centers, six Research Divisions, four R&D Centers and a London-based Global Design Center, OPPO has more than 40,000 employees around the world. OPPO was awarded as “Most Respected Chinese Company” by The Economic Oberserver in 2018 for the third consecutive year and was also included on Boston Consulting Group’ s“ 2018 BCG Global Challengers” list. Also in 2018, OPPO received the Canstar Blue “Most Satisfied Customers” award for the second year in a row. In 2019, OPPO earned a spot on the “Top 50 Chinese Global Brands” ranking by BrandZTM, the leading global authority on brand powe",
				"Public", "Foreign MNC", "B2C", "E-commerce", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Inspiration Ahead", "https://www.oppo.com/in/", "2004 (20 yrs old)", "Public", "Dongguan, Guangdong",
				4, "26.9k", "lenskart_banner.jpg", "Oppo_Poster.gif");

		Company company9 = new Company("Adani Wilmar",
				"We are one of the few large FMCG food companies in India to offer most of the essential kitchen commodities for Indian consumers, including edible oil, wheat flour, rice, pulses, and sugar. Our products are offered under a diverse range of brands across a broad price spectrum and cater to different customer groups. We are a joint venture incorporated in January 1999 between the Adani Group, which is a multinational diversified business group with significant interests across transport and logistics, and energy and utility sectors, and the Wilmar Group, one of Asia’s leading agribusiness groups which were ranked among the largest listed companies by market capitalization on the Singapore Exchange as of February 2021.",
				"Public", "Indian MNC", "B2C", "B2B", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"For a healthy growing nation.", "https://www.adaniwilmar.com/", "1999 (25 yrs old)", "Public",
				"Ahmadabad, India", 4.2, "2k", "lenskart_banner.jpg", "AdaniWilmar_Poster.gif");

		Company company10 = new Company("Burger King",
				"Our restaurants are known for serving high-quality, great-tasting, and affordable food. Founded in 1954, BURGER KING® is the second largest fast food hamburger chain in the world with about 18,000 restaurants operating in more than 100 countries and US territories as at June 30, 2019. The original HOME OF THE WHOPPER®, our commitment to ingredients, signature recipes, and end-to-end online Burger King experience for millennials is what has defined our brand for more than 50 years..",
				"Private", "Hotels & Restaurants", "B2C", "Foreign MNC",
				"https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Have it your way, have it your way! At Burger King, eat at Burger King!", "https://www.burgerking.in/",
				"2014 (10 yrs old)", "Private", "Miami, Florida", 4, "10.3k", "lenskart_banner.jpg",
				"BurgerKing_Poster.gif");

		Company company11 = new Company("Cybage",
				"Cybage is a global leader in the Digital Product Engineering Services space. We have a strong track record of over 27 years in offering the most comprehensive and prudent digital product engineering services to technology-led businesses around the globe. Our award-winning services cover the entire spectrum of a software or technology product life cycle (PLC) and the product revamp.One of the most exciting facets of our service offerings is that we deliver these services under the aegis of our proprietary ExcelShore® platform. ExcelShore® empowers our entire delivery ecosystem to internalize and practice a data-driven approach to deliver utmost satisfaction to our customers and a tangible ROI. ExcelShore® has been conceived and developed over the last two decades of superior delivery excellence and profound thought leadership at work.",
				"Internet", "Indian MNC", "B2C", "B2B", "https://www.youtube.com/watch?v=Rid7mX9vrNg&t=1s",
				"Delivering Values scientifically", "https://www.cybage.com/?gad_source=1", "1995 (28 yrs old)",
				"Private", "Pune,Maharashtra", 3.9, "10.6k", "lenskart_banner.jpg", "Cybage_Poster.gif");

		List<Company> compList = new ArrayList<>();

		compList.add(company1);
		compList.add(company2);
		compList.add(company3);
		compList.add(company4);
		compList.add(company5);
		compList.add(company6);
		compList.add(company7);
		compList.add(company8);
		compList.add(company9);
		compList.add(company10);
		compList.add(company11);

		for (Company comp : compList) {

			companyService.saveCompany(comp);
		}

		return new ModelAndView("SingleJob");

	}

}
