/*
 * package com.example.demo;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.junit.Assert.assertNotNull; import static org.junit.Assert.assertTrue;
 * 
 * import org.json.JSONException; import org.junit.Ignore; import
 * org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.web.client.TestRestTemplate; import
 * org.springframework.http.HttpEntity; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.ing.controller.*; import com.ing.domain.*; import
 * com.ing.repository.*; import com.ing.service.*;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
 * public class StockControllerTest {
 * 
 * TestRestTemplate restTemplate = new TestRestTemplate(); HttpHeaders headers =
 * new HttpHeaders();
 * 
 * 
 * @Test public void getStock() throws JSONException { HttpEntity<String> entity
 * = new HttpEntity<String>(null, headers);
 * 
 * ResponseEntity<String> response = restTemplate.exchange(
 * createURLWithPort("/stock/1"), HttpMethod.GET, entity, String.class);
 * 
 * assertNotNull(response); //assertEquals(200, response.getStatusCode()); }
 * 
 * private String createURLWithPort(String uri) { return
 * "http://localhost:8080/api/v1" + uri; }
 * 
 * }
 */