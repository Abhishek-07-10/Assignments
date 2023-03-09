# Chat Application
## FrameWork and Language Used
- SpringBoot
- Java
<br><br>
## DataBase Used
- MySql
<br><br>
## Controller
- UserController
- StatusController
- ChatHistoryController
<br><br>
## Service
- UserService
- StatusService
- ChatHistoryService
<br><br>
## Model
- User
- Status
- ChatHistory
<br><br>
## Repository
- UserRepository
- StatusRepository
- ChatRepository
<br><br>
## Project Summary
- Here in this project we are performing CRUD operations and making possible to have conversation between two users personally and saving the Data in the DataBase and as follows :
<br><br>
  ### User
  - PostMapping -> http://localhost:8080/api/v1/user/create-user
  ![create user](create%20user.png)<br><br>
  - PostMapping -> http://localhost:8080/api/v1/user/login (To Login)
  - GetMapping -> http://localhost:8080/api/v1/user/get-users
  - DeleteMapping -> http://localhost:8080/api/v1/user/delete-user/6
  <br><br>
  ### Status
  - PostMapping -> http://localhost:8080/api/v1/status/create-status
  <br><br>
  ### ChatHistory
  - PostMapping -> http://localhost:8080/api/v1/chat/send-message
  ![send message](send%20messages.png)<br><br>
  - GetMapping -> http://localhost:8080/api/v1/chat/get-chat?userId=1 (Get Chats By UserId)
  - GetMapping -> http://localhost:8080/api/v1/chat/get-conversation?user1=1&user2=3 (Get Conversation by Users UserId)