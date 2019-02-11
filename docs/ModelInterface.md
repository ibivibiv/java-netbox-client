# ModelInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**device** | [**NestedDevice**](NestedDevice.md) |  | 
**name** | **String** |  | 
**formFactor** | **Object** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**lag** | [**NestedInterface**](NestedInterface.md) |  |  [optional]
**mtu** | **Integer** |  |  [optional]
**macAddress** | **String** |  |  [optional]
**mgmtOnly** | **Boolean** | This interface is used only for out-of-band management |  [optional]
**description** | **String** |  |  [optional]
**connectedEndpointType** | **String** |  |  [optional]
**connectedEndpoint** | **String** |  |  [optional]
**connectionStatus** | **Object** |  |  [optional]
**cable** | [**NestedCable**](NestedCable.md) |  |  [optional]
**mode** | **Object** |  |  [optional]
**untaggedVlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional]
**taggedVlans** | [**List&lt;NestedVLAN&gt;**](NestedVLAN.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**countIpaddresses** | **String** |  |  [optional]
