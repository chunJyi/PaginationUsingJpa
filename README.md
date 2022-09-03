
<h1 align="center">Hi , I'm Toe Chun</h1>
<h3 align="center"> Java developer from Myanmar</h3>

-  **PaginationUsingJpa**

-  How to reach me **moethuchun@gmail.com**


# PaginationUsingJpa

# Steps to Setup

 ### 1. Clone the Application
 
     git clone https://github.com/chunJyi/PaginationUsingJpa.git

 ### 2. Create PostgreSQL database
 
     create database jpa_testdb;
     
  .run `src/main/resources/employee.sql`
  
 ### 3. Change mysql username and password as per your installation

   open `src/main/resources/application.yml`
   
   change `spring.datasource.username and spring.datasource.password as per your PostgreSQL installation`

 ### 4.  Run the app using maven
       
     mvn spring-boot:run 
     
  The app will start running at http://localhost:8080/employee/all
  
  
 # Explore Rest APIs
 
 1.http://localhost:8080/employee/all
 
 
