-- -----------------------------------------------------
-- SCHEMA stageemploi
-- -----------------------------------------------------
USE `Stagemont` ;

-- -----------------------------------------------------
-- INSERT
-- -----------------------------------------------------

-- (`id` `firstName` `lastname` `password` `da` `cv` `letter`) 
INSERT INTO `student` VALUES 
("1", "Jane", "Doe", "123qwe", "1234567", "cv_jane.pdf", "letter_jane.pdf"),
("2", "Mark", "Smith", "fjhef8732", "1652984", "cv_mark.pdf", "letter_mark.pdf"),
("3", "Sarah", "Johnson", "fgh654", "1745236", "cv_sarah.pdf", "letter_sarah.pdf"),
("4", "William", "Jones", "web752", "1845367", "cv_william.pdf", "letter_william.pdf"),
("5", "Frank", "Thomas", "akn427", "1924369", "cv_frank.pdf", "letter_frank.pdf");

-- (`id` `firstName` `lastname` `password`)
INSERT INTO `teacher` VALUES 
("1", "Taylor", "Lewis", "hello987"),
("2", "Jennifer", "Perez", "school398"),
("3", "Zack", "Allen", "grade894");

-- (`id``name` `password` `phone` `email` `person_in_charge`)
INSERT INTO `company` VALUES 
("1", "Google", "iamgoogle", "5145555555", "google@gmail.com", "Michel"),
("2", "Amazon", "iamamazon", "5141235689", "amazon@amazon.com", "Jean"),
("3", "Meta", "iammeta", "5147894512", "meta@hotmail.com", "Coralie"),
("4", "Dell", "iamdell", "5141112222", "Dell@dell.ca", "John"),
("5", "Ubisoft", "iamubisoft", "5148884536", "ubisoft@ubisoft.com", "Oliver");

-- (`id` `username` `password`)
INSERT INTO `admin` VALUES 
("1", "root", "root"),
("2", "admin", "admin"),
("3", "sonic", "adventure");

-- (`id` `title` `description` `start_date` `end_date` `company_id`) 
INSERT INTO `internship` VALUES 
("1", "Developper Intern", "Google is hiring intern developpers who are fluent in : HTML, CSS, PHP, SQL", "2022-01-14", "2022-03-14", "1"),
("2", "Developper Intern", "Amazon is hiring intern developpers who are fluent in : HTML, CSS, MYSQL, ASP.NET, JAVA", "2021-06-30", "2022-08-30", "2"),
("3", "Developper Intern", "Meta is hiring intern developpers who are fluent in : HTML, CSS, PHP, SQL, JAVA", "2022-01-14", "2022-03-14", "3"),
("4", "Engineer Intern", "Dell is hiring intern engineers who are fluent in : C++ and Python", null, null, "4"),
("5", "Engineer Intern", "Ubisoft is hiring intern engineers who are fluent in : C++ and Python", "2022-05-30", "2022-06-30", "5");

-- (`id` `title` `description` `start_date` `end_date` `company_id`)
INSERT INTO `job` VALUES 
("1", "Developper", "Google is hiring developpers who are fluent in : HTML, CSS, PHP, SQL", "2022-01-14", "2022-03-14", "1"),
("2", "Developper", "Amazon is hiring developpers who are fluent in : HTML, CSS, MYSQL, ASP.NET, JAVA", "2021-06-30", "2022-08-30", "2"),
("3", "Software Engineer", "Suitable for people able to work with Android mobile", null, null, "3"),
("4", "Developper Front-end", "Applicable for people able to work in a fast-pace environnement", null, null, "4"),
("5", "Developper Front-end", "Applicable for people able to work in a fast-pace environnement with flexible hours", null, null, "5");

-- (`id` `title` `description` `image` `company_id`)
INSERT INTO `ads` VALUES 
("1", "Google is now hiring", "Google is hiring more employees! Contact the person in charge", "google_ad_img", "1"),
("2", "Work Hard. Have Fun. Make History", "If you want to work in an efficient and spacious environement, apply to work for Amazon!", "amazon_ad_img", "3"),
("3", "Don't be evil", "Google is now looking for interns!", "google_ad2_img", "1");

-- (`id` `status` `start_date` `end_date` `company_id` `student_id`)
-- ENUM('submit','interview','employ')
INSERT INTO `contract` VALUES 
("1", "submit", STR_TO_DATE('1-01-2022', '%d-%m-%Y'), STR_TO_DATE('1-01-2023', '%d-%m-%Y'), "1", "1"),
("2", "submit", STR_TO_DATE('10-05-2022', '%d-%m-%Y'), STR_TO_DATE('6-06-2023', '%d-%m-%Y'), "1", "2"),
("3", "submit", STR_TO_DATE('3-03-2021', '%d-%m-%Y'), STR_TO_DATE('5-07-2021', '%d-%m-%Y'), "1", "3"),
("4", "submit", STR_TO_DATE('17-02-2022', '%d-%m-%Y'), STR_TO_DATE('4-04-2023', '%d-%m-%Y'), "1", "5"),
("5", "submit", STR_TO_DATE('1-01-2022', '%d-%m-%Y'), STR_TO_DATE('2-03-2024', '%d-%m-%Y'), "2", "1"),
("6", "employ", STR_TO_DATE('11-12-2022', '%d-%m-%Y'), STR_TO_DATE('5-03-2023', '%d-%m-%Y'), "2", "4"),
("7", "interview", STR_TO_DATE('3-10-2022', '%d-%m-%Y'), STR_TO_DATE('7-9-2023', '%d-%m-%Y'), "4", "5"),
("8", "submit", STR_TO_DATE('1-01-2022', '%d-%m-%Y'), STR_TO_DATE('1-05-2022', '%d-%m-%Y'), "3", "2"),
("9", "submit", STR_TO_DATE('27-03-2022', '%d-%m-%Y'), STR_TO_DATE('1-01-2023', '%d-%m-%Y'), "3", "3"),
("10", "submit", STR_TO_DATE('1-01-2022', '%d-%m-%Y'), STR_TO_DATE('1-01-2023', '%d-%m-%Y'), "3", "5");
