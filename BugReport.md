### **2. Bug Reports**

#### **2.1 Bug 1: Product Images Not Displaying**
**ID**: BUG01  
**Title**: Product Images Not Displaying  
**Severity**: Major  
**Steps**:
1. Open a product page.
2. Observe the product image section.  
   **Actual**: Images do not load; a placeholder is shown instead.  
   **Expected**: Product images should load correctly.


#### **2.2 Bug 2: No Validation for Phone Number Format**
**ID**: BUG02  
**Title**: Invalid Phone Number Format  
**Severity**: Medium  
**Steps**:
1. On the checkout page, enter an invalid phone number (e.g., `abc123`).
2. Submit the form.  
   **Actual**: The form is submitted successfully without any validation error.  
   **Expected**: An error message should appear, such as "Invalid phone number format".
