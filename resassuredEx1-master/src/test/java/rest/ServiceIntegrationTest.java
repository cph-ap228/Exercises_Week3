package rest;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.BeforeClass;

/**
 *
 * @author Maksymilian
 */
public class ServiceIntegrationTest { 
  
    @BeforeClass
    public static void setUpBeforeAll() {
    RestAssured.baseURI = "http://localhost";
    RestAssured.port = 8080;
    RestAssured.basePath = "/Test1";
    RestAssured.defaultParser = Parser.JSON;
  }

    }
    
   