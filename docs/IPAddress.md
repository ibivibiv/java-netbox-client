# IPAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**family** | **Integer** |  |  [optional]
**address** | **String** | IPv4 or IPv6 address (with mask) | 
**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional]
**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional]
**status** | **Object** |  |  [optional]
**role** | **Object** |  |  [optional]
**_interface** | [**IPAddressInterface**](IPAddressInterface.md) |  |  [optional]
**description** | **String** |  |  [optional]
**natInside** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional]
**natOutside** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**customFields** | **Object** |  |  [optional]
**created** | [**LocalDate**](LocalDate.md) |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
