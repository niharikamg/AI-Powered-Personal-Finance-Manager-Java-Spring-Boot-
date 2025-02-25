# 💰 AI-Powered Personal Finance Manager

## 📌 Overview
This project is an **AI-powered personal finance manager** that helps users **track expenses, categorize spending, and predict future expenses** using **machine learning and financial analytics**.

## 🚀 Features
- ✅ **AI-Powered Budgeting** – Predicts **future expenses and savings** based on past data.
- ✅ **Automated Expense Categorization** – Uses **AI to classify expenses** (Rent, Food, Travel, etc.).
- ✅ **Financial Insights & Reports** – Generates monthly **spending summaries & analytics**.
- ✅ **Transaction Import (Optional)** – Can be connected to **bank APIs (Plaid API)**.
- ✅ **REST API for Integration** – Can be used by **FinTech platforms & banking apps**.
- ✅ **Docker Support** – Deploy using Docker.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Machine Learning:** Python (Scikit-learn, RandomForest)  
- **Database:** PostgreSQL  
- **Authentication:** Spring Security + JWT (Future Enhancement)  
- **Deployment:** Docker & AWS  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/finance/
│   │   ├── Application.java
│   │   ├── controller/ExpenseController.java
│   │   ├── service/ExpenseService.java
│   │   ├── model/Expense.java
│   │   ├── repository/ExpenseRepository.java
│   ├── resources/application.properties
├── database/
│   ├── schema.sql
├── ai_model/
│   ├── spending_prediction.py
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/AI-Powered-Personal-Finance-Manager.git
cd AI-Powered-Personal-Finance-Manager
```

### **2️⃣ Run PostgreSQL Database**
```bash
docker-compose up --build
```

### **3️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **4️⃣ Train the AI Model (Optional)**
```bash
cd ai_model
python spending_prediction.py
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint                 | Description                      |
|--------|---------------------------|----------------------------------|
| POST   | `/api/expenses`           | Add a new expense                |
| GET    | `/api/expenses`           | Get all expenses                 |
| GET    | `/api/expenses/predict`   | Predict future spending          |

### **Example API Request**
```json
POST /api/expenses
{
  "category": "Food",
  "amount": 50.00,
  "date": "2025-02-24"
}
```

#### **Example API Response**
```json
{
  "id": 1,
  "category": "Food",
  "amount": 50.00,
  "date": "2025-02-24"
}
```

## 📝 Future Enhancements
- 📈 **AI Model Improvement with LSTM for better predictions**  
- 📊 **Finance Dashboard UI with React.js**  
- 🔒 **User Authentication (Spring Security + JWT)**  

---  

🚀 **Like this project? Star it on GitHub!** ⭐  
