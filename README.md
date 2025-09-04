# Hotel Scheduling Application – Multithreaded Java & Cloud Deployment

**Summary**  
This project demonstrates my ability to build and extend a full-stack application using **Java Spring Boot** and **Angular**, apply **multithreaded programming**, and deliver features like localization, currency display, and time zone conversion. I containerized the solution with **Docker** and outlined deployment to **Azure Cloud Services**, showcasing skills in backend development, cloud readiness, and professional software practices.

[![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)](https://www.java.com/)  [![Spring Boot](https://img.shields.io/badge/Spring-Boot-6DB33F?logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)  [![Angular](https://img.shields.io/badge/Angular-EE0028?logo=angular&logoColor=white)](https://angular.io/)  [![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)](https://www.docker.com/)  [![GitLab](https://img.shields.io/badge/GitLab-FC6D26?logo=gitlab&logoColor=white)](https://gitlab.com/)  

## Overview  
This project is a **full-stack scheduling application** for the Landon Hotel, built with a **Java Spring Boot back end** and an **Angular front end**.  

It was extended to meet international business requirements by implementing **multithreading, localization, currency display, and time zone conversion**. The project also demonstrates **containerization with Docker** and explores **deployment strategies to cloud services**.  

The application showcases industry-relevant skills in **object-oriented programming, multithreading, cloud deployment, and full-stack development**.  

---

## Features  

- **Multithreaded Language Translation**  
  - Resource bundles for **English** and **French**  
  - Welcome messages displayed in both languages simultaneously using separate threads  

- **International Currency Display**  
  - Reservation pricing shown in:  
    - **USD ($)**  
    - **CAD (CA$)**  
    - **EUR (€)**  

- **Time Zone Conversion**  
  - Converts live presentation times between **Eastern Time (ET)**, **Mountain Time (MT)**, and **Coordinated Universal Time (UTC)**  

- **Dockerized Deployment**  
  - Custom `Dockerfile` builds a single image containing the complete application  
  - Verified by running in a named container: `D387_[studentID]`  

-  **Cloud-Ready Design**  
  - Deployment strategy described for **Azure Cloud Services**  
  - Supports scalability and container-based hosting  

---

## Tech Stack  

- **Languages & Frameworks:**  
  - Java 17, Spring Boot  
  - Angular, TypeScript, HTML, CSS  

- **Tools & Services:**  
  - Docker  
  - IntelliJ IDEA (Ultimate Edition)  
  - GitLab (version control & CI/CD)  
  - Cloud: Azure (planned deployment)  

---

## Installation & Usage  

### Clone the Repository  
```bash
git clone https://gitlab.com/your-username/landon-hotel.git
cd landon-hotel
```
### Run the Backend
```bash
cd backend
./mvnw spring-boot:run
```

### Run the Frontend
```bash
cd frontend
npm install
ng serve --open
```


