# Post Service REST API

A simple **RESTful API project** built to understand and practice REST API design, CRUD operations, PostgreSQL database integration, and API testing using Postman.

The project manages posts containing a title, description, and media URL.

## 🎯 Purpose

This project was created to gain practical familiarity with REST APIs and understand how CRUD-based APIs work with a database.

The main objectives were to understand:

- REST API design
- HTTP methods and their appropriate usage
- CRUD operations
- API endpoint structure
- Request and response handling
- PostgreSQL database integration
- API testing using Postman
- Automatic ID generation for database records

## ✨ Features

- Create a new post
- Retrieve all posts
- Retrieve a post by ID
- Update an existing post
- Delete a post
- Automatically generate a unique ID for each post
- Store post data in PostgreSQL
- Store media as a URL rather than the actual media file
- Test API endpoints using Postman

## 🗂️ Post Structure

Each post contains:

| Field | Description |
|---|---|
| `id` | Automatically generated unique identifier |
| `title` | Title of the post |
| `description` | Description/content of the post |
| `mediaUrl` | URL pointing to the post's media |

Example response:

```json
{
  "id": 1,
  "title": "My First Post",
  "description": "Learning REST APIs.",
  "mediaUrl": "https://example.com/images/post.jpg"
}
```

The `id` is generated automatically when a new post is created. It does not need to be included in the create request.

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/posts` | Create a new post |
| `GET` | `/posts` | Retrieve all posts |
| `GET` | `/posts/{id}` | Retrieve a post by ID |
| `PUT` | `/posts/{id}` | Update an existing post |
| `DELETE` | `/posts/{id}` | Delete a post |

### Create Post

```http
POST /posts
```

Request body:

```json
{
  "title": "My First Post",
  "description": "Learning REST API development.",
  "mediaUrl": "https://example.com/image.jpg"
}
```

The `id` is generated automatically by the system.

### Get All Posts

```http
GET /posts
```

### Get Post By ID

```http
GET /posts/{id}
```

Example:

```http
GET /posts/1
```

### Update Post

```http
PUT /posts/{id}
```

Example request body:

```json
{
  "title": "Updated Post",
  "description": "Updated description.",
  "mediaUrl": "https://example.com/updated-image.jpg"
}
```

The existing post ID is provided through the URL.

### Delete Post

```http
DELETE /posts/{id}
```

Example:

```http
DELETE /posts/1
```

## 🗄️ Database

The project uses **PostgreSQL** to store post information.

The database automatically generates a unique ID for each post.

Conceptually, the database structure is:

```text
posts
├── id            → Auto-generated
├── title
├── description
└── media_url
```

The `media_url` column stores the URL of the media rather than the actual media file.

## 🧪 API Testing

The API endpoints were tested using **Postman**.

The following operations were tested:

- Creating posts
- Fetching all posts
- Fetching a post by ID
- Updating posts
- Deleting posts
- Verifying API responses
- Verifying HTTP status codes
- Testing automatically generated post IDs

## 🛠️ Technologies

- REST API
- PostgreSQL
- Postman
- HTTP
- JSON

## 📚 What I Learned

Through this project, I gained practical experience with:

- RESTful API principles
- CRUD operations
- HTTP methods
- API endpoint design
- JSON request and response structures
- Database-backed APIs
- PostgreSQL basics
- Auto-generated database IDs
- API testing with Postman

## 🚀 Future Improvements

Possible improvements for future versions include:

- Implementing the API using Java and Spring Boot
- Request validation
- Global exception handling
- Pagination and sorting
- Swagger/OpenAPI documentation
- Unit and integration testing
- Authentication and authorization

## 👨‍💻 Author

**Nikhil Kumar**

This project was created as part of my learning journey in **Backend Development and REST API Design**.