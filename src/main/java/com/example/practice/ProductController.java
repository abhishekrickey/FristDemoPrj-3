
 package com.example.practice;
 
 

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;
 import java.util.Optional;

 @RestController
 @RequestMapping("/product.api")
 public class ProductController {
     
     @Autowired
     private ProductRepository productRepository;
     
     // CREATE - POST /product.api/create
     @PostMapping("/create")
     public ResponseEntity<?> createProduct(@RequestBody Product product) {
         // Basic validation
         if (product.getName() == null || product.getName().trim().isEmpty()) {
             return ResponseEntity.badRequest().body("Product name is required");
         }
         if (product.getPrice() < 0) {
             return ResponseEntity.badRequest().body("Price cannot be negative");
         }
         if (product.getQty() < 0) {
             return ResponseEntity.badRequest().body("Quantity cannot be negative");
         }
         
         Product savedProduct = productRepository.save(product);
         return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
     }
     
     // READ ALL - GET /product.api/all
     @GetMapping("/all")
     public ResponseEntity<List<Product>> getAllProducts() {
         List<Product> products = productRepository.findAll();
         return ResponseEntity.ok(products);
     }
     
     // READ BY ID - GET /product.api/{id}
     @GetMapping("/{id}")
     public ResponseEntity<?> getProductById(@PathVariable long id) {
         Optional<Product> product = productRepository.findById(id);
         
         if (product.isPresent()) {
             return ResponseEntity.ok(product.get());
         } else {
             return ResponseEntity.status(HttpStatus.NOT_FOUND)
                     .body("Product with ID " + id + " not found");
         }
     }
     
     // UPDATE - PUT /product.api/update/{id}
     @PutMapping("/update/{id}")
     public ResponseEntity<?> updateProduct(@PathVariable long id, @RequestBody Product productDetails) {
         Optional<Product> existingProduct = productRepository.findById(id);
         
         if (!existingProduct.isPresent()) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND)
                     .body("Product with ID " + id + " not found");
         }
         
         // Basic validation
         if (productDetails.getName() == null || productDetails.getName().trim().isEmpty()) {
             return ResponseEntity.badRequest().body("Product name is required");
         }
         if (productDetails.getPrice() < 0) {
             return ResponseEntity.badRequest().body("Price cannot be negative");
         }
         if (productDetails.getQty() < 0) {
             return ResponseEntity.badRequest().body("Quantity cannot be negative");
         }
         
         Product product = existingProduct.get();
         product.setName(productDetails.getName());
         product.setDescription(productDetails.getDescription());
         product.setQty(productDetails.getQty());
         product.setPrice(productDetails.getPrice());
         product.setPurchased(productDetails.getPurchased());
         
         Product updatedProduct = productRepository.save(product);
         return ResponseEntity.ok(updatedProduct);
     }
     
     // DELETE - DELETE /product.api/delete/{id}
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<?> deleteProduct(@PathVariable long id) {
         Optional<Product> product = productRepository.findById(id);
         
         if (!product.isPresent()) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND)
                     .body("Product with ID " + id + " not found");
         }
         
         productRepository.deleteById(id);
         return ResponseEntity.ok("Product with ID " + id + " deleted successfully");
     }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 /* 
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * 
 * @RequestMapping("/product.api") //http://localhost:8123/product/api public
 * class ProductController {
 * 
 * @Autowired ProductRepository repository;
 * 
 * @PostMapping("/create")//http://localhost:8123/product/api//create public
 * Product addProduct(@RequestBody Product product) { product
 * =repository.save(product); System.out.println("add product" +product); return
 * product; }
 * 
 * 
 * }
 */