# How It Works

1. **Bean Identification**  
   Spring identifies `CardPayment` and `UPIPayment` as beans because of the `@Component` annotation.

2. **Automatic Injection**  
   These beans are automatically injected into the `Map<String, PaymentType>` in the `PaymentFactory`.

3. **Dynamic Implementation**  
   The factory provides the correct implementation based on the requested type (e.g., `cardPayment`, `upiPayment`, etc.).

4. **Scalability and Design Principle**  
   You can easily add new implementations of `PaymentType` without modifying the existing factory logic, adhering to the **Open/Closed Principle**.
