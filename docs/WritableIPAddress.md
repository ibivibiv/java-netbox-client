# WritableIPAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**family** | **Integer** |  |  [optional]
**address** | **String** | IPv4 or IPv6 address (with mask) | 
**vrf** | **Integer** |  |  [optional]
**tenant** | **Integer** |  |  [optional]
**status** | **Integer** | The operational status of this IP |  [optional]
**role** | **Integer** | The functional role of this IP |  [optional]
**_interface** | **Integer** |  |  [optional]
**description** | **String** |  |  [optional]
**natInside** | **Integer** | The IP for which this address is the \&quot;outside\&quot; IP |  [optional]
**natOutside** | **Integer** |  | 
**tags** | **List&lt;String&gt;** |  |  [optional]
**customFields** | **Object** |  |  [optional]
**created** | [**LocalDate**](LocalDate.md) |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
