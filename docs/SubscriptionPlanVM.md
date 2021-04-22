

# SubscriptionPlanVM


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**isActive** | **Boolean** |  |  [optional]
**displayName** | **String** |  |  [optional]
**timePeriodType** | [**TimePeriodTypeEnum**](#TimePeriodTypeEnum) |  |  [optional]
**timePeriod** | **Integer** |  |  [optional]
**readonlyTimeLimitType** | [**ReadonlyTimeLimitTypeEnum**](#ReadonlyTimeLimitTypeEnum) |  |  [optional]
**readonlyTimeLimit** | **Integer** |  |  [optional]
**templatesSpaceLimit** | **Long** |  |  [optional]
**reportsSpaceLimit** | **Long** |  |  [optional]
**exportsSpaceLimit** | **Long** |  |  [optional]
**fileUploadSizeLimit** | **Long** |  |  [optional]
**dataSourceLimit** | **Integer** |  |  [optional]
**maxUsersCount** | **Integer** |  |  [optional]
**hasSpaceOverdraft** | **Boolean** |  |  [optional]
**groupLimit** | **Integer** |  |  [optional]
**onlineDesigner** | **Boolean** |  |  [optional]
**isDemo** | **Boolean** |  |  [optional]
**urlToBuy** | **String** |  |  [optional]
**unlimitedPage** | **Boolean** |  |  [optional]
**pageLimit** | **Integer** |  |  [optional]



## Enum: TimePeriodTypeEnum

Name | Value
---- | -----
SECOND | &quot;Second&quot;
MINUTE | &quot;Minute&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
WEEK | &quot;Week&quot;
MONTH | &quot;Month&quot;
YEAR | &quot;Year&quot;



## Enum: ReadonlyTimeLimitTypeEnum

Name | Value
---- | -----
SECOND | &quot;Second&quot;
MINUTE | &quot;Minute&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
WEEK | &quot;Week&quot;
MONTH | &quot;Month&quot;
YEAR | &quot;Year&quot;



