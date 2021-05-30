# BeerOrderingServiceApi

All URIs are relative to *https://api.server.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v4CustomersCustomerIdOrdersPost**](BeerOrderingServiceApi.md#v4CustomersCustomerIdOrdersPost) | **POST** /v4/customers/{customerId}/orders | 


<a name="v4CustomersCustomerIdOrdersPost"></a>
# **v4CustomersCustomerIdOrdersPost**
> v4CustomersCustomerIdOrdersPost(customer, beerOrder)



Place order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerOrderingServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.server.test/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: JwtAuthToken
    HttpBearerAuth JwtAuthToken = (HttpBearerAuth) defaultClient.getAuthentication("JwtAuthToken");
    JwtAuthToken.setBearerToken("BEARER TOKEN");

    BeerOrderingServiceApi apiInstance = new BeerOrderingServiceApi(defaultClient);
    UUID customer = new UUID(); // UUID | Retrieve customer given customer id
    BeerOrder beerOrder = new BeerOrder(); // BeerOrder | 
    try {
      apiInstance.v4CustomersCustomerIdOrdersPost(customer, beerOrder);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerOrderingServiceApi#v4CustomersCustomerIdOrdersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**UUID**](.md)| Retrieve customer given customer id |
 **beerOrder** | [**BeerOrder**](BeerOrder.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order Created |  * location - Refernce to created order <br>  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |

