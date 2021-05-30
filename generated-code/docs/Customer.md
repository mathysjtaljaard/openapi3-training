

# Customer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **UUID** |  |  [optional] [readonly]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**lastLoginDate** | **LocalDate** |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SHOP_LIFTER | &quot;shop lifter&quot;
CHECK_BOUNCER | &quot;check bouncer&quot;
GOOD_STANDING | &quot;good standing&quot;



