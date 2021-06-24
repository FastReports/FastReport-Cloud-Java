

# ExportVM


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | [**FormatEnum**](#FormatEnum) |  |  [optional]
**reportId** | **String** |  |  [optional]
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



## Enum: FormatEnum

Name | Value
---- | -----
PDF | &quot;Pdf&quot;
HTML | &quot;Html&quot;
MHT | &quot;Mht&quot;
IMAGE | &quot;Image&quot;
BIFF8 | &quot;Biff8&quot;
CSV | &quot;Csv&quot;
DBF | &quot;Dbf&quot;
JSON | &quot;Json&quot;
LATEX | &quot;LaTeX&quot;
ODT | &quot;Odt&quot;
ODS | &quot;Ods&quot;
DOCX | &quot;Docx&quot;
PPTX | &quot;Pptx&quot;
XLSX | &quot;Xlsx&quot;
XPS | &quot;Xps&quot;
PPML | &quot;Ppml&quot;
PS | &quot;PS&quot;
RICHTEXT | &quot;Richtext&quot;
SVG | &quot;Svg&quot;
TEXT | &quot;Text&quot;
XAML | &quot;Xaml&quot;
XML | &quot;Xml&quot;
ZPL | &quot;Zpl&quot;



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
CRASHLOOP | &quot;CrashLoop&quot;



