# FristDemoPrj-3
Product API Collection
A comprehensive Postman collection for managing products through a RESTful API. This collection includes all CRUD (Create, Read, Update, Delete) operations for product management.

 Base URL
http://localhost:8080
http://localhost:8080
Endpoints
 1. Create Product
Method: POST
Endpoint: /api/products
Description: Create a new product with details like name, description, price, quantity, and purchase date.
```
{
    "name":"Apple",
  "description": "Sample Product",
  "purchased": "2024-01-15",
  "qty": 10,
  "price": 9999
```
 3. Get All Products
Method: GET
Endpoint: /api/products
Description: Retrieve a list of all products in the system
 4. Get Product by ID
Method: GET
Endpoint: /api/products/:id
Description: Retrieve details of a specific product by its ID
 5. Update Product
Method: PUT
Endpoint: /api/products/:id
Description: Update an existing product's information
 6. Delete Product
Method: DELETE
Endpoint: /api/products/:id
Description: Remove a product from the system
Usage
Import this collection into Postman
Ensure your API server is running on localhost:8080
Start with the "Create Product" request to add products
Use "Get All Products" to view all available products
Use the ID from created products to test Get, Update, and Delete operations
Notes
Replace :id in the URL with an actual product ID
Ensure the API server is running before sending requests
All requests use JSON format for request/response bodies
