# Device

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**deviceType** | [**NestedDeviceType**](NestedDeviceType.md) |  | 
**deviceRole** | [**NestedDeviceRole**](NestedDeviceRole.md) |  | 
**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional]
**platform** | [**NestedPlatform**](NestedPlatform.md) |  |  [optional]
**serial** | **String** |  |  [optional]
**assetTag** | **String** | A unique tag used to identify this device |  [optional]
**site** | [**NestedSite**](NestedSite.md) |  | 
**rack** | [**NestedRack**](NestedRack.md) |  |  [optional]
**position** | **Integer** | The lowest-numbered unit occupied by the device |  [optional]
**face** | **Object** |  |  [optional]
**parentDevice** | **String** |  |  [optional]
**status** | **Object** |  |  [optional]
**primaryIp** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional]
**primaryIp4** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional]
**primaryIp6** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional]
**cluster** | [**NestedCluster**](NestedCluster.md) |  |  [optional]
**virtualChassis** | [**NestedVirtualChassis**](NestedVirtualChassis.md) |  |  [optional]
**vcPosition** | **Integer** |  |  [optional]
**vcPriority** | **Integer** |  |  [optional]
**comments** | **String** |  |  [optional]
**localContextData** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**customFields** | **Object** |  |  [optional]
**created** | [**LocalDate**](LocalDate.md) |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
