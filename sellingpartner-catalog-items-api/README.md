# swagger-java-client

Selling Partner API for Catalog Items
- API version: v0
  - Build date: 2020-12-15T20:17:36.166+08:00

The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.

  For more information, please visit [https://sellercentral.amazon.com/gp/mws/contactus.html](https://sellercentral.amazon.com/gp/mws/contactus.html)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.amazon.spapi.catalogitems.*;
import com.amazon.spapi.catalogitems.auth.*;
import com.amazon.spapi.catalogitems.model.*;
import com.amazon.spapi.catalogitems.api.CatalogApi;

import java.io.File;
import java.util.*;

public class CatalogApiExample {

    public static void main(String[] args) {
        
        CatalogApi apiInstance = new CatalogApi();
        String marketplaceId = "marketplaceId_example"; // String | A marketplace identifier. Specifies the marketplace for the item.
        String asin = "asin_example"; // String | The Amazon Standard Identification Number (ASIN) of the item.
        try {
            GetCatalogItemResponse result = apiInstance.getCatalogItem(marketplaceId, asin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getCatalogItem");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CatalogApi* | [**getCatalogItem**](docs/CatalogApi.md#getCatalogItem) | **GET** /catalog/v0/items/{asin} | 
*CatalogApi* | [**listCatalogCategories**](docs/CatalogApi.md#listCatalogCategories) | **GET** /catalog/v0/categories | 
*CatalogApi* | [**listCatalogItems**](docs/CatalogApi.md#listCatalogItems) | **GET** /catalog/v0/items | 


## Documentation for Models

 - [ASINIdentifier](docs/ASINIdentifier.md)
 - [AttributeSetList](docs/AttributeSetList.md)
 - [AttributeSetListType](docs/AttributeSetListType.md)
 - [Categories](docs/Categories.md)
 - [CreatorType](docs/CreatorType.md)
 - [DecimalWithUnits](docs/DecimalWithUnits.md)
 - [DimensionType](docs/DimensionType.md)
 - [Error](docs/Error.md)
 - [ErrorList](docs/ErrorList.md)
 - [GetCatalogItemResponse](docs/GetCatalogItemResponse.md)
 - [IdentifierType](docs/IdentifierType.md)
 - [Image](docs/Image.md)
 - [Item](docs/Item.md)
 - [ItemList](docs/ItemList.md)
 - [LanguageType](docs/LanguageType.md)
 - [ListCatalogCategoriesResponse](docs/ListCatalogCategoriesResponse.md)
 - [ListCatalogItemsResponse](docs/ListCatalogItemsResponse.md)
 - [ListMatchingItemsResponse](docs/ListMatchingItemsResponse.md)
 - [ListOfCategories](docs/ListOfCategories.md)
 - [NumberOfOfferListingsList](docs/NumberOfOfferListingsList.md)
 - [OfferListingCountType](docs/OfferListingCountType.md)
 - [Price](docs/Price.md)
 - [QualifiersType](docs/QualifiersType.md)
 - [RelationshipList](docs/RelationshipList.md)
 - [RelationshipType](docs/RelationshipType.md)
 - [SalesRankList](docs/SalesRankList.md)
 - [SalesRankType](docs/SalesRankType.md)
 - [SellerSKUIdentifier](docs/SellerSKUIdentifier.md)
 - [ShippingTimeType](docs/ShippingTimeType.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


