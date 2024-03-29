<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/allJobList.css" />
</head>
<body>
	<nav>Navigation Bar</nav>

	<div class="container">
		<div id="left-container" class="main-container">
			<div id="all-filters">
				<div id="margin">
					<h4 class="all-filters-heading">All Filters</h4>
					<div class="border"></div>
					<form action="">
						<div id="filter-types">
							<h4>Company Type</h4>
							<input type="checkbox" value="Foreign MNC" /> <label
								class="padding" for="Foreign MNC">Foreign MNC</label><br /> <input
								type="checkbox" value="Coperate" /> <label class="padding"
								for="Coperate">Coperate</label><br /> <input type="checkbox"
								value="Indian MNC" /> <label class="padding" for="Indian MNC">Indian
								MNC</label><br /> <input type="checkbox" value="StartUps" /> <label
								class="padding" for="StartUps">StartUps</label><br /> <a
								href="#" class="view-more">View More</a><br />
						</div>
						<br />
						<div class="border"></div>
						<div id="filter-types">
							<h4>Work Mode</h4>
							<input type="checkbox" value="Work-from-Office" /> <label
								class="padding" for="Work-from-Office">Work from Office</label><br />
							<input type="checkbox" value="Hybrid" /> <label class="padding"
								for="Hybrid">Hybrid</label><br /> <input type="checkbox"
								value="Remote" /> <label class="padding" for="Remote">Remote</label><br />
							<input type="checkbox" value="Temp-WFH-due-to-personal-issues" />
							<label class="padding" for="Temp-WFH-due-to-personal-issues">Temp-WFH-due-to-....</label><br />
							<a href="#" class="view-more"
								style="margin-top: 4px; margin-left: 2px">View More</a><br />
						</div>
						<br />
						<div class="border"></div>
						<div id="filter-types">
							<h4>Experience</h4>
							<div class="slider-container">
								<input type="range" min="0" max="100" value="0" id="slider" />
								<div class="value" id="value">0</div>
							</div>
						</div>
						<br />
						<div class="border"></div>
						<div id="filter-types">
							<h4>Salary</h4>
							<input type="checkbox" value="0-3-lakhs" /> <label
								class="padding" for="0-3-lakhs">0-3 Lakhs</label><br /> <input
								type="checkbox" value="3-6-lakhs" /> <label class="padding"
								for="3-6-lakhs">3-6 Lakhs</label><br /> <input type="checkbox"
								value="6-10-lakhs" /> <label class="padding" for="6-10-lakhs">6-10
								Lakhs</label><br /> <input type="checkbox" value="10-15-lakhs" /> <label
								class="padding" for="10-15-lakhs">10-15 Lakhs</label><br /> <a
								href="#" class="view-more"
								style="margin-top: 4px; margin-left: 2px">View More</a><br />
						</div>
						<br />
						<div class="border"></div>
						<div id="filter-types">
							<h4>Industry</h4>
							<input type="checkbox" value="IT-Services" /> <label
								class="padding" for="IT-Services">IT Services</label><br /> <input
								type="checkbox" value="BPO-Call-Centre" /> <label
								class="padding" for="BPO-Call-Centre">BPO/Call Centre</label><br />
							<input type="checkbox" value="Medical-Services" /> <label
								class="padding" for="Medical-Services">Medical Services</label><br />
							<input type="checkbox" value="Education-Training-Services" /> <label
								class="padding" for="Education-Training-Services">Education
								Training Services</label><br /> <a href="#" class="view-more"
								style="margin-top: 4px; margin-left: 2px">View More</a><br />
						</div>
						<br />
						<div class="border"></div>
						<div id="filter-types">
							<h4>Location</h4>
							<input type="checkbox" value="Mumbai" /> <label class="padding"
								for="Mumbai">Mumbai</label><br /> <input type="checkbox"
								value="Bengaluru" /> <label class="padding" for="Bengaluru">Bengaluru</label><br />
							<input type="checkbox" value="Delhi-NCR" /> <label
								class="padding" for="Delhi-NCR">Delhi-NCR</label><br /> <input
								type="checkbox" value="Pune" /> <label class="padding"
								for="Pune">Pune</label><br /> <a href="#" class="view-more"
								style="margin-top: 4px; margin-left: 2px">View More</a><br />
						</div>
						<br />
					</form>
				</div>
			</div>
		</div>

		<div id="Job-list" class="main-container">
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>
			<div class="Jobs">
				<div class="Job-and-company-image-and-name">
					<div class="Job-and-company-name">
						<h3 class="Job-name">Probationary Officers Programme( For PAN
							India)</h3>
						<div class="Job-basic-details">
							<h5>ICICI Bank</h5>
							<div class="rating">
								<label></label>
							</div>
							<h6 class="Review">4.0 | 335223 Review</h6>
						</div>
					</div>
					<div class="images-of-company-in-job-list">
						<img class="images-in-job-list" alt="NA"
							src="${pageContext.request.contextPath}/resources/asset/netflix.png" />
					</div>
				</div>
				<div class="Job-details">
					<img
						src="${pageContext.request.contextPath}/resources/asset/suitcase.png"
						alt="NA" class="location" />
					<div class="year-exp">
						<p class="details">0-5 Yrs</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<div class="salary">
						<p>Rs 4000000</p>
					</div>
					<div>
						<p>|</p>
					</div>
					<img
						src="${pageContext.request.contextPath}/resources/asset/location.png"
						alt="NA" class="location" />
					<div class="location-name">
						<p>Temp. WFH - Mumbai</p>
					</div>
				</div>
				<div class="short-job-desc">
					<img
						src="${pageContext.request.contextPath}/resources/asset/page.png"
						alt="NA" class="location" />
					<div class="job-desc">Lorem ipsum dolor sit amet consectetur
						adipisicing elit. Nisi error</div>
				</div>
				<div class="tags">
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
					<div>
						<p>|</p>
					</div>
					<p class="Job-tag">Market Research</p>
				</div>

				<div class="button">
					<button class="save-button" onclick="toggleBookmark(this)">
						<svg class="bookmark-icon" xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 24 24">
        <path class="bookmark-path"
								d="M19 2H5c-1.1 0-1.99.9-1.99 2L3 21l8-5 8 5V4c0-1.1-.9-2-2-2" />
      </svg>
						Save
					</button>
				</div>
			</div>

		</div>

		<div id="right-container" class="main-container">
			<div id="right-top-container">
				<h4>See 1 job in Featured Company</h4>
				<img
					src="${pageContext.request.contextPath}/resources/asset/search.png"
					alt="NA" class="featured-Company-logo" />
			</div>
			<div id="right-bottom-container">
				<img
					src="${pageContext.request.contextPath}/resources/asset/resume.png"
					alt="NA" class="featured-Company-logo" />
				<h4>Increase your profile visiblity upto 3 times among
					recruiters hiring for jobs</h4>
				<p>Become visible to more recruiters with resume Display service</p>
			</div>
		</div>
	</div>

	<script src="../js/all_Job_List.js"></script>
	<footer>Footer</footer>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/allJobList.js"></script>
</body>
</html>