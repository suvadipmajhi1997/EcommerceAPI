<h1 align="center"> 
Spring Project Ecommerce API</h1>
This is a Spring Boot project for an e-commerce API that allows users to manage orders, products, addresses, and users. The project uses MySQL for storing data, Hibernate for object-relational mapping, and Maven for building the project.

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Getting started
* Clone the repository to your local machine.
* Create a MySQL database and update the application.properties file with the database credentials and connection details.
* Build the project using Maven: mvn clean install
* Run the application using java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The API endpoints will be available at http://localhost:8080.

#### Endpoints
The following API endpoints are available:

* GET /users: Returns a list of all users.
* POST /users: Creates a new user.
* GET /users/{id}: Returns a user with the given ID.
* PUT /users/{id}: Updates a user with the given ID.
* DELETE /users/{id}: Deletes a user with the given ID.
* GET /products: Returns a list of all products.
* GET /products?category={category}: Returns a list of all products in the given category.

* POST /products: Creates a new product.
* GET /products/{id}: Returns a product with the given ID.
* PUT /products/{id}: Updates a product with the given ID.
* DELETE /products/{id}: Deletes a product with the given ID.
* GET /addresses: Returns a list of all addresses.
* POST /addresses: Creates a new address.
* GET /addresses/{id}: Returns an address with the given ID.
* PUT /addresses/{id}: Updates an address with the given ID.
* DELETE /addresses/{id}: Deletes an address with the given ID.
* POST /orders: Creates a new order.
* GET /orders/{id}: Returns an order with the given ID.
## Models
The following models are available:

User
* id (integer) - The user ID.
* name (string) - The user name.
* email (string) - The user email address.
* password (string) - The user password.
* phoneNumber (string) - The user phone number.

Product
* id (integer) - The product ID.
* name (string) - The product name.
* price (integer) - The product price.
* description (string) - The product description.
* category (string) - The product category.
* brand (string) - The product brand.

Address
* id (integer) - The address ID.
* name (string) - The address name.
* landmark (string) - The address landmark.
* phoneNumber (string) - The address phone number.
* zipcode (string) - The address zip code.
* state (string) - The address state.
* user (User) - The user associated with the address.

Order
* id (integer) - The order ID.
* user (User) - The user who placed the order.
* product (Product) - The product ordered.
* address (Address) - The address the order should be shipped to.
* productQuantity (integer) - The quantity of the product  ordered.




>## Project Summary
This project provides a starting point for building a Spring Boot e-commerce API. It includes the basic functionality required for managing orders, products, addresses, and users, and can be extended to meet the specific needs of your application.
