# FristDemoPrj-3
Product API Collection

A comprehensive Postman collection for managing products through a RESTful API. This collection includes all CRUD (Create, Read, Update, Delete) operations for product management.

 Base URL
http://localhost:8123


Method: POST

Endpoint: /api/products
Description: Create a new product with details like name, description, price, quantity, and purchase date.

The collection contains 5 requests for a Product API:

Create Product
 - POST http://localhost:8123/products.api/create

Creates products with: description, purchased date, qty, and price
Get Product by ID
 - GET http://localhost:8123/products.api/1 

Get All Products
 - GET http://localhost:8123/api/products/all

Update Product
 - PUT http://localhost:8123/products.api/
 - can be updated by json


Delete Product
 - DELETE http://localhost:8123/products.api/delete/{id}

 1. Create Product

``` 
http://localhost:8123/product.api/create

```

```
{
    "name":"Apple",
  "description": "Sample Product",
  "purchased": "2024-01-15",
  "qty": 10,
  "price": 9999
```

 2. Get All Products
    
Method: GET
Endpoint: /products.api/all
Description: Retrieve a list of all products in the system

```http://localhost:8123/product.api/all ```

 3. Get Product by ID
Method: GET
Endpoint: /products.api/:id
Description: Retrieve details of a specific product by its ID


 4. Update Product
 5. 
Method: PUT
Endpoint: /products.api/update/:id
Description: Update an existing product's information we update produst Apple to another product

```
http://localhost:8123/product.api/update/1

{
    "name":"oppo-new-model",
  "description": "Updated Product",
  "purchased": "2024-01-20",
  "qty": 15,
  "price": 10999.99
}

 ```

```
{
    "name":"oppo-new-model", // from Apple to oppo
  "description": "Updated Product",
  "purchased": "2024-01-20",
  "qty": 1,
  "price": 10999.99
}

```

 5. Delete Product
    
Method: DELETE
Endpoint: /products.api/delete/:id
Description: Remove a product from the system

```
http://localhost:8123/product.api/delete/1

Product with ID 1 deleted successfully

```


Usage
Import this collection into Postman

Ensure your API server is running on localhost:8123

Start with the "Create Product" request to add products

Use "Get All Products" to view all available products

Use the ID from created products to test Get, Update, and Delete operations

Notes:

Replace :id in the URL with an actual product ID

Ensure the API server is running before sending requests

All requests use JSON format for request/response bodies
