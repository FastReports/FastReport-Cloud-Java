

# ReportVM


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateId** | **String** |  |  [optional]
**reportInfo** | [**ReportInfo**](ReportInfo.md) |  |  [optional]
**name** | **String** |  |  [optional]
**parentId** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**icon** | **byte[]** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**size** | **Long** |  |  [optional]
**subscriptionId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusReason** | [**StatusReasonEnum**](#StatusReasonEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**createdTime** | **OffsetDateTime** |  |  [optional]
**creatorUserId** | **String** |  |  [optional]
**editedTime** | **OffsetDateTime** |  |  [optional]
**editorUserId** | **String** |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FILE | &quot;File&quot;
FOLDER | &quot;Folder&quot;



## Enum: StatusEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
INQUEUE | &quot;InQueue&quot;
INPROCESS | &quot;InProcess&quot;
SUCCESS | &quot;Success&quot;
FAILED | &quot;Failed&quot;



## Enum: StatusReasonEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
ALLRIGHT | &quot;AllRight&quot;
HANG | &quot;Hang&quot;
ERROR | &quot;Error&quot;
NOTFOUND | &quot;NotFound&quot;
NOTENOUGHSPACE | &quot;NotEnoughSpace&quot;
EXPORTSTARTED | &quot;ExportStarted&quot;
PREPARATIONSTARTED | &quot;PreparationStarted&quot;



