# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

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

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiApi;

import java.io.File;
import java.util.*;

public class ApiApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer.setApiKeyPrefix("Token");

        ApiApi apiInstance = new ApiApi();
        try {
            apiInstance.apiCircuitsChoicesList();
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#apiCircuitsChoicesList");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://169.46.125.180:8000/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**apiCircuitsChoicesList**](docs/ApiApi.md#apiCircuitsChoicesList) | **GET** /api/circuits/_choices/ | 
*ApiApi* | [**apiCircuitsChoicesRead**](docs/ApiApi.md#apiCircuitsChoicesRead) | **GET** /api/circuits/_choices/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsCreate**](docs/ApiApi.md#apiCircuitsCircuitTerminationsCreate) | **POST** /api/circuits/circuit-terminations/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsDelete**](docs/ApiApi.md#apiCircuitsCircuitTerminationsDelete) | **DELETE** /api/circuits/circuit-terminations/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsList**](docs/ApiApi.md#apiCircuitsCircuitTerminationsList) | **GET** /api/circuits/circuit-terminations/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsPartialUpdate**](docs/ApiApi.md#apiCircuitsCircuitTerminationsPartialUpdate) | **PATCH** /api/circuits/circuit-terminations/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsRead**](docs/ApiApi.md#apiCircuitsCircuitTerminationsRead) | **GET** /api/circuits/circuit-terminations/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTerminationsUpdate**](docs/ApiApi.md#apiCircuitsCircuitTerminationsUpdate) | **PUT** /api/circuits/circuit-terminations/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTypesCreate**](docs/ApiApi.md#apiCircuitsCircuitTypesCreate) | **POST** /api/circuits/circuit-types/ | 
*ApiApi* | [**apiCircuitsCircuitTypesDelete**](docs/ApiApi.md#apiCircuitsCircuitTypesDelete) | **DELETE** /api/circuits/circuit-types/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTypesList**](docs/ApiApi.md#apiCircuitsCircuitTypesList) | **GET** /api/circuits/circuit-types/ | 
*ApiApi* | [**apiCircuitsCircuitTypesPartialUpdate**](docs/ApiApi.md#apiCircuitsCircuitTypesPartialUpdate) | **PATCH** /api/circuits/circuit-types/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTypesRead**](docs/ApiApi.md#apiCircuitsCircuitTypesRead) | **GET** /api/circuits/circuit-types/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitTypesUpdate**](docs/ApiApi.md#apiCircuitsCircuitTypesUpdate) | **PUT** /api/circuits/circuit-types/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitsCreate**](docs/ApiApi.md#apiCircuitsCircuitsCreate) | **POST** /api/circuits/circuits/ | 
*ApiApi* | [**apiCircuitsCircuitsDelete**](docs/ApiApi.md#apiCircuitsCircuitsDelete) | **DELETE** /api/circuits/circuits/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitsList**](docs/ApiApi.md#apiCircuitsCircuitsList) | **GET** /api/circuits/circuits/ | 
*ApiApi* | [**apiCircuitsCircuitsPartialUpdate**](docs/ApiApi.md#apiCircuitsCircuitsPartialUpdate) | **PATCH** /api/circuits/circuits/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitsRead**](docs/ApiApi.md#apiCircuitsCircuitsRead) | **GET** /api/circuits/circuits/{id}/ | 
*ApiApi* | [**apiCircuitsCircuitsUpdate**](docs/ApiApi.md#apiCircuitsCircuitsUpdate) | **PUT** /api/circuits/circuits/{id}/ | 
*ApiApi* | [**apiCircuitsProvidersCreate**](docs/ApiApi.md#apiCircuitsProvidersCreate) | **POST** /api/circuits/providers/ | 
*ApiApi* | [**apiCircuitsProvidersDelete**](docs/ApiApi.md#apiCircuitsProvidersDelete) | **DELETE** /api/circuits/providers/{id}/ | 
*ApiApi* | [**apiCircuitsProvidersGraphs**](docs/ApiApi.md#apiCircuitsProvidersGraphs) | **GET** /api/circuits/providers/{id}/graphs/ | 
*ApiApi* | [**apiCircuitsProvidersList**](docs/ApiApi.md#apiCircuitsProvidersList) | **GET** /api/circuits/providers/ | 
*ApiApi* | [**apiCircuitsProvidersPartialUpdate**](docs/ApiApi.md#apiCircuitsProvidersPartialUpdate) | **PATCH** /api/circuits/providers/{id}/ | 
*ApiApi* | [**apiCircuitsProvidersRead**](docs/ApiApi.md#apiCircuitsProvidersRead) | **GET** /api/circuits/providers/{id}/ | 
*ApiApi* | [**apiCircuitsProvidersUpdate**](docs/ApiApi.md#apiCircuitsProvidersUpdate) | **PUT** /api/circuits/providers/{id}/ | 
*ApiApi* | [**apiDcimCablesCreate**](docs/ApiApi.md#apiDcimCablesCreate) | **POST** /api/dcim/cables/ | 
*ApiApi* | [**apiDcimCablesDelete**](docs/ApiApi.md#apiDcimCablesDelete) | **DELETE** /api/dcim/cables/{id}/ | 
*ApiApi* | [**apiDcimCablesList**](docs/ApiApi.md#apiDcimCablesList) | **GET** /api/dcim/cables/ | 
*ApiApi* | [**apiDcimCablesPartialUpdate**](docs/ApiApi.md#apiDcimCablesPartialUpdate) | **PATCH** /api/dcim/cables/{id}/ | 
*ApiApi* | [**apiDcimCablesRead**](docs/ApiApi.md#apiDcimCablesRead) | **GET** /api/dcim/cables/{id}/ | 
*ApiApi* | [**apiDcimCablesUpdate**](docs/ApiApi.md#apiDcimCablesUpdate) | **PUT** /api/dcim/cables/{id}/ | 
*ApiApi* | [**apiDcimChoicesList**](docs/ApiApi.md#apiDcimChoicesList) | **GET** /api/dcim/_choices/ | 
*ApiApi* | [**apiDcimChoicesRead**](docs/ApiApi.md#apiDcimChoicesRead) | **GET** /api/dcim/_choices/{id}/ | 
*ApiApi* | [**apiDcimConnectedDeviceList**](docs/ApiApi.md#apiDcimConnectedDeviceList) | **GET** /api/dcim/connected-device/ | 
*ApiApi* | [**apiDcimConsoleConnectionsList**](docs/ApiApi.md#apiDcimConsoleConnectionsList) | **GET** /api/dcim/console-connections/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesCreate**](docs/ApiApi.md#apiDcimConsolePortTemplatesCreate) | **POST** /api/dcim/console-port-templates/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesDelete**](docs/ApiApi.md#apiDcimConsolePortTemplatesDelete) | **DELETE** /api/dcim/console-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesList**](docs/ApiApi.md#apiDcimConsolePortTemplatesList) | **GET** /api/dcim/console-port-templates/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimConsolePortTemplatesPartialUpdate) | **PATCH** /api/dcim/console-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesRead**](docs/ApiApi.md#apiDcimConsolePortTemplatesRead) | **GET** /api/dcim/console-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsolePortTemplatesUpdate**](docs/ApiApi.md#apiDcimConsolePortTemplatesUpdate) | **PUT** /api/dcim/console-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsolePortsCreate**](docs/ApiApi.md#apiDcimConsolePortsCreate) | **POST** /api/dcim/console-ports/ | 
*ApiApi* | [**apiDcimConsolePortsDelete**](docs/ApiApi.md#apiDcimConsolePortsDelete) | **DELETE** /api/dcim/console-ports/{id}/ | 
*ApiApi* | [**apiDcimConsolePortsList**](docs/ApiApi.md#apiDcimConsolePortsList) | **GET** /api/dcim/console-ports/ | 
*ApiApi* | [**apiDcimConsolePortsPartialUpdate**](docs/ApiApi.md#apiDcimConsolePortsPartialUpdate) | **PATCH** /api/dcim/console-ports/{id}/ | 
*ApiApi* | [**apiDcimConsolePortsRead**](docs/ApiApi.md#apiDcimConsolePortsRead) | **GET** /api/dcim/console-ports/{id}/ | 
*ApiApi* | [**apiDcimConsolePortsTrace**](docs/ApiApi.md#apiDcimConsolePortsTrace) | **GET** /api/dcim/console-ports/{id}/trace/ | 
*ApiApi* | [**apiDcimConsolePortsUpdate**](docs/ApiApi.md#apiDcimConsolePortsUpdate) | **PUT** /api/dcim/console-ports/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesCreate**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesCreate) | **POST** /api/dcim/console-server-port-templates/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesDelete**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesDelete) | **DELETE** /api/dcim/console-server-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesList**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesList) | **GET** /api/dcim/console-server-port-templates/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesPartialUpdate) | **PATCH** /api/dcim/console-server-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesRead**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesRead) | **GET** /api/dcim/console-server-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortTemplatesUpdate**](docs/ApiApi.md#apiDcimConsoleServerPortTemplatesUpdate) | **PUT** /api/dcim/console-server-port-templates/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortsCreate**](docs/ApiApi.md#apiDcimConsoleServerPortsCreate) | **POST** /api/dcim/console-server-ports/ | 
*ApiApi* | [**apiDcimConsoleServerPortsDelete**](docs/ApiApi.md#apiDcimConsoleServerPortsDelete) | **DELETE** /api/dcim/console-server-ports/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortsList**](docs/ApiApi.md#apiDcimConsoleServerPortsList) | **GET** /api/dcim/console-server-ports/ | 
*ApiApi* | [**apiDcimConsoleServerPortsPartialUpdate**](docs/ApiApi.md#apiDcimConsoleServerPortsPartialUpdate) | **PATCH** /api/dcim/console-server-ports/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortsRead**](docs/ApiApi.md#apiDcimConsoleServerPortsRead) | **GET** /api/dcim/console-server-ports/{id}/ | 
*ApiApi* | [**apiDcimConsoleServerPortsTrace**](docs/ApiApi.md#apiDcimConsoleServerPortsTrace) | **GET** /api/dcim/console-server-ports/{id}/trace/ | 
*ApiApi* | [**apiDcimConsoleServerPortsUpdate**](docs/ApiApi.md#apiDcimConsoleServerPortsUpdate) | **PUT** /api/dcim/console-server-ports/{id}/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesCreate**](docs/ApiApi.md#apiDcimDeviceBayTemplatesCreate) | **POST** /api/dcim/device-bay-templates/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesDelete**](docs/ApiApi.md#apiDcimDeviceBayTemplatesDelete) | **DELETE** /api/dcim/device-bay-templates/{id}/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesList**](docs/ApiApi.md#apiDcimDeviceBayTemplatesList) | **GET** /api/dcim/device-bay-templates/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimDeviceBayTemplatesPartialUpdate) | **PATCH** /api/dcim/device-bay-templates/{id}/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesRead**](docs/ApiApi.md#apiDcimDeviceBayTemplatesRead) | **GET** /api/dcim/device-bay-templates/{id}/ | 
*ApiApi* | [**apiDcimDeviceBayTemplatesUpdate**](docs/ApiApi.md#apiDcimDeviceBayTemplatesUpdate) | **PUT** /api/dcim/device-bay-templates/{id}/ | 
*ApiApi* | [**apiDcimDeviceBaysCreate**](docs/ApiApi.md#apiDcimDeviceBaysCreate) | **POST** /api/dcim/device-bays/ | 
*ApiApi* | [**apiDcimDeviceBaysDelete**](docs/ApiApi.md#apiDcimDeviceBaysDelete) | **DELETE** /api/dcim/device-bays/{id}/ | 
*ApiApi* | [**apiDcimDeviceBaysList**](docs/ApiApi.md#apiDcimDeviceBaysList) | **GET** /api/dcim/device-bays/ | 
*ApiApi* | [**apiDcimDeviceBaysPartialUpdate**](docs/ApiApi.md#apiDcimDeviceBaysPartialUpdate) | **PATCH** /api/dcim/device-bays/{id}/ | 
*ApiApi* | [**apiDcimDeviceBaysRead**](docs/ApiApi.md#apiDcimDeviceBaysRead) | **GET** /api/dcim/device-bays/{id}/ | 
*ApiApi* | [**apiDcimDeviceBaysUpdate**](docs/ApiApi.md#apiDcimDeviceBaysUpdate) | **PUT** /api/dcim/device-bays/{id}/ | 
*ApiApi* | [**apiDcimDeviceRolesCreate**](docs/ApiApi.md#apiDcimDeviceRolesCreate) | **POST** /api/dcim/device-roles/ | 
*ApiApi* | [**apiDcimDeviceRolesDelete**](docs/ApiApi.md#apiDcimDeviceRolesDelete) | **DELETE** /api/dcim/device-roles/{id}/ | 
*ApiApi* | [**apiDcimDeviceRolesList**](docs/ApiApi.md#apiDcimDeviceRolesList) | **GET** /api/dcim/device-roles/ | 
*ApiApi* | [**apiDcimDeviceRolesPartialUpdate**](docs/ApiApi.md#apiDcimDeviceRolesPartialUpdate) | **PATCH** /api/dcim/device-roles/{id}/ | 
*ApiApi* | [**apiDcimDeviceRolesRead**](docs/ApiApi.md#apiDcimDeviceRolesRead) | **GET** /api/dcim/device-roles/{id}/ | 
*ApiApi* | [**apiDcimDeviceRolesUpdate**](docs/ApiApi.md#apiDcimDeviceRolesUpdate) | **PUT** /api/dcim/device-roles/{id}/ | 
*ApiApi* | [**apiDcimDeviceTypesCreate**](docs/ApiApi.md#apiDcimDeviceTypesCreate) | **POST** /api/dcim/device-types/ | 
*ApiApi* | [**apiDcimDeviceTypesDelete**](docs/ApiApi.md#apiDcimDeviceTypesDelete) | **DELETE** /api/dcim/device-types/{id}/ | 
*ApiApi* | [**apiDcimDeviceTypesList**](docs/ApiApi.md#apiDcimDeviceTypesList) | **GET** /api/dcim/device-types/ | 
*ApiApi* | [**apiDcimDeviceTypesPartialUpdate**](docs/ApiApi.md#apiDcimDeviceTypesPartialUpdate) | **PATCH** /api/dcim/device-types/{id}/ | 
*ApiApi* | [**apiDcimDeviceTypesRead**](docs/ApiApi.md#apiDcimDeviceTypesRead) | **GET** /api/dcim/device-types/{id}/ | 
*ApiApi* | [**apiDcimDeviceTypesUpdate**](docs/ApiApi.md#apiDcimDeviceTypesUpdate) | **PUT** /api/dcim/device-types/{id}/ | 
*ApiApi* | [**apiDcimDevicesCreate**](docs/ApiApi.md#apiDcimDevicesCreate) | **POST** /api/dcim/devices/ | 
*ApiApi* | [**apiDcimDevicesDelete**](docs/ApiApi.md#apiDcimDevicesDelete) | **DELETE** /api/dcim/devices/{id}/ | 
*ApiApi* | [**apiDcimDevicesList**](docs/ApiApi.md#apiDcimDevicesList) | **GET** /api/dcim/devices/ | 
*ApiApi* | [**apiDcimDevicesNapalm**](docs/ApiApi.md#apiDcimDevicesNapalm) | **GET** /api/dcim/devices/{id}/napalm/ | 
*ApiApi* | [**apiDcimDevicesPartialUpdate**](docs/ApiApi.md#apiDcimDevicesPartialUpdate) | **PATCH** /api/dcim/devices/{id}/ | 
*ApiApi* | [**apiDcimDevicesRead**](docs/ApiApi.md#apiDcimDevicesRead) | **GET** /api/dcim/devices/{id}/ | 
*ApiApi* | [**apiDcimDevicesUpdate**](docs/ApiApi.md#apiDcimDevicesUpdate) | **PUT** /api/dcim/devices/{id}/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesCreate**](docs/ApiApi.md#apiDcimFrontPortTemplatesCreate) | **POST** /api/dcim/front-port-templates/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesDelete**](docs/ApiApi.md#apiDcimFrontPortTemplatesDelete) | **DELETE** /api/dcim/front-port-templates/{id}/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesList**](docs/ApiApi.md#apiDcimFrontPortTemplatesList) | **GET** /api/dcim/front-port-templates/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimFrontPortTemplatesPartialUpdate) | **PATCH** /api/dcim/front-port-templates/{id}/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesRead**](docs/ApiApi.md#apiDcimFrontPortTemplatesRead) | **GET** /api/dcim/front-port-templates/{id}/ | 
*ApiApi* | [**apiDcimFrontPortTemplatesUpdate**](docs/ApiApi.md#apiDcimFrontPortTemplatesUpdate) | **PUT** /api/dcim/front-port-templates/{id}/ | 
*ApiApi* | [**apiDcimFrontPortsCreate**](docs/ApiApi.md#apiDcimFrontPortsCreate) | **POST** /api/dcim/front-ports/ | 
*ApiApi* | [**apiDcimFrontPortsDelete**](docs/ApiApi.md#apiDcimFrontPortsDelete) | **DELETE** /api/dcim/front-ports/{id}/ | 
*ApiApi* | [**apiDcimFrontPortsList**](docs/ApiApi.md#apiDcimFrontPortsList) | **GET** /api/dcim/front-ports/ | 
*ApiApi* | [**apiDcimFrontPortsPartialUpdate**](docs/ApiApi.md#apiDcimFrontPortsPartialUpdate) | **PATCH** /api/dcim/front-ports/{id}/ | 
*ApiApi* | [**apiDcimFrontPortsRead**](docs/ApiApi.md#apiDcimFrontPortsRead) | **GET** /api/dcim/front-ports/{id}/ | 
*ApiApi* | [**apiDcimFrontPortsUpdate**](docs/ApiApi.md#apiDcimFrontPortsUpdate) | **PUT** /api/dcim/front-ports/{id}/ | 
*ApiApi* | [**apiDcimInterfaceConnectionsList**](docs/ApiApi.md#apiDcimInterfaceConnectionsList) | **GET** /api/dcim/interface-connections/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesCreate**](docs/ApiApi.md#apiDcimInterfaceTemplatesCreate) | **POST** /api/dcim/interface-templates/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesDelete**](docs/ApiApi.md#apiDcimInterfaceTemplatesDelete) | **DELETE** /api/dcim/interface-templates/{id}/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesList**](docs/ApiApi.md#apiDcimInterfaceTemplatesList) | **GET** /api/dcim/interface-templates/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimInterfaceTemplatesPartialUpdate) | **PATCH** /api/dcim/interface-templates/{id}/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesRead**](docs/ApiApi.md#apiDcimInterfaceTemplatesRead) | **GET** /api/dcim/interface-templates/{id}/ | 
*ApiApi* | [**apiDcimInterfaceTemplatesUpdate**](docs/ApiApi.md#apiDcimInterfaceTemplatesUpdate) | **PUT** /api/dcim/interface-templates/{id}/ | 
*ApiApi* | [**apiDcimInterfacesCreate**](docs/ApiApi.md#apiDcimInterfacesCreate) | **POST** /api/dcim/interfaces/ | 
*ApiApi* | [**apiDcimInterfacesDelete**](docs/ApiApi.md#apiDcimInterfacesDelete) | **DELETE** /api/dcim/interfaces/{id}/ | 
*ApiApi* | [**apiDcimInterfacesGraphs**](docs/ApiApi.md#apiDcimInterfacesGraphs) | **GET** /api/dcim/interfaces/{id}/graphs/ | 
*ApiApi* | [**apiDcimInterfacesList**](docs/ApiApi.md#apiDcimInterfacesList) | **GET** /api/dcim/interfaces/ | 
*ApiApi* | [**apiDcimInterfacesPartialUpdate**](docs/ApiApi.md#apiDcimInterfacesPartialUpdate) | **PATCH** /api/dcim/interfaces/{id}/ | 
*ApiApi* | [**apiDcimInterfacesRead**](docs/ApiApi.md#apiDcimInterfacesRead) | **GET** /api/dcim/interfaces/{id}/ | 
*ApiApi* | [**apiDcimInterfacesTrace**](docs/ApiApi.md#apiDcimInterfacesTrace) | **GET** /api/dcim/interfaces/{id}/trace/ | 
*ApiApi* | [**apiDcimInterfacesUpdate**](docs/ApiApi.md#apiDcimInterfacesUpdate) | **PUT** /api/dcim/interfaces/{id}/ | 
*ApiApi* | [**apiDcimInventoryItemsCreate**](docs/ApiApi.md#apiDcimInventoryItemsCreate) | **POST** /api/dcim/inventory-items/ | 
*ApiApi* | [**apiDcimInventoryItemsDelete**](docs/ApiApi.md#apiDcimInventoryItemsDelete) | **DELETE** /api/dcim/inventory-items/{id}/ | 
*ApiApi* | [**apiDcimInventoryItemsList**](docs/ApiApi.md#apiDcimInventoryItemsList) | **GET** /api/dcim/inventory-items/ | 
*ApiApi* | [**apiDcimInventoryItemsPartialUpdate**](docs/ApiApi.md#apiDcimInventoryItemsPartialUpdate) | **PATCH** /api/dcim/inventory-items/{id}/ | 
*ApiApi* | [**apiDcimInventoryItemsRead**](docs/ApiApi.md#apiDcimInventoryItemsRead) | **GET** /api/dcim/inventory-items/{id}/ | 
*ApiApi* | [**apiDcimInventoryItemsUpdate**](docs/ApiApi.md#apiDcimInventoryItemsUpdate) | **PUT** /api/dcim/inventory-items/{id}/ | 
*ApiApi* | [**apiDcimManufacturersCreate**](docs/ApiApi.md#apiDcimManufacturersCreate) | **POST** /api/dcim/manufacturers/ | 
*ApiApi* | [**apiDcimManufacturersDelete**](docs/ApiApi.md#apiDcimManufacturersDelete) | **DELETE** /api/dcim/manufacturers/{id}/ | 
*ApiApi* | [**apiDcimManufacturersList**](docs/ApiApi.md#apiDcimManufacturersList) | **GET** /api/dcim/manufacturers/ | 
*ApiApi* | [**apiDcimManufacturersPartialUpdate**](docs/ApiApi.md#apiDcimManufacturersPartialUpdate) | **PATCH** /api/dcim/manufacturers/{id}/ | 
*ApiApi* | [**apiDcimManufacturersRead**](docs/ApiApi.md#apiDcimManufacturersRead) | **GET** /api/dcim/manufacturers/{id}/ | 
*ApiApi* | [**apiDcimManufacturersUpdate**](docs/ApiApi.md#apiDcimManufacturersUpdate) | **PUT** /api/dcim/manufacturers/{id}/ | 
*ApiApi* | [**apiDcimPlatformsCreate**](docs/ApiApi.md#apiDcimPlatformsCreate) | **POST** /api/dcim/platforms/ | 
*ApiApi* | [**apiDcimPlatformsDelete**](docs/ApiApi.md#apiDcimPlatformsDelete) | **DELETE** /api/dcim/platforms/{id}/ | 
*ApiApi* | [**apiDcimPlatformsList**](docs/ApiApi.md#apiDcimPlatformsList) | **GET** /api/dcim/platforms/ | 
*ApiApi* | [**apiDcimPlatformsPartialUpdate**](docs/ApiApi.md#apiDcimPlatformsPartialUpdate) | **PATCH** /api/dcim/platforms/{id}/ | 
*ApiApi* | [**apiDcimPlatformsRead**](docs/ApiApi.md#apiDcimPlatformsRead) | **GET** /api/dcim/platforms/{id}/ | 
*ApiApi* | [**apiDcimPlatformsUpdate**](docs/ApiApi.md#apiDcimPlatformsUpdate) | **PUT** /api/dcim/platforms/{id}/ | 
*ApiApi* | [**apiDcimPowerConnectionsList**](docs/ApiApi.md#apiDcimPowerConnectionsList) | **GET** /api/dcim/power-connections/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesCreate**](docs/ApiApi.md#apiDcimPowerOutletTemplatesCreate) | **POST** /api/dcim/power-outlet-templates/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesDelete**](docs/ApiApi.md#apiDcimPowerOutletTemplatesDelete) | **DELETE** /api/dcim/power-outlet-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesList**](docs/ApiApi.md#apiDcimPowerOutletTemplatesList) | **GET** /api/dcim/power-outlet-templates/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimPowerOutletTemplatesPartialUpdate) | **PATCH** /api/dcim/power-outlet-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesRead**](docs/ApiApi.md#apiDcimPowerOutletTemplatesRead) | **GET** /api/dcim/power-outlet-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletTemplatesUpdate**](docs/ApiApi.md#apiDcimPowerOutletTemplatesUpdate) | **PUT** /api/dcim/power-outlet-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletsCreate**](docs/ApiApi.md#apiDcimPowerOutletsCreate) | **POST** /api/dcim/power-outlets/ | 
*ApiApi* | [**apiDcimPowerOutletsDelete**](docs/ApiApi.md#apiDcimPowerOutletsDelete) | **DELETE** /api/dcim/power-outlets/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletsList**](docs/ApiApi.md#apiDcimPowerOutletsList) | **GET** /api/dcim/power-outlets/ | 
*ApiApi* | [**apiDcimPowerOutletsPartialUpdate**](docs/ApiApi.md#apiDcimPowerOutletsPartialUpdate) | **PATCH** /api/dcim/power-outlets/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletsRead**](docs/ApiApi.md#apiDcimPowerOutletsRead) | **GET** /api/dcim/power-outlets/{id}/ | 
*ApiApi* | [**apiDcimPowerOutletsTrace**](docs/ApiApi.md#apiDcimPowerOutletsTrace) | **GET** /api/dcim/power-outlets/{id}/trace/ | 
*ApiApi* | [**apiDcimPowerOutletsUpdate**](docs/ApiApi.md#apiDcimPowerOutletsUpdate) | **PUT** /api/dcim/power-outlets/{id}/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesCreate**](docs/ApiApi.md#apiDcimPowerPortTemplatesCreate) | **POST** /api/dcim/power-port-templates/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesDelete**](docs/ApiApi.md#apiDcimPowerPortTemplatesDelete) | **DELETE** /api/dcim/power-port-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesList**](docs/ApiApi.md#apiDcimPowerPortTemplatesList) | **GET** /api/dcim/power-port-templates/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimPowerPortTemplatesPartialUpdate) | **PATCH** /api/dcim/power-port-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesRead**](docs/ApiApi.md#apiDcimPowerPortTemplatesRead) | **GET** /api/dcim/power-port-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerPortTemplatesUpdate**](docs/ApiApi.md#apiDcimPowerPortTemplatesUpdate) | **PUT** /api/dcim/power-port-templates/{id}/ | 
*ApiApi* | [**apiDcimPowerPortsCreate**](docs/ApiApi.md#apiDcimPowerPortsCreate) | **POST** /api/dcim/power-ports/ | 
*ApiApi* | [**apiDcimPowerPortsDelete**](docs/ApiApi.md#apiDcimPowerPortsDelete) | **DELETE** /api/dcim/power-ports/{id}/ | 
*ApiApi* | [**apiDcimPowerPortsList**](docs/ApiApi.md#apiDcimPowerPortsList) | **GET** /api/dcim/power-ports/ | 
*ApiApi* | [**apiDcimPowerPortsPartialUpdate**](docs/ApiApi.md#apiDcimPowerPortsPartialUpdate) | **PATCH** /api/dcim/power-ports/{id}/ | 
*ApiApi* | [**apiDcimPowerPortsRead**](docs/ApiApi.md#apiDcimPowerPortsRead) | **GET** /api/dcim/power-ports/{id}/ | 
*ApiApi* | [**apiDcimPowerPortsTrace**](docs/ApiApi.md#apiDcimPowerPortsTrace) | **GET** /api/dcim/power-ports/{id}/trace/ | 
*ApiApi* | [**apiDcimPowerPortsUpdate**](docs/ApiApi.md#apiDcimPowerPortsUpdate) | **PUT** /api/dcim/power-ports/{id}/ | 
*ApiApi* | [**apiDcimRackGroupsCreate**](docs/ApiApi.md#apiDcimRackGroupsCreate) | **POST** /api/dcim/rack-groups/ | 
*ApiApi* | [**apiDcimRackGroupsDelete**](docs/ApiApi.md#apiDcimRackGroupsDelete) | **DELETE** /api/dcim/rack-groups/{id}/ | 
*ApiApi* | [**apiDcimRackGroupsList**](docs/ApiApi.md#apiDcimRackGroupsList) | **GET** /api/dcim/rack-groups/ | 
*ApiApi* | [**apiDcimRackGroupsPartialUpdate**](docs/ApiApi.md#apiDcimRackGroupsPartialUpdate) | **PATCH** /api/dcim/rack-groups/{id}/ | 
*ApiApi* | [**apiDcimRackGroupsRead**](docs/ApiApi.md#apiDcimRackGroupsRead) | **GET** /api/dcim/rack-groups/{id}/ | 
*ApiApi* | [**apiDcimRackGroupsUpdate**](docs/ApiApi.md#apiDcimRackGroupsUpdate) | **PUT** /api/dcim/rack-groups/{id}/ | 
*ApiApi* | [**apiDcimRackReservationsCreate**](docs/ApiApi.md#apiDcimRackReservationsCreate) | **POST** /api/dcim/rack-reservations/ | 
*ApiApi* | [**apiDcimRackReservationsDelete**](docs/ApiApi.md#apiDcimRackReservationsDelete) | **DELETE** /api/dcim/rack-reservations/{id}/ | 
*ApiApi* | [**apiDcimRackReservationsList**](docs/ApiApi.md#apiDcimRackReservationsList) | **GET** /api/dcim/rack-reservations/ | 
*ApiApi* | [**apiDcimRackReservationsPartialUpdate**](docs/ApiApi.md#apiDcimRackReservationsPartialUpdate) | **PATCH** /api/dcim/rack-reservations/{id}/ | 
*ApiApi* | [**apiDcimRackReservationsRead**](docs/ApiApi.md#apiDcimRackReservationsRead) | **GET** /api/dcim/rack-reservations/{id}/ | 
*ApiApi* | [**apiDcimRackReservationsUpdate**](docs/ApiApi.md#apiDcimRackReservationsUpdate) | **PUT** /api/dcim/rack-reservations/{id}/ | 
*ApiApi* | [**apiDcimRackRolesCreate**](docs/ApiApi.md#apiDcimRackRolesCreate) | **POST** /api/dcim/rack-roles/ | 
*ApiApi* | [**apiDcimRackRolesDelete**](docs/ApiApi.md#apiDcimRackRolesDelete) | **DELETE** /api/dcim/rack-roles/{id}/ | 
*ApiApi* | [**apiDcimRackRolesList**](docs/ApiApi.md#apiDcimRackRolesList) | **GET** /api/dcim/rack-roles/ | 
*ApiApi* | [**apiDcimRackRolesPartialUpdate**](docs/ApiApi.md#apiDcimRackRolesPartialUpdate) | **PATCH** /api/dcim/rack-roles/{id}/ | 
*ApiApi* | [**apiDcimRackRolesRead**](docs/ApiApi.md#apiDcimRackRolesRead) | **GET** /api/dcim/rack-roles/{id}/ | 
*ApiApi* | [**apiDcimRackRolesUpdate**](docs/ApiApi.md#apiDcimRackRolesUpdate) | **PUT** /api/dcim/rack-roles/{id}/ | 
*ApiApi* | [**apiDcimRacksCreate**](docs/ApiApi.md#apiDcimRacksCreate) | **POST** /api/dcim/racks/ | 
*ApiApi* | [**apiDcimRacksDelete**](docs/ApiApi.md#apiDcimRacksDelete) | **DELETE** /api/dcim/racks/{id}/ | 
*ApiApi* | [**apiDcimRacksList**](docs/ApiApi.md#apiDcimRacksList) | **GET** /api/dcim/racks/ | 
*ApiApi* | [**apiDcimRacksPartialUpdate**](docs/ApiApi.md#apiDcimRacksPartialUpdate) | **PATCH** /api/dcim/racks/{id}/ | 
*ApiApi* | [**apiDcimRacksRead**](docs/ApiApi.md#apiDcimRacksRead) | **GET** /api/dcim/racks/{id}/ | 
*ApiApi* | [**apiDcimRacksUnits**](docs/ApiApi.md#apiDcimRacksUnits) | **GET** /api/dcim/racks/{id}/units/ | 
*ApiApi* | [**apiDcimRacksUpdate**](docs/ApiApi.md#apiDcimRacksUpdate) | **PUT** /api/dcim/racks/{id}/ | 
*ApiApi* | [**apiDcimRearPortTemplatesCreate**](docs/ApiApi.md#apiDcimRearPortTemplatesCreate) | **POST** /api/dcim/rear-port-templates/ | 
*ApiApi* | [**apiDcimRearPortTemplatesDelete**](docs/ApiApi.md#apiDcimRearPortTemplatesDelete) | **DELETE** /api/dcim/rear-port-templates/{id}/ | 
*ApiApi* | [**apiDcimRearPortTemplatesList**](docs/ApiApi.md#apiDcimRearPortTemplatesList) | **GET** /api/dcim/rear-port-templates/ | 
*ApiApi* | [**apiDcimRearPortTemplatesPartialUpdate**](docs/ApiApi.md#apiDcimRearPortTemplatesPartialUpdate) | **PATCH** /api/dcim/rear-port-templates/{id}/ | 
*ApiApi* | [**apiDcimRearPortTemplatesRead**](docs/ApiApi.md#apiDcimRearPortTemplatesRead) | **GET** /api/dcim/rear-port-templates/{id}/ | 
*ApiApi* | [**apiDcimRearPortTemplatesUpdate**](docs/ApiApi.md#apiDcimRearPortTemplatesUpdate) | **PUT** /api/dcim/rear-port-templates/{id}/ | 
*ApiApi* | [**apiDcimRearPortsCreate**](docs/ApiApi.md#apiDcimRearPortsCreate) | **POST** /api/dcim/rear-ports/ | 
*ApiApi* | [**apiDcimRearPortsDelete**](docs/ApiApi.md#apiDcimRearPortsDelete) | **DELETE** /api/dcim/rear-ports/{id}/ | 
*ApiApi* | [**apiDcimRearPortsList**](docs/ApiApi.md#apiDcimRearPortsList) | **GET** /api/dcim/rear-ports/ | 
*ApiApi* | [**apiDcimRearPortsPartialUpdate**](docs/ApiApi.md#apiDcimRearPortsPartialUpdate) | **PATCH** /api/dcim/rear-ports/{id}/ | 
*ApiApi* | [**apiDcimRearPortsRead**](docs/ApiApi.md#apiDcimRearPortsRead) | **GET** /api/dcim/rear-ports/{id}/ | 
*ApiApi* | [**apiDcimRearPortsUpdate**](docs/ApiApi.md#apiDcimRearPortsUpdate) | **PUT** /api/dcim/rear-ports/{id}/ | 
*ApiApi* | [**apiDcimRegionsCreate**](docs/ApiApi.md#apiDcimRegionsCreate) | **POST** /api/dcim/regions/ | 
*ApiApi* | [**apiDcimRegionsDelete**](docs/ApiApi.md#apiDcimRegionsDelete) | **DELETE** /api/dcim/regions/{id}/ | 
*ApiApi* | [**apiDcimRegionsList**](docs/ApiApi.md#apiDcimRegionsList) | **GET** /api/dcim/regions/ | 
*ApiApi* | [**apiDcimRegionsPartialUpdate**](docs/ApiApi.md#apiDcimRegionsPartialUpdate) | **PATCH** /api/dcim/regions/{id}/ | 
*ApiApi* | [**apiDcimRegionsRead**](docs/ApiApi.md#apiDcimRegionsRead) | **GET** /api/dcim/regions/{id}/ | 
*ApiApi* | [**apiDcimRegionsUpdate**](docs/ApiApi.md#apiDcimRegionsUpdate) | **PUT** /api/dcim/regions/{id}/ | 
*ApiApi* | [**apiDcimSitesCreate**](docs/ApiApi.md#apiDcimSitesCreate) | **POST** /api/dcim/sites/ | 
*ApiApi* | [**apiDcimSitesDelete**](docs/ApiApi.md#apiDcimSitesDelete) | **DELETE** /api/dcim/sites/{id}/ | 
*ApiApi* | [**apiDcimSitesGraphs**](docs/ApiApi.md#apiDcimSitesGraphs) | **GET** /api/dcim/sites/{id}/graphs/ | 
*ApiApi* | [**apiDcimSitesList**](docs/ApiApi.md#apiDcimSitesList) | **GET** /api/dcim/sites/ | 
*ApiApi* | [**apiDcimSitesPartialUpdate**](docs/ApiApi.md#apiDcimSitesPartialUpdate) | **PATCH** /api/dcim/sites/{id}/ | 
*ApiApi* | [**apiDcimSitesRead**](docs/ApiApi.md#apiDcimSitesRead) | **GET** /api/dcim/sites/{id}/ | 
*ApiApi* | [**apiDcimSitesUpdate**](docs/ApiApi.md#apiDcimSitesUpdate) | **PUT** /api/dcim/sites/{id}/ | 
*ApiApi* | [**apiDcimVirtualChassisCreate**](docs/ApiApi.md#apiDcimVirtualChassisCreate) | **POST** /api/dcim/virtual-chassis/ | 
*ApiApi* | [**apiDcimVirtualChassisDelete**](docs/ApiApi.md#apiDcimVirtualChassisDelete) | **DELETE** /api/dcim/virtual-chassis/{id}/ | 
*ApiApi* | [**apiDcimVirtualChassisList**](docs/ApiApi.md#apiDcimVirtualChassisList) | **GET** /api/dcim/virtual-chassis/ | 
*ApiApi* | [**apiDcimVirtualChassisPartialUpdate**](docs/ApiApi.md#apiDcimVirtualChassisPartialUpdate) | **PATCH** /api/dcim/virtual-chassis/{id}/ | 
*ApiApi* | [**apiDcimVirtualChassisRead**](docs/ApiApi.md#apiDcimVirtualChassisRead) | **GET** /api/dcim/virtual-chassis/{id}/ | 
*ApiApi* | [**apiDcimVirtualChassisUpdate**](docs/ApiApi.md#apiDcimVirtualChassisUpdate) | **PUT** /api/dcim/virtual-chassis/{id}/ | 
*ApiApi* | [**apiExtrasChoicesList**](docs/ApiApi.md#apiExtrasChoicesList) | **GET** /api/extras/_choices/ | 
*ApiApi* | [**apiExtrasChoicesRead**](docs/ApiApi.md#apiExtrasChoicesRead) | **GET** /api/extras/_choices/{id}/ | 
*ApiApi* | [**apiExtrasConfigContextsCreate**](docs/ApiApi.md#apiExtrasConfigContextsCreate) | **POST** /api/extras/config-contexts/ | 
*ApiApi* | [**apiExtrasConfigContextsDelete**](docs/ApiApi.md#apiExtrasConfigContextsDelete) | **DELETE** /api/extras/config-contexts/{id}/ | 
*ApiApi* | [**apiExtrasConfigContextsList**](docs/ApiApi.md#apiExtrasConfigContextsList) | **GET** /api/extras/config-contexts/ | 
*ApiApi* | [**apiExtrasConfigContextsPartialUpdate**](docs/ApiApi.md#apiExtrasConfigContextsPartialUpdate) | **PATCH** /api/extras/config-contexts/{id}/ | 
*ApiApi* | [**apiExtrasConfigContextsRead**](docs/ApiApi.md#apiExtrasConfigContextsRead) | **GET** /api/extras/config-contexts/{id}/ | 
*ApiApi* | [**apiExtrasConfigContextsUpdate**](docs/ApiApi.md#apiExtrasConfigContextsUpdate) | **PUT** /api/extras/config-contexts/{id}/ | 
*ApiApi* | [**apiExtrasExportTemplatesCreate**](docs/ApiApi.md#apiExtrasExportTemplatesCreate) | **POST** /api/extras/export-templates/ | 
*ApiApi* | [**apiExtrasExportTemplatesDelete**](docs/ApiApi.md#apiExtrasExportTemplatesDelete) | **DELETE** /api/extras/export-templates/{id}/ | 
*ApiApi* | [**apiExtrasExportTemplatesList**](docs/ApiApi.md#apiExtrasExportTemplatesList) | **GET** /api/extras/export-templates/ | 
*ApiApi* | [**apiExtrasExportTemplatesPartialUpdate**](docs/ApiApi.md#apiExtrasExportTemplatesPartialUpdate) | **PATCH** /api/extras/export-templates/{id}/ | 
*ApiApi* | [**apiExtrasExportTemplatesRead**](docs/ApiApi.md#apiExtrasExportTemplatesRead) | **GET** /api/extras/export-templates/{id}/ | 
*ApiApi* | [**apiExtrasExportTemplatesUpdate**](docs/ApiApi.md#apiExtrasExportTemplatesUpdate) | **PUT** /api/extras/export-templates/{id}/ | 
*ApiApi* | [**apiExtrasGraphsCreate**](docs/ApiApi.md#apiExtrasGraphsCreate) | **POST** /api/extras/graphs/ | 
*ApiApi* | [**apiExtrasGraphsDelete**](docs/ApiApi.md#apiExtrasGraphsDelete) | **DELETE** /api/extras/graphs/{id}/ | 
*ApiApi* | [**apiExtrasGraphsList**](docs/ApiApi.md#apiExtrasGraphsList) | **GET** /api/extras/graphs/ | 
*ApiApi* | [**apiExtrasGraphsPartialUpdate**](docs/ApiApi.md#apiExtrasGraphsPartialUpdate) | **PATCH** /api/extras/graphs/{id}/ | 
*ApiApi* | [**apiExtrasGraphsRead**](docs/ApiApi.md#apiExtrasGraphsRead) | **GET** /api/extras/graphs/{id}/ | 
*ApiApi* | [**apiExtrasGraphsUpdate**](docs/ApiApi.md#apiExtrasGraphsUpdate) | **PUT** /api/extras/graphs/{id}/ | 
*ApiApi* | [**apiExtrasImageAttachmentsCreate**](docs/ApiApi.md#apiExtrasImageAttachmentsCreate) | **POST** /api/extras/image-attachments/ | 
*ApiApi* | [**apiExtrasImageAttachmentsDelete**](docs/ApiApi.md#apiExtrasImageAttachmentsDelete) | **DELETE** /api/extras/image-attachments/{id}/ | 
*ApiApi* | [**apiExtrasImageAttachmentsList**](docs/ApiApi.md#apiExtrasImageAttachmentsList) | **GET** /api/extras/image-attachments/ | 
*ApiApi* | [**apiExtrasImageAttachmentsPartialUpdate**](docs/ApiApi.md#apiExtrasImageAttachmentsPartialUpdate) | **PATCH** /api/extras/image-attachments/{id}/ | 
*ApiApi* | [**apiExtrasImageAttachmentsRead**](docs/ApiApi.md#apiExtrasImageAttachmentsRead) | **GET** /api/extras/image-attachments/{id}/ | 
*ApiApi* | [**apiExtrasImageAttachmentsUpdate**](docs/ApiApi.md#apiExtrasImageAttachmentsUpdate) | **PUT** /api/extras/image-attachments/{id}/ | 
*ApiApi* | [**apiExtrasObjectChangesList**](docs/ApiApi.md#apiExtrasObjectChangesList) | **GET** /api/extras/object-changes/ | 
*ApiApi* | [**apiExtrasObjectChangesRead**](docs/ApiApi.md#apiExtrasObjectChangesRead) | **GET** /api/extras/object-changes/{id}/ | 
*ApiApi* | [**apiExtrasReportsList**](docs/ApiApi.md#apiExtrasReportsList) | **GET** /api/extras/reports/ | 
*ApiApi* | [**apiExtrasReportsRead**](docs/ApiApi.md#apiExtrasReportsRead) | **GET** /api/extras/reports/{id}/ | 
*ApiApi* | [**apiExtrasReportsRun**](docs/ApiApi.md#apiExtrasReportsRun) | **POST** /api/extras/reports/{id}/run/ | 
*ApiApi* | [**apiExtrasTagsCreate**](docs/ApiApi.md#apiExtrasTagsCreate) | **POST** /api/extras/tags/ | 
*ApiApi* | [**apiExtrasTagsDelete**](docs/ApiApi.md#apiExtrasTagsDelete) | **DELETE** /api/extras/tags/{id}/ | 
*ApiApi* | [**apiExtrasTagsList**](docs/ApiApi.md#apiExtrasTagsList) | **GET** /api/extras/tags/ | 
*ApiApi* | [**apiExtrasTagsPartialUpdate**](docs/ApiApi.md#apiExtrasTagsPartialUpdate) | **PATCH** /api/extras/tags/{id}/ | 
*ApiApi* | [**apiExtrasTagsRead**](docs/ApiApi.md#apiExtrasTagsRead) | **GET** /api/extras/tags/{id}/ | 
*ApiApi* | [**apiExtrasTagsUpdate**](docs/ApiApi.md#apiExtrasTagsUpdate) | **PUT** /api/extras/tags/{id}/ | 
*ApiApi* | [**apiExtrasTopologyMapsCreate**](docs/ApiApi.md#apiExtrasTopologyMapsCreate) | **POST** /api/extras/topology-maps/ | 
*ApiApi* | [**apiExtrasTopologyMapsDelete**](docs/ApiApi.md#apiExtrasTopologyMapsDelete) | **DELETE** /api/extras/topology-maps/{id}/ | 
*ApiApi* | [**apiExtrasTopologyMapsList**](docs/ApiApi.md#apiExtrasTopologyMapsList) | **GET** /api/extras/topology-maps/ | 
*ApiApi* | [**apiExtrasTopologyMapsPartialUpdate**](docs/ApiApi.md#apiExtrasTopologyMapsPartialUpdate) | **PATCH** /api/extras/topology-maps/{id}/ | 
*ApiApi* | [**apiExtrasTopologyMapsRead**](docs/ApiApi.md#apiExtrasTopologyMapsRead) | **GET** /api/extras/topology-maps/{id}/ | 
*ApiApi* | [**apiExtrasTopologyMapsRender**](docs/ApiApi.md#apiExtrasTopologyMapsRender) | **GET** /api/extras/topology-maps/{id}/render/ | 
*ApiApi* | [**apiExtrasTopologyMapsUpdate**](docs/ApiApi.md#apiExtrasTopologyMapsUpdate) | **PUT** /api/extras/topology-maps/{id}/ | 
*ApiApi* | [**apiIpamAggregatesCreate**](docs/ApiApi.md#apiIpamAggregatesCreate) | **POST** /api/ipam/aggregates/ | 
*ApiApi* | [**apiIpamAggregatesDelete**](docs/ApiApi.md#apiIpamAggregatesDelete) | **DELETE** /api/ipam/aggregates/{id}/ | 
*ApiApi* | [**apiIpamAggregatesList**](docs/ApiApi.md#apiIpamAggregatesList) | **GET** /api/ipam/aggregates/ | 
*ApiApi* | [**apiIpamAggregatesPartialUpdate**](docs/ApiApi.md#apiIpamAggregatesPartialUpdate) | **PATCH** /api/ipam/aggregates/{id}/ | 
*ApiApi* | [**apiIpamAggregatesRead**](docs/ApiApi.md#apiIpamAggregatesRead) | **GET** /api/ipam/aggregates/{id}/ | 
*ApiApi* | [**apiIpamAggregatesUpdate**](docs/ApiApi.md#apiIpamAggregatesUpdate) | **PUT** /api/ipam/aggregates/{id}/ | 
*ApiApi* | [**apiIpamChoicesList**](docs/ApiApi.md#apiIpamChoicesList) | **GET** /api/ipam/_choices/ | 
*ApiApi* | [**apiIpamChoicesRead**](docs/ApiApi.md#apiIpamChoicesRead) | **GET** /api/ipam/_choices/{id}/ | 
*ApiApi* | [**apiIpamIpAddressesCreate**](docs/ApiApi.md#apiIpamIpAddressesCreate) | **POST** /api/ipam/ip-addresses/ | 
*ApiApi* | [**apiIpamIpAddressesDelete**](docs/ApiApi.md#apiIpamIpAddressesDelete) | **DELETE** /api/ipam/ip-addresses/{id}/ | 
*ApiApi* | [**apiIpamIpAddressesList**](docs/ApiApi.md#apiIpamIpAddressesList) | **GET** /api/ipam/ip-addresses/ | 
*ApiApi* | [**apiIpamIpAddressesPartialUpdate**](docs/ApiApi.md#apiIpamIpAddressesPartialUpdate) | **PATCH** /api/ipam/ip-addresses/{id}/ | 
*ApiApi* | [**apiIpamIpAddressesRead**](docs/ApiApi.md#apiIpamIpAddressesRead) | **GET** /api/ipam/ip-addresses/{id}/ | 
*ApiApi* | [**apiIpamIpAddressesUpdate**](docs/ApiApi.md#apiIpamIpAddressesUpdate) | **PUT** /api/ipam/ip-addresses/{id}/ | 
*ApiApi* | [**apiIpamPrefixesAvailableIpsCreate**](docs/ApiApi.md#apiIpamPrefixesAvailableIpsCreate) | **POST** /api/ipam/prefixes/{id}/available-ips/ | 
*ApiApi* | [**apiIpamPrefixesAvailableIpsRead**](docs/ApiApi.md#apiIpamPrefixesAvailableIpsRead) | **GET** /api/ipam/prefixes/{id}/available-ips/ | 
*ApiApi* | [**apiIpamPrefixesAvailablePrefixesCreate**](docs/ApiApi.md#apiIpamPrefixesAvailablePrefixesCreate) | **POST** /api/ipam/prefixes/{id}/available-prefixes/ | 
*ApiApi* | [**apiIpamPrefixesAvailablePrefixesRead**](docs/ApiApi.md#apiIpamPrefixesAvailablePrefixesRead) | **GET** /api/ipam/prefixes/{id}/available-prefixes/ | 
*ApiApi* | [**apiIpamPrefixesCreate**](docs/ApiApi.md#apiIpamPrefixesCreate) | **POST** /api/ipam/prefixes/ | 
*ApiApi* | [**apiIpamPrefixesDelete**](docs/ApiApi.md#apiIpamPrefixesDelete) | **DELETE** /api/ipam/prefixes/{id}/ | 
*ApiApi* | [**apiIpamPrefixesList**](docs/ApiApi.md#apiIpamPrefixesList) | **GET** /api/ipam/prefixes/ | 
*ApiApi* | [**apiIpamPrefixesPartialUpdate**](docs/ApiApi.md#apiIpamPrefixesPartialUpdate) | **PATCH** /api/ipam/prefixes/{id}/ | 
*ApiApi* | [**apiIpamPrefixesRead**](docs/ApiApi.md#apiIpamPrefixesRead) | **GET** /api/ipam/prefixes/{id}/ | 
*ApiApi* | [**apiIpamPrefixesUpdate**](docs/ApiApi.md#apiIpamPrefixesUpdate) | **PUT** /api/ipam/prefixes/{id}/ | 
*ApiApi* | [**apiIpamRirsCreate**](docs/ApiApi.md#apiIpamRirsCreate) | **POST** /api/ipam/rirs/ | 
*ApiApi* | [**apiIpamRirsDelete**](docs/ApiApi.md#apiIpamRirsDelete) | **DELETE** /api/ipam/rirs/{id}/ | 
*ApiApi* | [**apiIpamRirsList**](docs/ApiApi.md#apiIpamRirsList) | **GET** /api/ipam/rirs/ | 
*ApiApi* | [**apiIpamRirsPartialUpdate**](docs/ApiApi.md#apiIpamRirsPartialUpdate) | **PATCH** /api/ipam/rirs/{id}/ | 
*ApiApi* | [**apiIpamRirsRead**](docs/ApiApi.md#apiIpamRirsRead) | **GET** /api/ipam/rirs/{id}/ | 
*ApiApi* | [**apiIpamRirsUpdate**](docs/ApiApi.md#apiIpamRirsUpdate) | **PUT** /api/ipam/rirs/{id}/ | 
*ApiApi* | [**apiIpamRolesCreate**](docs/ApiApi.md#apiIpamRolesCreate) | **POST** /api/ipam/roles/ | 
*ApiApi* | [**apiIpamRolesDelete**](docs/ApiApi.md#apiIpamRolesDelete) | **DELETE** /api/ipam/roles/{id}/ | 
*ApiApi* | [**apiIpamRolesList**](docs/ApiApi.md#apiIpamRolesList) | **GET** /api/ipam/roles/ | 
*ApiApi* | [**apiIpamRolesPartialUpdate**](docs/ApiApi.md#apiIpamRolesPartialUpdate) | **PATCH** /api/ipam/roles/{id}/ | 
*ApiApi* | [**apiIpamRolesRead**](docs/ApiApi.md#apiIpamRolesRead) | **GET** /api/ipam/roles/{id}/ | 
*ApiApi* | [**apiIpamRolesUpdate**](docs/ApiApi.md#apiIpamRolesUpdate) | **PUT** /api/ipam/roles/{id}/ | 
*ApiApi* | [**apiIpamServicesCreate**](docs/ApiApi.md#apiIpamServicesCreate) | **POST** /api/ipam/services/ | 
*ApiApi* | [**apiIpamServicesDelete**](docs/ApiApi.md#apiIpamServicesDelete) | **DELETE** /api/ipam/services/{id}/ | 
*ApiApi* | [**apiIpamServicesList**](docs/ApiApi.md#apiIpamServicesList) | **GET** /api/ipam/services/ | 
*ApiApi* | [**apiIpamServicesPartialUpdate**](docs/ApiApi.md#apiIpamServicesPartialUpdate) | **PATCH** /api/ipam/services/{id}/ | 
*ApiApi* | [**apiIpamServicesRead**](docs/ApiApi.md#apiIpamServicesRead) | **GET** /api/ipam/services/{id}/ | 
*ApiApi* | [**apiIpamServicesUpdate**](docs/ApiApi.md#apiIpamServicesUpdate) | **PUT** /api/ipam/services/{id}/ | 
*ApiApi* | [**apiIpamVlanGroupsCreate**](docs/ApiApi.md#apiIpamVlanGroupsCreate) | **POST** /api/ipam/vlan-groups/ | 
*ApiApi* | [**apiIpamVlanGroupsDelete**](docs/ApiApi.md#apiIpamVlanGroupsDelete) | **DELETE** /api/ipam/vlan-groups/{id}/ | 
*ApiApi* | [**apiIpamVlanGroupsList**](docs/ApiApi.md#apiIpamVlanGroupsList) | **GET** /api/ipam/vlan-groups/ | 
*ApiApi* | [**apiIpamVlanGroupsPartialUpdate**](docs/ApiApi.md#apiIpamVlanGroupsPartialUpdate) | **PATCH** /api/ipam/vlan-groups/{id}/ | 
*ApiApi* | [**apiIpamVlanGroupsRead**](docs/ApiApi.md#apiIpamVlanGroupsRead) | **GET** /api/ipam/vlan-groups/{id}/ | 
*ApiApi* | [**apiIpamVlanGroupsUpdate**](docs/ApiApi.md#apiIpamVlanGroupsUpdate) | **PUT** /api/ipam/vlan-groups/{id}/ | 
*ApiApi* | [**apiIpamVlansCreate**](docs/ApiApi.md#apiIpamVlansCreate) | **POST** /api/ipam/vlans/ | 
*ApiApi* | [**apiIpamVlansDelete**](docs/ApiApi.md#apiIpamVlansDelete) | **DELETE** /api/ipam/vlans/{id}/ | 
*ApiApi* | [**apiIpamVlansList**](docs/ApiApi.md#apiIpamVlansList) | **GET** /api/ipam/vlans/ | 
*ApiApi* | [**apiIpamVlansPartialUpdate**](docs/ApiApi.md#apiIpamVlansPartialUpdate) | **PATCH** /api/ipam/vlans/{id}/ | 
*ApiApi* | [**apiIpamVlansRead**](docs/ApiApi.md#apiIpamVlansRead) | **GET** /api/ipam/vlans/{id}/ | 
*ApiApi* | [**apiIpamVlansUpdate**](docs/ApiApi.md#apiIpamVlansUpdate) | **PUT** /api/ipam/vlans/{id}/ | 
*ApiApi* | [**apiIpamVrfsCreate**](docs/ApiApi.md#apiIpamVrfsCreate) | **POST** /api/ipam/vrfs/ | 
*ApiApi* | [**apiIpamVrfsDelete**](docs/ApiApi.md#apiIpamVrfsDelete) | **DELETE** /api/ipam/vrfs/{id}/ | 
*ApiApi* | [**apiIpamVrfsList**](docs/ApiApi.md#apiIpamVrfsList) | **GET** /api/ipam/vrfs/ | 
*ApiApi* | [**apiIpamVrfsPartialUpdate**](docs/ApiApi.md#apiIpamVrfsPartialUpdate) | **PATCH** /api/ipam/vrfs/{id}/ | 
*ApiApi* | [**apiIpamVrfsRead**](docs/ApiApi.md#apiIpamVrfsRead) | **GET** /api/ipam/vrfs/{id}/ | 
*ApiApi* | [**apiIpamVrfsUpdate**](docs/ApiApi.md#apiIpamVrfsUpdate) | **PUT** /api/ipam/vrfs/{id}/ | 
*ApiApi* | [**apiList**](docs/ApiApi.md#apiList) | **GET** /api/ | 
*ApiApi* | [**apiSecretsChoicesList**](docs/ApiApi.md#apiSecretsChoicesList) | **GET** /api/secrets/_choices/ | 
*ApiApi* | [**apiSecretsChoicesRead**](docs/ApiApi.md#apiSecretsChoicesRead) | **GET** /api/secrets/_choices/{id}/ | 
*ApiApi* | [**apiSecretsGenerateRsaKeyPairList**](docs/ApiApi.md#apiSecretsGenerateRsaKeyPairList) | **GET** /api/secrets/generate-rsa-key-pair/ | This endpoint can be used to generate a new RSA key pair. The keys are returned in PEM format.
*ApiApi* | [**apiSecretsGetSessionKeyCreate**](docs/ApiApi.md#apiSecretsGetSessionKeyCreate) | **POST** /api/secrets/get-session-key/ | 
*ApiApi* | [**apiSecretsSecretRolesCreate**](docs/ApiApi.md#apiSecretsSecretRolesCreate) | **POST** /api/secrets/secret-roles/ | 
*ApiApi* | [**apiSecretsSecretRolesDelete**](docs/ApiApi.md#apiSecretsSecretRolesDelete) | **DELETE** /api/secrets/secret-roles/{id}/ | 
*ApiApi* | [**apiSecretsSecretRolesList**](docs/ApiApi.md#apiSecretsSecretRolesList) | **GET** /api/secrets/secret-roles/ | 
*ApiApi* | [**apiSecretsSecretRolesPartialUpdate**](docs/ApiApi.md#apiSecretsSecretRolesPartialUpdate) | **PATCH** /api/secrets/secret-roles/{id}/ | 
*ApiApi* | [**apiSecretsSecretRolesRead**](docs/ApiApi.md#apiSecretsSecretRolesRead) | **GET** /api/secrets/secret-roles/{id}/ | 
*ApiApi* | [**apiSecretsSecretRolesUpdate**](docs/ApiApi.md#apiSecretsSecretRolesUpdate) | **PUT** /api/secrets/secret-roles/{id}/ | 
*ApiApi* | [**apiSecretsSecretsCreate**](docs/ApiApi.md#apiSecretsSecretsCreate) | **POST** /api/secrets/secrets/ | 
*ApiApi* | [**apiSecretsSecretsDelete**](docs/ApiApi.md#apiSecretsSecretsDelete) | **DELETE** /api/secrets/secrets/{id}/ | 
*ApiApi* | [**apiSecretsSecretsList**](docs/ApiApi.md#apiSecretsSecretsList) | **GET** /api/secrets/secrets/ | 
*ApiApi* | [**apiSecretsSecretsPartialUpdate**](docs/ApiApi.md#apiSecretsSecretsPartialUpdate) | **PATCH** /api/secrets/secrets/{id}/ | 
*ApiApi* | [**apiSecretsSecretsRead**](docs/ApiApi.md#apiSecretsSecretsRead) | **GET** /api/secrets/secrets/{id}/ | 
*ApiApi* | [**apiSecretsSecretsUpdate**](docs/ApiApi.md#apiSecretsSecretsUpdate) | **PUT** /api/secrets/secrets/{id}/ | 
*ApiApi* | [**apiTenancyChoicesList**](docs/ApiApi.md#apiTenancyChoicesList) | **GET** /api/tenancy/_choices/ | 
*ApiApi* | [**apiTenancyChoicesRead**](docs/ApiApi.md#apiTenancyChoicesRead) | **GET** /api/tenancy/_choices/{id}/ | 
*ApiApi* | [**apiTenancyTenantGroupsCreate**](docs/ApiApi.md#apiTenancyTenantGroupsCreate) | **POST** /api/tenancy/tenant-groups/ | 
*ApiApi* | [**apiTenancyTenantGroupsDelete**](docs/ApiApi.md#apiTenancyTenantGroupsDelete) | **DELETE** /api/tenancy/tenant-groups/{id}/ | 
*ApiApi* | [**apiTenancyTenantGroupsList**](docs/ApiApi.md#apiTenancyTenantGroupsList) | **GET** /api/tenancy/tenant-groups/ | 
*ApiApi* | [**apiTenancyTenantGroupsPartialUpdate**](docs/ApiApi.md#apiTenancyTenantGroupsPartialUpdate) | **PATCH** /api/tenancy/tenant-groups/{id}/ | 
*ApiApi* | [**apiTenancyTenantGroupsRead**](docs/ApiApi.md#apiTenancyTenantGroupsRead) | **GET** /api/tenancy/tenant-groups/{id}/ | 
*ApiApi* | [**apiTenancyTenantGroupsUpdate**](docs/ApiApi.md#apiTenancyTenantGroupsUpdate) | **PUT** /api/tenancy/tenant-groups/{id}/ | 
*ApiApi* | [**apiTenancyTenantsCreate**](docs/ApiApi.md#apiTenancyTenantsCreate) | **POST** /api/tenancy/tenants/ | 
*ApiApi* | [**apiTenancyTenantsDelete**](docs/ApiApi.md#apiTenancyTenantsDelete) | **DELETE** /api/tenancy/tenants/{id}/ | 
*ApiApi* | [**apiTenancyTenantsList**](docs/ApiApi.md#apiTenancyTenantsList) | **GET** /api/tenancy/tenants/ | 
*ApiApi* | [**apiTenancyTenantsPartialUpdate**](docs/ApiApi.md#apiTenancyTenantsPartialUpdate) | **PATCH** /api/tenancy/tenants/{id}/ | 
*ApiApi* | [**apiTenancyTenantsRead**](docs/ApiApi.md#apiTenancyTenantsRead) | **GET** /api/tenancy/tenants/{id}/ | 
*ApiApi* | [**apiTenancyTenantsUpdate**](docs/ApiApi.md#apiTenancyTenantsUpdate) | **PUT** /api/tenancy/tenants/{id}/ | 
*ApiApi* | [**apiVirtualizationChoicesList**](docs/ApiApi.md#apiVirtualizationChoicesList) | **GET** /api/virtualization/_choices/ | 
*ApiApi* | [**apiVirtualizationChoicesRead**](docs/ApiApi.md#apiVirtualizationChoicesRead) | **GET** /api/virtualization/_choices/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsCreate**](docs/ApiApi.md#apiVirtualizationClusterGroupsCreate) | **POST** /api/virtualization/cluster-groups/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsDelete**](docs/ApiApi.md#apiVirtualizationClusterGroupsDelete) | **DELETE** /api/virtualization/cluster-groups/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsList**](docs/ApiApi.md#apiVirtualizationClusterGroupsList) | **GET** /api/virtualization/cluster-groups/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsPartialUpdate**](docs/ApiApi.md#apiVirtualizationClusterGroupsPartialUpdate) | **PATCH** /api/virtualization/cluster-groups/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsRead**](docs/ApiApi.md#apiVirtualizationClusterGroupsRead) | **GET** /api/virtualization/cluster-groups/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterGroupsUpdate**](docs/ApiApi.md#apiVirtualizationClusterGroupsUpdate) | **PUT** /api/virtualization/cluster-groups/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterTypesCreate**](docs/ApiApi.md#apiVirtualizationClusterTypesCreate) | **POST** /api/virtualization/cluster-types/ | 
*ApiApi* | [**apiVirtualizationClusterTypesDelete**](docs/ApiApi.md#apiVirtualizationClusterTypesDelete) | **DELETE** /api/virtualization/cluster-types/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterTypesList**](docs/ApiApi.md#apiVirtualizationClusterTypesList) | **GET** /api/virtualization/cluster-types/ | 
*ApiApi* | [**apiVirtualizationClusterTypesPartialUpdate**](docs/ApiApi.md#apiVirtualizationClusterTypesPartialUpdate) | **PATCH** /api/virtualization/cluster-types/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterTypesRead**](docs/ApiApi.md#apiVirtualizationClusterTypesRead) | **GET** /api/virtualization/cluster-types/{id}/ | 
*ApiApi* | [**apiVirtualizationClusterTypesUpdate**](docs/ApiApi.md#apiVirtualizationClusterTypesUpdate) | **PUT** /api/virtualization/cluster-types/{id}/ | 
*ApiApi* | [**apiVirtualizationClustersCreate**](docs/ApiApi.md#apiVirtualizationClustersCreate) | **POST** /api/virtualization/clusters/ | 
*ApiApi* | [**apiVirtualizationClustersDelete**](docs/ApiApi.md#apiVirtualizationClustersDelete) | **DELETE** /api/virtualization/clusters/{id}/ | 
*ApiApi* | [**apiVirtualizationClustersList**](docs/ApiApi.md#apiVirtualizationClustersList) | **GET** /api/virtualization/clusters/ | 
*ApiApi* | [**apiVirtualizationClustersPartialUpdate**](docs/ApiApi.md#apiVirtualizationClustersPartialUpdate) | **PATCH** /api/virtualization/clusters/{id}/ | 
*ApiApi* | [**apiVirtualizationClustersRead**](docs/ApiApi.md#apiVirtualizationClustersRead) | **GET** /api/virtualization/clusters/{id}/ | 
*ApiApi* | [**apiVirtualizationClustersUpdate**](docs/ApiApi.md#apiVirtualizationClustersUpdate) | **PUT** /api/virtualization/clusters/{id}/ | 
*ApiApi* | [**apiVirtualizationInterfacesCreate**](docs/ApiApi.md#apiVirtualizationInterfacesCreate) | **POST** /api/virtualization/interfaces/ | 
*ApiApi* | [**apiVirtualizationInterfacesDelete**](docs/ApiApi.md#apiVirtualizationInterfacesDelete) | **DELETE** /api/virtualization/interfaces/{id}/ | 
*ApiApi* | [**apiVirtualizationInterfacesList**](docs/ApiApi.md#apiVirtualizationInterfacesList) | **GET** /api/virtualization/interfaces/ | 
*ApiApi* | [**apiVirtualizationInterfacesPartialUpdate**](docs/ApiApi.md#apiVirtualizationInterfacesPartialUpdate) | **PATCH** /api/virtualization/interfaces/{id}/ | 
*ApiApi* | [**apiVirtualizationInterfacesRead**](docs/ApiApi.md#apiVirtualizationInterfacesRead) | **GET** /api/virtualization/interfaces/{id}/ | 
*ApiApi* | [**apiVirtualizationInterfacesUpdate**](docs/ApiApi.md#apiVirtualizationInterfacesUpdate) | **PUT** /api/virtualization/interfaces/{id}/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesCreate**](docs/ApiApi.md#apiVirtualizationVirtualMachinesCreate) | **POST** /api/virtualization/virtual-machines/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesDelete**](docs/ApiApi.md#apiVirtualizationVirtualMachinesDelete) | **DELETE** /api/virtualization/virtual-machines/{id}/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesList**](docs/ApiApi.md#apiVirtualizationVirtualMachinesList) | **GET** /api/virtualization/virtual-machines/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesPartialUpdate**](docs/ApiApi.md#apiVirtualizationVirtualMachinesPartialUpdate) | **PATCH** /api/virtualization/virtual-machines/{id}/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesRead**](docs/ApiApi.md#apiVirtualizationVirtualMachinesRead) | **GET** /api/virtualization/virtual-machines/{id}/ | 
*ApiApi* | [**apiVirtualizationVirtualMachinesUpdate**](docs/ApiApi.md#apiVirtualizationVirtualMachinesUpdate) | **PUT** /api/virtualization/virtual-machines/{id}/ | 

## Documentation for Models

 - [Aggregate](docs/Aggregate.md)
 - [Cable](docs/Cable.md)
 - [Circuit](docs/Circuit.md)
 - [CircuitTermination](docs/CircuitTermination.md)
 - [CircuitType](docs/CircuitType.md)
 - [Cluster](docs/Cluster.md)
 - [ClusterGroup](docs/ClusterGroup.md)
 - [ClusterType](docs/ClusterType.md)
 - [ConfigContext](docs/ConfigContext.md)
 - [ConsolePort](docs/ConsolePort.md)
 - [ConsolePortTemplate](docs/ConsolePortTemplate.md)
 - [ConsoleServerPort](docs/ConsoleServerPort.md)
 - [ConsoleServerPortTemplate](docs/ConsoleServerPortTemplate.md)
 - [Device](docs/Device.md)
 - [DeviceBay](docs/DeviceBay.md)
 - [DeviceBayTemplate](docs/DeviceBayTemplate.md)
 - [DeviceRole](docs/DeviceRole.md)
 - [DeviceType](docs/DeviceType.md)
 - [DeviceWithConfigContext](docs/DeviceWithConfigContext.md)
 - [ExportTemplate](docs/ExportTemplate.md)
 - [FrontPort](docs/FrontPort.md)
 - [FrontPortRearPort](docs/FrontPortRearPort.md)
 - [FrontPortTemplate](docs/FrontPortTemplate.md)
 - [Graph](docs/Graph.md)
 - [IPAddress](docs/IPAddress.md)
 - [IPAddressInterface](docs/IPAddressInterface.md)
 - [ImageAttachment](docs/ImageAttachment.md)
 - [InterfaceConnection](docs/InterfaceConnection.md)
 - [InterfaceTemplate](docs/InterfaceTemplate.md)
 - [InventoryItem](docs/InventoryItem.md)
 - [Manufacturer](docs/Manufacturer.md)
 - [ModelInterface](docs/ModelInterface.md)
 - [NestedCable](docs/NestedCable.md)
 - [NestedCircuit](docs/NestedCircuit.md)
 - [NestedCircuitType](docs/NestedCircuitType.md)
 - [NestedCluster](docs/NestedCluster.md)
 - [NestedClusterGroup](docs/NestedClusterGroup.md)
 - [NestedClusterType](docs/NestedClusterType.md)
 - [NestedDevice](docs/NestedDevice.md)
 - [NestedDeviceRole](docs/NestedDeviceRole.md)
 - [NestedDeviceType](docs/NestedDeviceType.md)
 - [NestedIPAddress](docs/NestedIPAddress.md)
 - [NestedInterface](docs/NestedInterface.md)
 - [NestedManufacturer](docs/NestedManufacturer.md)
 - [NestedPlatform](docs/NestedPlatform.md)
 - [NestedProvider](docs/NestedProvider.md)
 - [NestedRIR](docs/NestedRIR.md)
 - [NestedRack](docs/NestedRack.md)
 - [NestedRackGroup](docs/NestedRackGroup.md)
 - [NestedRackRole](docs/NestedRackRole.md)
 - [NestedRearPortTemplate](docs/NestedRearPortTemplate.md)
 - [NestedRegion](docs/NestedRegion.md)
 - [NestedRole](docs/NestedRole.md)
 - [NestedSecretRole](docs/NestedSecretRole.md)
 - [NestedSite](docs/NestedSite.md)
 - [NestedTenant](docs/NestedTenant.md)
 - [NestedTenantGroup](docs/NestedTenantGroup.md)
 - [NestedUser](docs/NestedUser.md)
 - [NestedVLAN](docs/NestedVLAN.md)
 - [NestedVLANGroup](docs/NestedVLANGroup.md)
 - [NestedVRF](docs/NestedVRF.md)
 - [NestedVirtualChassis](docs/NestedVirtualChassis.md)
 - [NestedVirtualMachine](docs/NestedVirtualMachine.md)
 - [ObjectChange](docs/ObjectChange.md)
 - [Platform](docs/Platform.md)
 - [PowerOutlet](docs/PowerOutlet.md)
 - [PowerOutletTemplate](docs/PowerOutletTemplate.md)
 - [PowerPort](docs/PowerPort.md)
 - [PowerPortTemplate](docs/PowerPortTemplate.md)
 - [Prefix](docs/Prefix.md)
 - [Provider](docs/Provider.md)
 - [RIR](docs/RIR.md)
 - [Rack](docs/Rack.md)
 - [RackGroup](docs/RackGroup.md)
 - [RackReservation](docs/RackReservation.md)
 - [RackRole](docs/RackRole.md)
 - [RearPort](docs/RearPort.md)
 - [RearPortTemplate](docs/RearPortTemplate.md)
 - [Region](docs/Region.md)
 - [Role](docs/Role.md)
 - [Secret](docs/Secret.md)
 - [SecretRole](docs/SecretRole.md)
 - [Service](docs/Service.md)
 - [Site](docs/Site.md)
 - [Tag](docs/Tag.md)
 - [Tenant](docs/Tenant.md)
 - [TenantGroup](docs/TenantGroup.md)
 - [TopologyMap](docs/TopologyMap.md)
 - [VLAN](docs/VLAN.md)
 - [VLANGroup](docs/VLANGroup.md)
 - [VRF](docs/VRF.md)
 - [VirtualChassis](docs/VirtualChassis.md)
 - [VirtualMachine](docs/VirtualMachine.md)
 - [VirtualMachineWithConfigContext](docs/VirtualMachineWithConfigContext.md)
 - [WritableAggregate](docs/WritableAggregate.md)
 - [WritableCable](docs/WritableCable.md)
 - [WritableCircuit](docs/WritableCircuit.md)
 - [WritableCircuitTermination](docs/WritableCircuitTermination.md)
 - [WritableCluster](docs/WritableCluster.md)
 - [WritableConfigContext](docs/WritableConfigContext.md)
 - [WritableConsolePort](docs/WritableConsolePort.md)
 - [WritableConsolePortTemplate](docs/WritableConsolePortTemplate.md)
 - [WritableConsoleServerPort](docs/WritableConsoleServerPort.md)
 - [WritableConsoleServerPortTemplate](docs/WritableConsoleServerPortTemplate.md)
 - [WritableDevice](docs/WritableDevice.md)
 - [WritableDeviceBay](docs/WritableDeviceBay.md)
 - [WritableDeviceBayTemplate](docs/WritableDeviceBayTemplate.md)
 - [WritableDeviceType](docs/WritableDeviceType.md)
 - [WritableFrontPort](docs/WritableFrontPort.md)
 - [WritableFrontPortTemplate](docs/WritableFrontPortTemplate.md)
 - [WritableGraph](docs/WritableGraph.md)
 - [WritableIPAddress](docs/WritableIPAddress.md)
 - [WritableInterface](docs/WritableInterface.md)
 - [WritableInterfaceTemplate](docs/WritableInterfaceTemplate.md)
 - [WritableInventoryItem](docs/WritableInventoryItem.md)
 - [WritablePlatform](docs/WritablePlatform.md)
 - [WritablePowerOutlet](docs/WritablePowerOutlet.md)
 - [WritablePowerOutletTemplate](docs/WritablePowerOutletTemplate.md)
 - [WritablePowerPort](docs/WritablePowerPort.md)
 - [WritablePowerPortTemplate](docs/WritablePowerPortTemplate.md)
 - [WritablePrefix](docs/WritablePrefix.md)
 - [WritableRack](docs/WritableRack.md)
 - [WritableRackGroup](docs/WritableRackGroup.md)
 - [WritableRackReservation](docs/WritableRackReservation.md)
 - [WritableRearPort](docs/WritableRearPort.md)
 - [WritableRearPortTemplate](docs/WritableRearPortTemplate.md)
 - [WritableRegion](docs/WritableRegion.md)
 - [WritableSecret](docs/WritableSecret.md)
 - [WritableService](docs/WritableService.md)
 - [WritableSite](docs/WritableSite.md)
 - [WritableTenant](docs/WritableTenant.md)
 - [WritableTopologyMap](docs/WritableTopologyMap.md)
 - [WritableVLAN](docs/WritableVLAN.md)
 - [WritableVLANGroup](docs/WritableVLANGroup.md)
 - [WritableVRF](docs/WritableVRF.md)
 - [WritableVirtualChassis](docs/WritableVirtualChassis.md)
 - [WritableVirtualMachine](docs/WritableVirtualMachine.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

netbox@digitalocean.com
