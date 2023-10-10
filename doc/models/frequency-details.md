
# Frequency Details

This model contains frequency details of a specific word.

## Structure

`FrequencyDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Zipf` | `double` | Required | Explains the zipf score. | double getZipf() | setZipf(double zipf) |
| `PerMillion` | `double` | Required | Explains the perMillion score. | double getPerMillion() | setPerMillion(double perMillion) |
| `Diversity` | `double` | Required | Explains the diversity score. | double getDiversity() | setDiversity(double diversity) |

## Example (as JSON)

```json
{
  "zipf": 4.81,
  "perMillion": 64.22,
  "diversity": 0.2
}
```

