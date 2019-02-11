# Prefix

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**family** | **Integer** |  |  [optional]
**prefix** | **String** | IPv4 or IPv6 network with mask | 
**site** | [**NestedSite**](NestedSite.md) |  |  [optional]
**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional]
**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional]
**vlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional]
**status** | **Object** |  |  [optional]
**role** | [**NestedRole**](NestedRole.md) |  |  [optional]
**isPool** | **Boolean** | All IP addresses within this prefix are considered usable |  [optional]
**description** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**customFields** | **Object** |  |  [optional]
**created** | [**LocalDate**](LocalDate.md) |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
