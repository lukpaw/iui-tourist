## Inteligentna Usługa Informacyjna - Turysta

Ten Spring Boot odpowiada za dostarczanie informacji turyście na podstawie zadanego pytania w języku pl, en, de.

### API

**Endpoint:** `/api/tourist/information`

**Metoda:** POST

**Przykładowy JSON wejściowy:**

```json
{
  "question": "What are the museums?",
  "sourceLanguage": "en"
}
```

**Przykładowy JSON wyjściowy:**

```json
{
  "results": [
    "Muzeum Zabawek i Zabawy",
    "Muzeum Historii Kielc",
    "Muzeum Hammonda",
    "Muzeum Wsi Kieleckiej",
    "Muzeum Stefana Żeromskiego",
    "Muzeum Diecezjalne"    
  ]
}
```

**Obsługiwane języki:**

* Polski (pl)
* Angielski (en)
* Niemiecki (de)

### Przykład użycia

1. Uruchom aplikację Spring Boot.
2. Wyślij żądanie POST do endpointu `/api/tourist/information` z JSONem wejściowym.
3. Aplikacja zwróci JSON z informacjami.