# CustomersApi

All URIs are relative to *https://api.server.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v3CustomersGet**](CustomersApi.md#v3CustomersGet) | **GET** /v3/customers | List of customers
[**v4CustomersPost**](CustomersApi.md#v4CustomersPost) | **POST** /v4/customers | Creating A new Customer


<a name="v3CustomersGet"></a>
# **v3CustomersGet**
> CustomerPagedList v3CustomersGet(pageNumber, pageSize)

List of customers

List of customers in the system which is pageable and will be something else &gt; more things to know 1. hello 2. else 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    Integer pageNumber = 0; // Integer | Given Page Number
    Integer pageSize = 100; // Integer | Given Number of Results to return per page
    try {
      CustomerPagedList result = apiInstance.v3CustomersGet(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#v3CustomersGet");
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
 **pageNumber** | **Integer**| Given Page Number | [optional] [default to 0]
 **pageSize** | **Integer**| Given Number of Results to return per page | [optional] [default to 100]

### Return type

[**CustomerPagedList**](CustomerPagedList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Customers |  -  |

<a name="v4CustomersPost"></a>
# **v4CustomersPost**
> v4CustomersPost(customer)

Creating A new Customer

When creating a new Customer the following needs to be true: 1. Customer needs name and address 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    Customer customer = new Customer(); // Customer | 
    try {
      apiInstance.v4CustomersPost(customer);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#v4CustomersPost");
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
 **customer** | [**Customer**](Customer.md)|  |

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
**201** | Customer Created |  * location - Location of the creatd customer <br>  |

