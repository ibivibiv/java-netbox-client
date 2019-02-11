# WritableCircuitTermination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**circuit** | **Integer** |  | 
**termSide** | [**TermSideEnum**](#TermSideEnum) |  | 
**site** | **Integer** |  | 
**portSpeed** | **Integer** |  | 
**upstreamSpeed** | **Integer** | Upstream speed, if different from port speed |  [optional]
**xconnectId** | **String** |  |  [optional]
**ppInfo** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**connectedEndpointType** | **String** |  |  [optional]
**connectedEndpoint** | **String** |  |  [optional]
**connectionStatus** | **Boolean** |  |  [optional]
**cable** | [**NestedCable**](NestedCable.md) |  |  [optional]

<a name="TermSideEnum"></a>
## Enum: TermSideEnum
Name | Value
---- | -----
A | &quot;A&quot;
Z | &quot;Z&quot;
