# TopologyMap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  | 
**slug** | **String** |  | 
**site** | [**NestedSite**](NestedSite.md) |  | 
**devicePatterns** | **String** | Identify devices to include in the diagram using regular expressions, one per line. Each line will result in a new tier of the drawing. Separate multiple regexes within a line using semicolons. Devices will be rendered in the order they are defined. | 
**description** | **String** |  |  [optional]
