#🎓 Try&Buy – Graduation Project (A+)
"وَقُلْ رَبِّ زِدْنِي عِلْمًا" – الحمد لله الذي بنعمته تتم الصالحات.
 - Proud to share our graduation project Try&Buy, built by a great team, and awarded an A+ with an Excellent graduation grade.



## 🛍️ About the Project
 - Try&Buy is a modern E-commerce web application that allows users to shop for clothing products with an interactive and personalized experience — including Virtual Try-On, secure purchasing, and full account tracking.

- Developed using Spring Boot (backend) and Native JavaScript (frontend).




## Main Features



### On the Product Details Page, users can:
 - Select Size

 - Choose Quantity

 - View Multiple Designs

 - Read Comments/Reviews



### Click "Try On" to:
 - Upload their photo

 - Preview how the T-shirt looks on them (Virtual Try-On)



### Checkout:

 - Select a delivery location

 - Place order securely



### Order History:

 - View past orders and delivery info from their personal profile



### Authentication & Authorization
 - Secure Login/Signup



### Role-based access:

 - Regular Users

 - Admins (full control)




### Admin Dashboard

 - Admins can:

   - Add products

   - Edit product details

   - Delete products

   - Manage product images and content



### 👥 User Profile

 -  Each user can:

    - Track their order history

    - Manage saved delivery address

    - View Try-On history 



## 💡 Tech Stack

 - Backend: Spring Boot

 - Frontend: Native JavaScript, HTML, CSS

 - Security: Spring Security (Authentication & Authorization)

 - Virtual Try-On: Custom image overlay logic

 - Database: MySQL (shop) via phpMyAdmin




## How to Run


 - Requirements

    - Java 17+

    - MySQL (phpMyAdmin)

    - VS Code



### 🛠️ Steps

  - Start MySQL via XAMPP

  - Create a database named shop in phpMyAdmin


  - In application.properties, make sure:
  properties
    spring.datasource.url=jdbc:mysql://localhost:3306/shop
    spring.datasource.username=root
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update


  - Run backend using:

./mvnw spring-boot:run

Open frontend by launching login.html in browser or with Live Server.

-> No SQL schema needed — tables are auto-generated!




Demo Video
 
https://github.com/user-attachments/assets/7054e9ff-0f83-4b62-9c97-137af25e0e42






User Profile

<img width="1366" height="684" alt="Screenshot (29)" src="https://github.com/user-attachments/assets/5885453f-6ad9-4fef-a9ce-a08b9fe4ada9" />




Product listing

<img width="1366" height="722" alt="TryAndBuy" src="https://github.com/user-attachments/assets/4adb8325-32d8-4553-af37-41541fb00c63" />




Product details (size, quantity, styles)

<img width="1366" height="725" alt="Screenshot (25)" src="https://github.com/user-attachments/assets/5724862a-463c-4863-a06c-de24da1507e2" />




Try-On result

<img width="1366" height="768" alt="Screenshot (28)" src="https://github.com/user-attachments/assets/7a1ae2c5-68a7-4e95-acd6-fd46b71c87b5" />
<img width="1366" height="768" alt="Screenshot (27)" src="https://github.com/user-attachments/assets/189da59c-d58c-4260-ade6-ddee711816de" />




Checkout with address selection

<img width="1366" height="768" alt="Screenshot (31)" src="https://github.com/user-attachments/assets/bf6f6657-2306-4faa-8660-6b543e3b8996" />
<img width="1366" height="768" alt="Screenshot (30)" src="https://github.com/user-attachments/assets/8396eca1-38a0-4025-9af0-d71a93917488" />




🔐 Login/Register

<img width="1366" height="682" alt="Screenshot (32)" src="https://github.com/user-attachments/assets/6f83ad69-3d83-4a3c-a437-b9ba9ac01d5b" />




🧑‍💼 Admin dashboard

<img width="1366" height="692" alt="Screenshot (34)" src="https://github.com/user-attachments/assets/30f659c5-ae43-4dee-b268-83e5805d3a2c" />


message

<img width="1366" height="693" alt="message" src="https://github.com/user-attachments/assets/37fdda57-6186-4356-bb6e-5766e9711999" />


add product

<img width="1366" height="690" alt="addProduct" src="https://github.com/user-attachments/assets/1cf6e401-5abd-4550-87cd-a19ede618b83" />




## 📌 Project Wrap-Up


This project was developed as a graduation project by a dedicated team.

It showcases a complete e-commerce experience with Virtual Try-On functionality, admin control, and user personalization.

Feel free to explore the code, suggest improvements, or use parts of it for learning purposes.


🔗 LinkedIn: www.linkedin.com/in/amira-hassan-0371b3231
📬 For any questions or feedback, don’t hesitate to reach out!
