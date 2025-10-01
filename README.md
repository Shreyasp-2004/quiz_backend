# Quiz Web App

## Project Description
This is a simple **Quiz Web Application** built with **Spring Boot** for the backend and **REST API** architecture.  
The application allows users to take quizzes, submit answers, and get scored automatically.  
Questions are categorized, and each question has multiple-choice options (A, B, C, D).

---

## Features
- Add and manage quiz questions.
- Submit quiz answers via API.
- Automatic scoring based on correct answers.
- RESTful endpoints for easy integration with frontends or other clients.

---

## Technology Stack
- **Backend:** Java, Spring Boot
- **Database:** MySQL 
- **Build Tool:** Maven
- **API Testing:** Postman or similar

---

## Setup and Run Locally

### Prerequisites
- Java 17+
- Maven
- MySQL 

### Steps
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd quiz-app

2. If using Mysql copy this dependency and replace with postgre's in pom.xml
   ```bash
    <dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

3. Create a database
   ```bash
      CREATE DATABASE quiz;
   
2. Change the url, username and password
   ```bash
     spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name (if using postgre)
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name  (if using mysql)
     spring.datasource.username=ypur_username
     spring.datasource.password=your_password
3. Build the project
    ```bash
     mvn clean install
3. Access the API:
    ```bash
    Base URL: http://localhost:8080/

4. Example: To add a question:
    ```bash
    POST http://localhost:8080/api/questions
5. Request body:
    ```bash
     {
       "id": "1",
       "question": "What is 2+2?",
       "optionA": "2",
       "optionB": "8",
       "optionC": "6",
       "optionD": "4",
       "category": "math",
       "correctOption": "optionD"
    }


6. To submit quiz answers:
    ```bash
     POST http://localhost:8080/api/quiz/submit
    
7. Request body
     ```bash
        {
         "1": "optionD",
         "2": "optionB"
        }
8. Response:
    ```bash
      2
  (Returns total score)
  
