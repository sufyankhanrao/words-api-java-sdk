
# Pronunciation Details

This model contains pronunciation details of a specific word.

## Structure

`PronunciationDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `All` | `String` | Required | The pronunciation of the word. | String getAll() | setAll(String all) |
| `Noun` | `String` | Optional | The noun pronunciation of the word. | String getNoun() | setNoun(String noun) |
| `Verb` | `String` | Optional | The verb pronunciation of the word. | String getVerb() | setVerb(String verb) |

## Example (as JSON)

```json
{
  "all": "wɪnd",
  "noun": "wɪnd",
  "verb": "waɪnd"
}
```

