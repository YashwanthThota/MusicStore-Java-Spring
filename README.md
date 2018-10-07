# Online MusicStore - An E-commerce application using Java Spring MVC and postgreSQL:

**DESCRIPTION:** 
  - This is a Java spring framework based application which enables the customers to buy music instrument, accessories, records.
  - The admin can add, delete, edit the information of music products
  
**FEATURES:**
  - In order to use this application's services, the customer has to signup with this application.
  - Provided a dashboard for admin which comprises of two parts customer management and product inventory.
  - Customer management part contains a list of registered customers in the system.
  - The admin can add,edit,delete the products Product Inventory.
  - Enabled **Validations** for various fields in add product form and also for the customer registeration form.
  - Enabled **Antiforgery-tokens** to restrict the **CROSS SITE REQUEST FORGERY**
  - This application can handle and maintain individual item records for each customer
  - All the customer and product information is stored in the **postgreSQL** Database.

**TECHNICAL FEATURES:**
   - The application interface renders depending upon the device screen(mobile or web)
   - Used **Bootstrap** for making the application device screen independent 
   - Designed by using **MVC(Model-View-Component)** methodology
   - Designed **RestAPI** for manipulating data to the database and the exchanged data is in **JSON** format
   - Used **Spring Data** to integrate with Hibernate and JPA to persist model objects
   - Use **Spring Data, Hibernate or JPA** for data validation
   - Use **Spring Security** for login control
   - Used **AngularJS** for calling the API and for displaying Information from the API
   - Use **Spring Webflow** to develop flow oriented web process, such as order checkout
   - Used **DataTables Plugin** for pagenation, searching and sorting of the information

**DEMO LINK(HOSTED IN HEROKU):**
- **Storesite:**
 (http://desolate-thicket-85172.herokuapp.com/)
 
- **login:**
 (http://desolate-thicket-85172.herokuapp.com/login/)
  - **Admin credientials:**
   **Username:** admin
   **Password:** admin
  - **Customer credentials:**
  **Username:** user
   **Password:** password
