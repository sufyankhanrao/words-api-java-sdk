
# Synonyms Response

This custom type contains response for synonyms endpoint.

## Structure

`SynonymsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Word` | `String` | Required | The word that is searched. | String getWord() | setWord(String word) |
| `Synonyms` | `List<String>` | Required | The synonyms of the searched word. | List<String> getSynonyms() | setSynonyms(List<String> synonyms) |

## Example (as JSON)

```json
{
  "word": "lovely",
  "synonyms": [
    "adorable",
    "endearing",
    "cover girl",
    "pin-up"
  ]
}
```

