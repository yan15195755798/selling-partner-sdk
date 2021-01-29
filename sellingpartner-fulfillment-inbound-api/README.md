# swagger-java-client

Selling Partner API for Fulfillment Inbound
- API version: v0
  - Build date: 2020-12-15T20:38:48.493+08:00

The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.

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

import com.amazon.spapi.fulfillmentinbound.*;
import com.amazon.spapi.fulfillmentinbound.auth.*;
import com.amazon.spapi.fulfillmentinbound.model.*;
import com.amazon.spapi.fulfillmentinbound.api.FbaInboundApi;

import java.io.File;
import java.util.*;

public class FbaInboundApiExample {

    public static void main(String[] args) {
        
        FbaInboundApi apiInstance = new FbaInboundApi();
        String shipmentId = "shipmentId_example"; // String | A shipment identifier originally returned by the createInboundShipmentPlan operation.
        LocalDate needByDate = LocalDate.now(); // LocalDate | Date that the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items. Must be in YYYY-MM-DD format. The response to the getPreorderInfo operation returns this value.
        String marketplaceId = "marketplaceId_example"; // String | A marketplace identifier. Specifies the marketplace the shipment is tied to.
        try {
            ConfirmPreorderResponse result = apiInstance.confirmPreorder(shipmentId, needByDate, marketplaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FbaInboundApi#confirmPreorder");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FbaInboundApi* | [**confirmPreorder**](docs/FbaInboundApi.md#confirmPreorder) | **PUT** /fba/inbound/v0/shipments/{shipmentId}/preorder/confirm | 
*FbaInboundApi* | [**confirmTransport**](docs/FbaInboundApi.md#confirmTransport) | **POST** /fba/inbound/v0/shipments/{shipmentId}/transport/confirm | 
*FbaInboundApi* | [**createInboundShipment**](docs/FbaInboundApi.md#createInboundShipment) | **POST** /fba/inbound/v0/shipments/{shipmentId} | 
*FbaInboundApi* | [**createInboundShipmentPlan**](docs/FbaInboundApi.md#createInboundShipmentPlan) | **POST** /fba/inbound/v0/plans | 
*FbaInboundApi* | [**estimateTransport**](docs/FbaInboundApi.md#estimateTransport) | **POST** /fba/inbound/v0/shipments/{shipmentId}/transport/estimate | 
*FbaInboundApi* | [**getBillOfLading**](docs/FbaInboundApi.md#getBillOfLading) | **GET** /fba/inbound/v0/shipments/{shipmentId}/billOfLading | 
*FbaInboundApi* | [**getInboundGuidance**](docs/FbaInboundApi.md#getInboundGuidance) | **GET** /fba/inbound/v0/itemsGuidance | 
*FbaInboundApi* | [**getLabels**](docs/FbaInboundApi.md#getLabels) | **GET** /fba/inbound/v0/shipments/{shipmentId}/labels | 
*FbaInboundApi* | [**getPreorderInfo**](docs/FbaInboundApi.md#getPreorderInfo) | **GET** /fba/inbound/v0/shipments/{shipmentId}/preorder | 
*FbaInboundApi* | [**getPrepInstructions**](docs/FbaInboundApi.md#getPrepInstructions) | **GET** /fba/inbound/v0/prepInstructions | 
*FbaInboundApi* | [**getShipmentItems**](docs/FbaInboundApi.md#getShipmentItems) | **GET** /fba/inbound/v0/shipmentItems | 
*FbaInboundApi* | [**getShipmentItemsByShipmentId**](docs/FbaInboundApi.md#getShipmentItemsByShipmentId) | **GET** /fba/inbound/v0/shipments/{shipmentId}/items | 
*FbaInboundApi* | [**getShipments**](docs/FbaInboundApi.md#getShipments) | **GET** /fba/inbound/v0/shipments | 
*FbaInboundApi* | [**getTransportDetails**](docs/FbaInboundApi.md#getTransportDetails) | **GET** /fba/inbound/v0/shipments/{shipmentId}/transport | 
*FbaInboundApi* | [**putTransportDetails**](docs/FbaInboundApi.md#putTransportDetails) | **PUT** /fba/inbound/v0/shipments/{shipmentId}/transport | 
*FbaInboundApi* | [**updateInboundShipment**](docs/FbaInboundApi.md#updateInboundShipment) | **PUT** /fba/inbound/v0/shipments/{shipmentId} | 
*FbaInboundApi* | [**voidTransport**](docs/FbaInboundApi.md#voidTransport) | **POST** /fba/inbound/v0/shipments/{shipmentId}/transport/void | 


## Documentation for Models

 - [ASINInboundGuidance](docs/ASINInboundGuidance.md)
 - [ASINInboundGuidanceList](docs/ASINInboundGuidanceList.md)
 - [ASINPrepInstructions](docs/ASINPrepInstructions.md)
 - [ASINPrepInstructionsList](docs/ASINPrepInstructionsList.md)
 - [Address](docs/Address.md)
 - [AmazonPrepFeesDetails](docs/AmazonPrepFeesDetails.md)
 - [AmazonPrepFeesDetailsList](docs/AmazonPrepFeesDetailsList.md)
 - [Amount](docs/Amount.md)
 - [BarcodeInstruction](docs/BarcodeInstruction.md)
 - [BillOfLadingDownloadURL](docs/BillOfLadingDownloadURL.md)
 - [BoxContentsFeeDetails](docs/BoxContentsFeeDetails.md)
 - [BoxContentsSource](docs/BoxContentsSource.md)
 - [CommonTransportResult](docs/CommonTransportResult.md)
 - [Condition](docs/Condition.md)
 - [ConfirmPreorderResponse](docs/ConfirmPreorderResponse.md)
 - [ConfirmPreorderResult](docs/ConfirmPreorderResult.md)
 - [ConfirmTransportResponse](docs/ConfirmTransportResponse.md)
 - [Contact](docs/Contact.md)
 - [CreateInboundShipmentPlanRequest](docs/CreateInboundShipmentPlanRequest.md)
 - [CreateInboundShipmentPlanResponse](docs/CreateInboundShipmentPlanResponse.md)
 - [CreateInboundShipmentPlanResult](docs/CreateInboundShipmentPlanResult.md)
 - [CurrencyCode](docs/CurrencyCode.md)
 - [Dimensions](docs/Dimensions.md)
 - [Error](docs/Error.md)
 - [ErrorList](docs/ErrorList.md)
 - [ErrorReason](docs/ErrorReason.md)
 - [EstimateTransportResponse](docs/EstimateTransportResponse.md)
 - [GetBillOfLadingResponse](docs/GetBillOfLadingResponse.md)
 - [GetInboundGuidanceResponse](docs/GetInboundGuidanceResponse.md)
 - [GetInboundGuidanceResult](docs/GetInboundGuidanceResult.md)
 - [GetLabelsResponse](docs/GetLabelsResponse.md)
 - [GetPreorderInfoResponse](docs/GetPreorderInfoResponse.md)
 - [GetPreorderInfoResult](docs/GetPreorderInfoResult.md)
 - [GetPrepInstructionsResponse](docs/GetPrepInstructionsResponse.md)
 - [GetPrepInstructionsResult](docs/GetPrepInstructionsResult.md)
 - [GetShipmentItemsResponse](docs/GetShipmentItemsResponse.md)
 - [GetShipmentItemsResult](docs/GetShipmentItemsResult.md)
 - [GetShipmentsResponse](docs/GetShipmentsResponse.md)
 - [GetShipmentsResult](docs/GetShipmentsResult.md)
 - [GetTransportDetailsResponse](docs/GetTransportDetailsResponse.md)
 - [GetTransportDetailsResult](docs/GetTransportDetailsResult.md)
 - [GuidanceReason](docs/GuidanceReason.md)
 - [GuidanceReasonList](docs/GuidanceReasonList.md)
 - [InboundGuidance](docs/InboundGuidance.md)
 - [InboundShipmentHeader](docs/InboundShipmentHeader.md)
 - [InboundShipmentInfo](docs/InboundShipmentInfo.md)
 - [InboundShipmentItem](docs/InboundShipmentItem.md)
 - [InboundShipmentItemList](docs/InboundShipmentItemList.md)
 - [InboundShipmentList](docs/InboundShipmentList.md)
 - [InboundShipmentPlan](docs/InboundShipmentPlan.md)
 - [InboundShipmentPlanItem](docs/InboundShipmentPlanItem.md)
 - [InboundShipmentPlanItemList](docs/InboundShipmentPlanItemList.md)
 - [InboundShipmentPlanList](docs/InboundShipmentPlanList.md)
 - [InboundShipmentPlanRequestItem](docs/InboundShipmentPlanRequestItem.md)
 - [InboundShipmentPlanRequestItemList](docs/InboundShipmentPlanRequestItemList.md)
 - [InboundShipmentRequest](docs/InboundShipmentRequest.md)
 - [InboundShipmentResponse](docs/InboundShipmentResponse.md)
 - [InboundShipmentResult](docs/InboundShipmentResult.md)
 - [IntendedBoxContentsSource](docs/IntendedBoxContentsSource.md)
 - [InvalidASIN](docs/InvalidASIN.md)
 - [InvalidASINList](docs/InvalidASINList.md)
 - [InvalidSKU](docs/InvalidSKU.md)
 - [InvalidSKUList](docs/InvalidSKUList.md)
 - [LabelDownloadURL](docs/LabelDownloadURL.md)
 - [LabelPrepPreference](docs/LabelPrepPreference.md)
 - [LabelPrepType](docs/LabelPrepType.md)
 - [NonPartneredLtlDataInput](docs/NonPartneredLtlDataInput.md)
 - [NonPartneredLtlDataOutput](docs/NonPartneredLtlDataOutput.md)
 - [NonPartneredSmallParcelDataInput](docs/NonPartneredSmallParcelDataInput.md)
 - [NonPartneredSmallParcelDataOutput](docs/NonPartneredSmallParcelDataOutput.md)
 - [NonPartneredSmallParcelPackageInput](docs/NonPartneredSmallParcelPackageInput.md)
 - [NonPartneredSmallParcelPackageInputList](docs/NonPartneredSmallParcelPackageInputList.md)
 - [NonPartneredSmallParcelPackageOutput](docs/NonPartneredSmallParcelPackageOutput.md)
 - [NonPartneredSmallParcelPackageOutputList](docs/NonPartneredSmallParcelPackageOutputList.md)
 - [PackageStatus](docs/PackageStatus.md)
 - [Pallet](docs/Pallet.md)
 - [PalletList](docs/PalletList.md)
 - [PartneredEstimate](docs/PartneredEstimate.md)
 - [PartneredLtlDataInput](docs/PartneredLtlDataInput.md)
 - [PartneredLtlDataOutput](docs/PartneredLtlDataOutput.md)
 - [PartneredSmallParcelDataInput](docs/PartneredSmallParcelDataInput.md)
 - [PartneredSmallParcelDataOutput](docs/PartneredSmallParcelDataOutput.md)
 - [PartneredSmallParcelPackageInput](docs/PartneredSmallParcelPackageInput.md)
 - [PartneredSmallParcelPackageInputList](docs/PartneredSmallParcelPackageInputList.md)
 - [PartneredSmallParcelPackageOutput](docs/PartneredSmallParcelPackageOutput.md)
 - [PartneredSmallParcelPackageOutputList](docs/PartneredSmallParcelPackageOutputList.md)
 - [PrepDetails](docs/PrepDetails.md)
 - [PrepDetailsList](docs/PrepDetailsList.md)
 - [PrepGuidance](docs/PrepGuidance.md)
 - [PrepInstruction](docs/PrepInstruction.md)
 - [PrepInstructionList](docs/PrepInstructionList.md)
 - [PrepOwner](docs/PrepOwner.md)
 - [PutTransportDetailsRequest](docs/PutTransportDetailsRequest.md)
 - [PutTransportDetailsResponse](docs/PutTransportDetailsResponse.md)
 - [SKUInboundGuidance](docs/SKUInboundGuidance.md)
 - [SKUInboundGuidanceList](docs/SKUInboundGuidanceList.md)
 - [SKUPrepInstructions](docs/SKUPrepInstructions.md)
 - [SKUPrepInstructionsList](docs/SKUPrepInstructionsList.md)
 - [SellerFreightClass](docs/SellerFreightClass.md)
 - [ShipmentStatus](docs/ShipmentStatus.md)
 - [ShipmentType](docs/ShipmentType.md)
 - [TransportContent](docs/TransportContent.md)
 - [TransportDetailInput](docs/TransportDetailInput.md)
 - [TransportDetailOutput](docs/TransportDetailOutput.md)
 - [TransportHeader](docs/TransportHeader.md)
 - [TransportResult](docs/TransportResult.md)
 - [TransportStatus](docs/TransportStatus.md)
 - [UnitOfMeasurement](docs/UnitOfMeasurement.md)
 - [UnitOfWeight](docs/UnitOfWeight.md)
 - [VoidTransportResponse](docs/VoidTransportResponse.md)
 - [Weight](docs/Weight.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


