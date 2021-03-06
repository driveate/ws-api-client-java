# ModelsApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelsList**](ModelsApi.md#modelsList) | **GET** /models/ | Returns a list of models by manufacturer
[**modelsRead**](ModelsApi.md#modelsRead) | **GET** /models/{make}/{slug}/ | Get more info about model
[**modelsReadYear**](ModelsApi.md#modelsReadYear) | **GET** /models/{make}/{slug}/{year}/ | Get more info about model/year


<a name="modelsList"></a>
# **modelsList**
> List&lt;Model&gt; modelsList(make, year, lang)

Returns a list of models by manufacturer

Get a list of models that match given manufacturer and year (if present)

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.ModelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

ModelsApi apiInstance = new ModelsApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
Integer year = 56; // Integer | You can use _**`GET /years/`**_ to get possible years (e.g. `2015`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn,zh-tw`. Currently translation works for chinese `zh-cn` language only
try {
    List<Model> result = apiInstance.modelsList(make, year, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#modelsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **year** | **Integer**| You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) | [optional]
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]

### Return type

[**List&lt;Model&gt;**](Model.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelsRead"></a>
# **modelsRead**
> ModelWithTires modelsRead(make, slug, lang)

Get more info about model

Get the detailed information about model series

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.ModelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

ModelsApi apiInstance = new ModelsApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
String slug = "\"outlander\""; // String | Model slug name, use _**`GET /models/`**_ to get possible values (e.g. `outlander`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn,zh-tw`. Currently translation works for chinese `zh-cn` language only
try {
    ModelWithTires result = apiInstance.modelsRead(make, slug, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#modelsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **slug** | **String**| Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) |
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]

### Return type

[**ModelWithTires**](ModelWithTires.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelsReadYear"></a>
# **modelsReadYear**
> ModelWithTires modelsReadYear(make, slug, year, lang)

Get more info about model/year



### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.ModelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

ModelsApi apiInstance = new ModelsApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
String slug = "\"outlander\""; // String | Model slug name, use _**`GET /models/`**_ to get possible values (e.g. `outlander`)
Integer year = 2015; // Integer | You can use _**`GET /years/`**_ to get possible years (e.g. `2015`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn,zh-tw`. Currently translation works for chinese `zh-cn` language only
try {
    ModelWithTires result = apiInstance.modelsReadYear(make, slug, year, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#modelsReadYear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **slug** | **String**| Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) |
 **year** | **Integer**| You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) |
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]

### Return type

[**ModelWithTires**](ModelWithTires.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

