package org.example.domain_model;

import jakarta.validation.ConstraintViolation;
import junit.framework.TestCase;
import org.example.Helper.Validator;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

public class TestingValidators extends TestCase {



   @Test
    public void testingUserValidators(){
       Address address = new Address("Ho Chi Minh", "Thu Duc", "Linh Trung ward", "16 street 7");
       SystemAdmin systemAdmin = new SystemAdmin("1234567890", "Luong Thanh Trung", "0", address, "trungluong@gmail.com", "123456790");

       Set<ConstraintViolation<SystemAdmin>> violations = Validator.validate(systemAdmin);
       Iterator<ConstraintViolation<SystemAdmin>> iterator = violations.iterator();
       while(iterator.hasNext()){
          ConstraintViolation<SystemAdmin> violation = iterator.next();
          System.out.println(violation.getMessage());
       }
       assertFalse(violations.isEmpty());
   }
}