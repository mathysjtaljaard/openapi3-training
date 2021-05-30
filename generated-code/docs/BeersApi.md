# BeersApi

All URIs are relative to *https://api.server.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listBeersV1**](BeersApi.md#listBeersV1) | **GET** /v1/listbeers | 
[**v2BeersBeerIdDelete**](BeersApi.md#v2BeersBeerIdDelete) | **DELETE** /v2/beers/{beerId} | 
[**v2BeersBeerIdGet**](BeersApi.md#v2BeersBeerIdGet) | **GET** /v2/beers/{beerId} | 
[**v2BeersBeerIdPut**](BeersApi.md#v2BeersBeerIdPut) | **PUT** /v2/beers/{beerId} | Update the beer
[**v3CreateBeerPost**](BeersApi.md#v3CreateBeerPost) | **POST** /v3/createBeer | It&#39;s time to introduce a new beer


<a name="listBeersV1"></a>
# **listBeersV1**
> List&lt;Beer&gt; listBeersV1(pageNumber, pageSize)



returns a list of beers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeersApi;

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

    BeersApi apiInstance = new BeersApi(defaultClient);
    Integer pageNumber = 0; // Integer | Given Page Number
    Integer pageSize = 100; // Integer | Given Number of Results to return per page
    try {
      List<Beer> result = apiInstance.listBeersV1(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeersApi#listBeersV1");
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

[**List&lt;Beer&gt;**](Beer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |

<a name="v2BeersBeerIdDelete"></a>
# **v2BeersBeerIdDelete**
> v2BeersBeerIdDelete(beerId)



Delete beer, it was bad

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeersApi;

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

    BeersApi apiInstance = new BeersApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Retrieve beer given beer id
    try {
      apiInstance.v2BeersBeerIdDelete(beerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeersApi#v2BeersBeerIdDelete");
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
 **beerId** | [**UUID**](.md)| Retrieve beer given beer id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Beer Deleted |  -  |
**404** | Not Found |  -  |

<a name="v2BeersBeerIdGet"></a>
# **v2BeersBeerIdGet**
> Beer v2BeersBeerIdGet(beerId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeersApi;

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

    BeersApi apiInstance = new BeersApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Retrieve beer given beer id
    try {
      Beer result = apiInstance.v2BeersBeerIdGet(beerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeersApi#v2BeersBeerIdGet");
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
 **beerId** | [**UUID**](.md)| Retrieve beer given beer id |

### Return type

[**Beer**](Beer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Found beer |  -  |
**404** | Not Found |  -  |

<a name="v2BeersBeerIdPut"></a>
# **v2BeersBeerIdPut**
> v2BeersBeerIdPut(beerId, beer)

Update the beer

Updating the beer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeersApi;

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

    BeersApi apiInstance = new BeersApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Retrieve beer given beer id
    Beer beer = new Beer(); // Beer | 
    try {
      apiInstance.v2BeersBeerIdPut(beerId, beer);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeersApi#v2BeersBeerIdPut");
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
 **beerId** | [**UUID**](.md)| Retrieve beer given beer id |
 **beer** | [**Beer**](Beer.md)|  |

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
**204** | Beer Updated |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |

<a name="v3CreateBeerPost"></a>
# **v3CreateBeerPost**
> v3CreateBeerPost(beer)

It&#39;s time to introduce a new beer

Create a new tasty Beer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeersApi;

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

    BeersApi apiInstance = new BeersApi(defaultClient);
    Beer beer = new Beer(); // Beer | 
    try {
      apiInstance.v3CreateBeerPost(beer);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeersApi#v3CreateBeerPost");
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
 **beer** | [**Beer**](Beer.md)|  |

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
**201** | Beer Created |  * location - Location of created beer object <br>  |
**400** | Bad request |  -  |
**409** | Conflict |  -  |

